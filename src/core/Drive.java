package core;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import config.DriveConfig;

public class Drive {
	CANTalon leftDrive1 = new CANTalon(DriveConfig.leftTalonChn1);
	CANTalon leftDrive2 = new CANTalon(DriveConfig.leftTalonChn2);
	CANTalon rightDrive1 = new CANTalon(DriveConfig.rightTalonChn1);
	CANTalon rightDrive2 = new CANTalon(DriveConfig.rightTalonChn2);
	
	double xPos, yPos, x, y;
	
	public Drive() {
		leftDrive1.changeControlMode(TalonControlMode.PercentVbus);
		rightDrive1.changeControlMode(TalonControlMode.PercentVbus);
		leftDrive2.changeControlMode(TalonControlMode.Follower);
		rightDrive2.changeControlMode(TalonControlMode.Follower);
		leftDrive2.set(DriveConfig.leftTalonChn1);
		rightDrive2.set(DriveConfig.rightTalonChn1);
	}
	
	public void move(double r, double theta) {
		
		xPos = r*Math.cos(theta);
		yPos = r*Math.sin(theta);
		
		x = xPos * Math.abs(xPos);
		y = yPos * Math.abs(yPos);		
		
		double left = y + x;
		double right = y - x;

        leftDrive1.set(left);
        rightDrive1.set(right);
        
	}
	
	public void set(double left, double right) {
		leftDrive1.set(left);
		rightDrive1.set(right);
	}
}
