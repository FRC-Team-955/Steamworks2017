package auto;

import edu.wpi.first.wpilibj.Timer;
import core.Drive;
import core.Gear;

public class Auto {
	public Drive drive;
	public Gear gear;
	Timer timer = new Timer();
	
	public Auto(Drive drive, Gear gear) {
		this.drive = drive;
		this.gear = gear;
	}
	
	public void init() {
		timer.start();
		drive.setPaths(MiddleGearAuto.leftPath, MiddleGearAuto.rightPath);
	}
	
	public void run() {
		drive.motionProfileMode();
		
		if(timer.get() > 1) {
			drive.startMotionProfile();
			timer.reset();
			timer.stop();
		}
	}
}
