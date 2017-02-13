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
	Gear gear;
	Shooter shooter;
	
	/**
	 * constructor
	 * @param drive Drive object
	 */
	public Teleop(Drive drive, Intake intake, Agitator agitator, Gear gear, Shooter shooter){
		this.drive = drive;
		this.intake = intake;
		this.agitator = agitator;
		this.gear = gear;
		this.shooter = shooter;
	}
	
	/**
	 * periodically runs robot functions that require joystick input
	 */
	public void run(){
		driveTeleop();	
		intakeTeleop();
		agitatorTeleop();
		gearTeleop();
		shooterTeleop();
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
	
	public void gearTeleop() {
		if(joy.getRawButton(JoyConfig.gearOpenButton)) {
			gear.open();
		} else if(joy.getRawButton(JoyConfig.gearCloseButton)) {
			gear.close();
		}
	}
	
	public void shooterTeleop() {
		if(joy.getRawButton(JoyConfig.shooterStartButton)) {
			shooter.startShooter();
		} else if(joy.getRawButton(JoyConfig.shooterStopButton)) {
			shooter.stopShooter();
		}
	}
}
