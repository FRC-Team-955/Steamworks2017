package auto;

import edu.wpi.first.wpilibj.Timer;
import config.AutoConfig;
import core.Drive;
import core.Gear;

public class Auto {
	public Drive drive;
	public Gear gear;
	Timer timer = new Timer();
	public int step = 0;
	
	public Auto(Drive drive, Gear gear) {
		this.drive = drive;
		this.gear = gear;
	}
	
	public void init() {
		timer.start();
		int autoId = AutoChooser.getAutoId();
		
		switch(autoId) {
		case AutoConfig.doNothingId:
			step = 1000;
			break;
		case AutoConfig.middleGearId:
			step = 0;
			drive.setPaths(MiddleGearAuto.leftPath, MiddleGearAuto.rightPath);			
		}
	}
	
	public void run() {
		drive.motionProfileMode();
		
		switch (step) {
		case 0:
			if(timer.get() > 0.2) {
				drive.startMotionProfile();
				timer.reset();
				timer.stop();
				step++;
			}
			break;

		case 1:
			if(drive.getSetValue() == 2) {
				//gear.close();
				step++;
			}
		default:
			break;
		}
		
		
	}
}
