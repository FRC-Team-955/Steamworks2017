package components;

/**
 * The class bundles two CIMs together
 * @author Eva
 *
 */
public class TwoCIMGroup {
	CIM cimOne;
	CIM cimTwo;
	
	/**
	 * Constructor
	 * @param channelOne channel for the first CIM
	 * @param channelTwo channel for the second CIM
	 */
	public TwoCIMGroup(int channelOne, int channelTwo){
		cimOne = new CIM(channelOne);
		cimTwo = new CIM(channelTwo);
	}
	
	/**
	 * Calls the CIM ramp function
	 * @param speed the speed to be set
	 */
	public void ramp(double speed){
		cimOne.ramp(speed);
		cimTwo.ramp(speed);
	}
	
	/**
	 * Calls the CIM set function
	 * @param speed the speed to be set
	 */
	public void set(double speed){
		cimOne.set(speed);
		cimTwo.set(speed);
	}
}
