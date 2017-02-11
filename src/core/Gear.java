package core;

import config.GearConfig;
import  edu.wpi.first.wpilibj.Servo;

public class Gear {
	private Servo servoLeft;
	private Servo servoRight;
	
	public void open(){
		servoLeft.setAngle(GearConfig.gearServoAngleLeft);
		servoRight.setAngle(GearConfig.gearServoAngleRight);
	}
	public void close(){
		servoLeft.setAngle(0);
		servoRight.setAngle(0);
	}
	public void toggle(){
		if (servoLeft.getAngle() == 0){
			open();	
		}
		else
			close();
	}
}
