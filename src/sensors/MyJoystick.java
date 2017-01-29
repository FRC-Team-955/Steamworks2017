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
		for(int i = 1; i < JoyConfig.MaxButtonNumber; i++){		//loop to debounce the joystick
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

}
