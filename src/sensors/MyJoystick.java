package sensors;
 
 import config.JoyConfig;
 import edu.wpi.first.wpilibj.Joystick;
 
 /**
  * Interprets input from the joystick
  * @author Leo Morag
  */
public class MyJoystick extends Joystick {
	boolean[] currentJoystick = new boolean[JoyConfig.MaxButtonNumber];
	boolean[] previousJoystick = new boolean[JoyConfig.MaxButtonNumber];
	
	/**
	 * Constructor
	 * @param port The port number for the joystick
	 */
	public MyJoystick(int port){
		super(port);	
	}
	
	/**
	 * This function debounces the joystick
	 */
	public void update() {
		//Current and previous joystick values
		for(int i = 0; i < JoyConfig.MaxButtonNumber; i++){		//loop to debounce the joystick
			if(currentJoystick[i] && super.getRawButton(i)){
				currentJoystick[i] = false;
			}
			
			else{
				//updates current and previous values
				currentJoystick[i] = super.getRawButton(i);
				previousJoystick[i] = currentJoystick[i];
			}
		}

	}
	
	public boolean getButton(int button){
		return currentJoystick[button - 1];
		
	}
	
	public boolean getDPadUp(){
		return super.getPOV(0) == 0;
	}
	
	public boolean getDPadDown(){
		return super.getPOV(180) == 180;
	}
	
	public boolean getDPadLeft(){
		return super.getPOV(270) == 270;
	}
	
	public boolean getDPadRight(){
		return super.getPOV(90) == 90;
	}

	public double getRawLeftY(){
		return super.getRawAxis(JoyConfig.chnLeftY);
	}
	public double getRawLeftX(){
		return super.getRawAxis(JoyConfig.chnLeftX);
	}
	public double getRawRightY(){
		return super.getRawAxis(JoyConfig.chnRightY);
	}
	public double getRawRightX(){
		return super.getRawAxis(JoyConfig.chnRightX);
	}
}
