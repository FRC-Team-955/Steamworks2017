package core;

import config.IntakeConfig;
import components.CIM;
/**
 * 
 * @author Ajay 
 *
 */

public class Intake {
	private CIM cim = new CIM(IntakeConfig.chnIntake);
	
	/**
	 * sets the intake motor to a constant in IntakeConfig
	 */
	public void intakeStart(){
		cim.set(IntakeConfig.intakeSpeed);
	}
	
	/**
	 * stops intake motor
	 */
	public void intakeStop(){
		cim.set(0);
	}
	
	/**
	 * returns intake speed
	 * @return
	 */
	public double getIntakeSpeed(){
		return cim.getSpeed();
	}
	
	public void intakeToggle(){
		if(cim.get() == 0){
			intakeStart();
		}
		
		else{
			intakeStop();
		}
	}
}
