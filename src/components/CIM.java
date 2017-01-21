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
		 if(Math.abs(super.get() - wantSpeed) < CIMConfig.rampConstant){
			 super.set(wantSpeed);
		 }
		 
		 else{
			 if(super.get() - wantSpeed < 0){
				 super.set(super.get() + CIMConfig.rampConstant);
			 }
			 
			 else{
				 super.set(super.get() - CIMConfig.rampConstant);
			 }
			 
		 }
	}
}