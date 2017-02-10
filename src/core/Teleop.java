package core;
import sensors.MyJoystick;

import config.JoyConfig;

/**
 * @author Jessie
 * intergrate joystick input;
 */
public class Teleop {
	MyJoystick joy = new MyJoystick(JoyConfig.portNum);
	Drive drive;
	Intake intake;
	
	/**
	 * constructor
	 * @param drive Drive object
	 */
	public Teleop(Drive drive, Intake intake){
		this.drive = drive;
		this.intake = intake;
	}
	
	/**
	 * periodically runs robot functions that require joystick input
	 */
	public void run(){
		double[] rTheta = getRTheta(joy.getRawLeftY(),joy.getRawRightX());
		drive.driveRTheta(rTheta[0],rTheta[1]);
		
		if(joy.getRawButton(JoyConfig.intakeButton)){
			intakeToggle();
		}
			
	}
	
	/**
	 * toggles intake motor
	 */
	public void intakeToggle(){
		if(intake.getIntakeSpeed() == 0){
			intake.intakeStart();
		}
		
		else{
			intake.intakeStop();
		}
	}
	
	/**
	 * converts left and right to r and Theta. Yay.
	 * @param y=y value for the joystick
	 * @param x=x value for the joystick
	 * @return double array of r and theta
	 */
	public double[] getRTheta(double y, double x){
		double r = Math.sqrt(y*y + x*x);
		double theta = Math.atan(x/y);
		
		if (joy.getRawRightX()<0){
			theta+=Math.PI;
		}
		 double[] rTheta = {r, theta};
		 return rTheta;
		
	}
}
