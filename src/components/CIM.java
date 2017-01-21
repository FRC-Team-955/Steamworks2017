package components;

import config.CIMConfig;
import edu.wpi.first.wpilibj.TalonSRX;

/**
 * adds ramp functionality to the TalonSRX Class
 * @author Ajay
 *
 */
public class CIM extends TalonSRX {
	
	/**
	 * constructor
	 * @param channel the channel number for Talon 
	 * 
	 */
	public CIM(int channel){
		super(channel);	
	}
	
	/**
	 * changes motor speed in small increments
	 * @param wantSpeed requested set speed 
	 */
	public void ramp(double wantSpeed){
		 if(Math.abs(super.getSpeed() - wantSpeed) < CIMConfig.rampConstant){
			 super.setSpeed(wantSpeed);
		 }
		 
		 else{
			 if(super.getSpeed() - wantSpeed < 0){
				 super.setSpeed(super.getSpeed() + CIMConfig.rampConstant);
			 }
			 
			 else{
				 super.setSpeed(super.getSpeed() - CIMConfig.rampConstant);
			 }
			 
		 }
	}
}