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
	
	/**
	 * constructor
	 * @param drive Drive object
	 */
	public Teleop(Drive drive){
		this.drive = drive;
	}
	
	/**
	 * periodically runs robot functions that require joystick input
	 */
	public void run(){
		double [] bean= getRTheta(joy.getRawLeftY(),joy.getRawRightX());
		drive.driveRTheta(bean[0],bean[1]);
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
