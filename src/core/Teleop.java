package core;
import sensors.MyJoystick;
import vision.VisionCore;
import config.JoyConfig;
import config.PathConfig;

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
	PathPlanner planner;
	VisionCore vision;
	Climber climber;
	
	private boolean notStarted = true;
	
	/**
	 * constructor
	 * @param drive Drive object
	 */
	public Teleop(Drive drive, Intake intake, Agitator agitator, Gear gear, Shooter shooter,  PathPlanner planner, VisionCore vision, Climber climber){
		this.drive = drive;
		this.intake = intake;
		this.agitator = agitator;
		this.gear = gear;
		this.shooter = shooter;
		this.planner = planner;
		this.vision = vision;
		this.climber = climber;
	}
	
	/**
	 * periodically runs robot functions that require joystick input
	 */
	public void run(){
		driveTeleop();	
		intakeTeleop();
		agitatorTeleop();
		gearTeleop();
		//shooterTeleop();
		climberTeleop();
		vision.update();
	}
	
	public void climberTeleop() {
		if(joy.getRawButton(JoyConfig.climbButton)) {
			climber.startClimber();
		} else if(joy.getRawButton(JoyConfig.climbSlowButton)) {
			climber.startClimberSlow();
		} else if(joy.getDpadDown()){
			climber.stopClimber();
		}
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
		
		
		// Path planning with vision to drop off gear
		if(joy.getButton(JoyConfig.generatePathButton) && vision.getVisionStruct().tapeStatus().equalsIgnoreCase("both")) {
			planner.generateProfileFromDistances(PathConfig.numPointsCircle, PathConfig.numPointsTan, PathConfig.numPointsTrans, vision.getVisionStruct().getDistX(), vision.getVisionStruct().getDistY(), vision.getVisionStruct().ang());
			drive.setPaths(planner.getLeftProfile(), planner.getRightProfile());
		} if(joy.getRawButton(JoyConfig.followPathButton)) {
			drive.motionProfileMode();
			if(notStarted) {
				notStarted = false;
				drive.startMotionProfile();	
			}
		} else {
			drive.driveMode();
			notStarted = true;
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
