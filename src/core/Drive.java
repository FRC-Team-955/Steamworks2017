package core;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import config.DriveConfig;

public class Drive {
	CANTalon leftDrive1 = new CANTalon(DriveConfig.leftTalonChn1);
	CANTalon leftDrive2 = new CANTalon(DriveConfig.leftTalonChn2);
	CANTalon rightDrive1 = new CANTalon(DriveConfig.rightTalonChn1);
	CANTalon rightDrive2 = new CANTalon(DriveConfig.rightTalonChn2);
	
	MotionProfileFollower leftFollower = new MotionProfileFollower(leftDrive1);
	MotionProfileFollower rightFollower = new MotionProfileFollower(rightDrive1);
	
	double xPos, yPos, x, y;
	
	public Drive() {
		leftDrive1.changeControlMode(TalonControlMode.PercentVbus);
		rightDrive1.changeControlMode(TalonControlMode.PercentVbus);
		leftDrive1.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		rightDrive1.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		leftDrive1.configEncoderCodesPerRev(DriveConfig.codesPerRev);
		rightDrive1.configEncoderCodesPerRev(DriveConfig.codesPerRev);
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
		
		if(leftDrive1.getControlMode() != TalonControlMode.MotionProfile) {
			ramp(-left, right);	
		}
	}
	
	public void set(double left, double right) {
		leftDrive1.set(left);
		rightDrive1.set(right);
	}
	
	public void motionProfileMode() {
		leftDrive1.changeControlMode(TalonControlMode.MotionProfile);
		
		CANTalon.SetValueMotionProfile leftSetOutput = leftFollower.getSetValue();

		rightDrive1.changeControlMode(TalonControlMode.MotionProfile);
		
		CANTalon.SetValueMotionProfile rightSetOutput = rightFollower.getSetValue();
				
		leftDrive1.set(leftSetOutput.value);
		rightDrive1.set(rightSetOutput.value);
	}
	
	public void driveMode() {
		leftDrive1.changeControlMode(TalonControlMode.PercentVbus);
		rightDrive1.changeControlMode(TalonControlMode.PercentVbus);
		
		leftFollower.reset();
		rightFollower.reset();
	}
	
	public void startMotionProfile() {
		leftFollower.startMotionProfile();
		rightFollower.startMotionProfile();
	}
	
	public void setPaths(double[][]left, double[][]right) {
		leftFollower.setPoints(left);
		rightFollower.setPoints(right);
	}
	
	public void ramp(double wantSpeedLeft, double wantSpeedRight){
		if(Math.abs(wantSpeedLeft - leftDrive1.get()) > DriveConfig.rampRate){
			
			if(wantSpeedLeft > leftDrive1.get())
				leftDrive1.set(leftDrive1.get() +  DriveConfig.rampRate);
			
			else
				leftDrive1.set(leftDrive1.get() - DriveConfig.rampRate);
			
		}
		
		else {
			leftDrive1.set(wantSpeedLeft);
		}
		
		if(Math.abs(wantSpeedRight - rightDrive1.get()) > DriveConfig.rampRate){
			
			if(wantSpeedRight > rightDrive1.get())
				rightDrive1.set(rightDrive1.get() +  DriveConfig.rampRate);
			
			else
				rightDrive1.set(rightDrive1.get() - DriveConfig.rampRate);
			
		}
		
		else {
			rightDrive1.set(wantSpeedRight);
		}
	}
}
