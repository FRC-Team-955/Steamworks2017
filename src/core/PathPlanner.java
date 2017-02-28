package core;

import java.util.ArrayList;

import config.PathConfig;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PathPlanner {
	private double dt, maxVel, maxAcc, maxJerk, robotTrackWidth;
	private double[][] leftPath, rightPath, leftProfile, rightProfile;
	
	/**
	 * 
	 * @param dt Time for each segment to execute
	 * @param maxVel Max velocity in fps
	 * @param maxAcc Max acceleration in feet/sec^2
	 * @param maxJerk Max jerk
	 * @param robotTrackWidth Width of robot in feet
	 */
	public PathPlanner(double dt, double maxVel, double maxAcc, double maxJerk, double robotTrackWidth) {
		this.dt = dt;
		this.robotTrackWidth = robotTrackWidth;
		this.maxVel = maxVel;
		this.maxAcc = maxAcc;
		this.maxJerk = maxJerk;
	}
	
	public double[][] generatePathPoints(int numPointsCircle, int numPointsTan, int numPointsTransition, double offset, double distance, double robotAngle) {
		double[][] points = new double[numPointsCircle + numPointsTan + numPointsTransition][2];
		double radius = PathConfig.circleRad;
		double transitionDistance = PathConfig.transDist;
		
		double startPoint = radius * Math.sin(robotAngle);
		double x = startPoint;
		double startY = -1 * Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2)) + radius;
		for(int i = 0; i < numPointsCircle; i++) {
			points[i][1] = -1 * Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2)) + radius - startY;
			if(robotAngle < Math.PI/2) {
				points[i][0] = x - startPoint;
				x += (radius - startPoint) / numPointsCircle;
			} else {
				points[i][0] = x - startPoint;
				x -= (radius + startPoint) / numPointsCircle;
			}
		}
		
		double y = points[numPointsCircle - 1][1];
		for(int i = numPointsCircle; i < numPointsTransition + numPointsCircle; i++) {
			points[i][1] = y;
			points[i][0] = points[numPointsCircle - 1][0];
			y += transitionDistance/numPointsTransition;
		}
		
		double tanOffset = offset - points[numPointsTransition + numPointsCircle - 1][0];
		double tanDistance = distance - points[numPointsTransition + numPointsCircle - 1][1];
		x = -0.5 * tanOffset;
		double vertStretch = 0.125 * tanDistance;
		double horzStretch = 1.185 * tanOffset;

		for(int i = numPointsTransition + numPointsCircle; i < numPointsTan + numPointsCircle + numPointsTransition; i++) {
			points[i][1] = vertStretch * Math.tan((Math.PI * x) / horzStretch) + (0.5 * tanDistance) + points[numPointsTransition + numPointsCircle - 1][1];
			points[i][0] = x + (tanOffset/2) + points[numPointsTransition + numPointsCircle - 1][0];
			x += ((tanOffset) / (numPointsTan));	
		}	
		
		return points;
	}
	
	/**
	 * Uses leftPath and rightPath arrays to determine motion profile
	 * @return path 2d array with left pos then velocity, then right. Example: {LeftPos, LeftVel, RightPos, RightVel}
	 */
	private double[][] generateMotionProfile() {
		double[][] leftRightPosVel = new double[leftPath.length][4];
		double leftPos = 0;
		double rightPos = 0;
		double leftPosChange = 0;
		double rightPosChange = 0;
		
		for(int i = 0; i < leftPath.length-1; i++) {
			leftPosChange = Math.sqrt(Math.pow((leftPath[i+1][0] - leftPath[i][0]),2) + Math.pow((leftPath[i+1][1] - leftPath[i][1]),2));
			leftPos += leftPosChange;
			leftRightPosVel[i][0] = leftPos;
			leftRightPosVel[i][1] = leftPosChange/dt * 60; // Talon is in rpm

			rightPosChange = Math.sqrt(Math.pow((rightPath[i+1][0] - rightPath[i][0]),2) + Math.pow((rightPath[i+1][1] - rightPath[i][1]),2));
			rightPos += rightPosChange;
			leftRightPosVel[i][2] = rightPos;
			leftRightPosVel[i][3] = rightPosChange/dt * 60; // Talon is in rpm
		}
		
		leftRightPosVel[leftRightPosVel.length-1][0] = leftPos;
		leftRightPosVel[leftRightPosVel.length-1][1] = 0;
		leftRightPosVel[leftRightPosVel.length-1][2] = rightPos;
		leftRightPosVel[leftRightPosVel.length-1][3] = 0;
		
		return leftRightPosVel;
	}
	
	public double[][] removePoints(double[][] path, double currentVel) {
		double distance = 0;
		double lastVel = currentVel;
		double segDistance = 0;
		ArrayList<double[]> traj = new ArrayList<double[]>();
		traj.add(new double[] {0,0});
		
		for(int i = 0; i < path.length-1; i++) {
			segDistance = Math.sqrt(Math.pow((path[i+1][0] - path[i][0]),2) + Math.pow((path[i+1][1] - path[i][1]),2));
			distance += segDistance;
			//System.out.println("distance/dt = " + (distance/dt) + "\t\t\tacceleration = " + ((distance/dt) - lastVel) + "\t\t\tlastVel = " + lastVel);
			
			if(distance/dt > maxVel || (distance/dt) - lastVel > maxAcc * dt) {
				traj.add(new double[] {path[i][0], path[i][1]});
				//System.out.println("distance/dt = " + (distance/dt) + "\t\t\tacceleration = " + ((distance/dt) - lastVel) + "\t\tlastVel = " + lastVel + "\t\tindex: " + i);
				lastVel = (distance - segDistance)/dt;
				distance = 0;
				i--;
			}
		}
		
		return traj.toArray(new double[traj.size()][2]);
	}
	
	private void leftRight(double[][] smoothPath) {
		double[][] leftPath = new double[smoothPath.length][2];
		double[][] rightPath = new double[smoothPath.length][2];

		double[][] gradient = new double[smoothPath.length][2];

		for(int i = 0; i<smoothPath.length-1; i++) {
			gradient[i][1] = Math.atan2(smoothPath[i+1][1] - smoothPath[i][1],smoothPath[i+1][0] - smoothPath[i][0]);	
		}

		gradient[gradient.length-1][1] = gradient[gradient.length-2][1];


		for (int i=0; i<gradient.length; i++) {
			leftPath[i][0] = (robotTrackWidth/2 * Math.cos(gradient[i][1] + Math.PI/2)) + smoothPath[i][0];
			leftPath[i][1] = (robotTrackWidth/2 * Math.sin(gradient[i][1] + Math.PI/2)) + smoothPath[i][1];

			rightPath[i][0] = robotTrackWidth/2 * Math.cos(gradient[i][1] - Math.PI/2) + smoothPath[i][0];
			rightPath[i][1] = robotTrackWidth/2 * Math.sin(gradient[i][1] - Math.PI/2) + smoothPath[i][1];

			//convert to degrees 0 to 360 where 0 degrees is +X - axis, accumulated to aline with WPI sensor
			double deg = Math.toDegrees(gradient[i][1]);

			gradient[i][1] = deg;

			if(i>0)
			{
				if((deg-gradient[i-1][1])>180)
					gradient[i][1] = -360+deg;

				if((deg-gradient[i-1][1])<-180)
					gradient[i][1] = 360+deg;
			}
		}

		this.rightPath = rightPath;
		this.leftPath = leftPath;
	}
	
	private void generateProfileArray(double[][] leftRightPosVel) {
		leftProfile = new double[leftRightPosVel.length][3];
		rightProfile = new double[leftRightPosVel.length][3];
		
		for(int i = 0; i < leftRightPosVel.length; i++) {
			leftProfile[i][0] = leftRightPosVel[i][0];
			leftProfile[i][1] = leftRightPosVel[i][1];
			leftProfile[i][2] = dt;
			
			rightProfile[i][0] = leftRightPosVel[i][2];
			rightProfile[i][1] = leftRightPosVel[i][3];
			rightProfile[i][2] = dt;
		}
	}
	
	public void generateProfileFromDistances(int numPointsCircle, int numPointsTan, int numPointsTransition, double offset, double distance, double robotAng) {
		SmartDashboard.putString("profileGenerating", "Generating");
		leftRight(removePoints(generatePathPoints(numPointsCircle, numPointsTan, numPointsTransition, offset, distance, Math.toRadians(robotAng)), 0));
		generateProfileArray(generateMotionProfile());
		SmartDashboard.putString("profileGenerating", "Done Generating");
	}
	
	public double[][] getLeftProfile() {
		return leftProfile;
	}
	
	public double[][] getRightProfile() {
		return rightProfile;
	}
	
	
}
