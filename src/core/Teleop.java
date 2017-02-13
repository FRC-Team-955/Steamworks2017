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
	Agitator agitator;
	
	/**
	 * constructor
	 * @param drive Drive object
	 */
	public Teleop(Drive drive, Intake intake, Agitator agitator){
		this.drive = drive;
		this.intake = intake;
		this.agitator = agitator;
	}
	
	/**
	 * periodically runs robot functions that require joystick input
	 */
	public void run(){
		driveTeleop();			
	}
	
	public void driveTeleop() {
		double[] rTheta = joy.getRTheta();
		drive.move(rTheta[0],rTheta[1]);
	}
	
	public void intakeTeleop() {
		if(joy.getRawButton(JoyConfig.intakeOnButton)) {
			intake.intakeStart();
		} else if(joy.getRawButton(JoyConfig.intakeOffButton)) {
			intake.intakeStop();
		}
	}
	
	public void agitatorTeleop() {
		if(joy.getRawButton(JoyConfig.agitatorOnButton)) {
			agitator.startAgitator();	
		} else if(joy.getRawButton(JoyConfig.agitatorOffButton)) {
			agitator.stopAgitator();
		}
	}
	
	
	
	
}
