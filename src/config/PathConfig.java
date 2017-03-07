package config;

public class PathConfig {
	public static final double dt = 0.05; // How many seconds each segment lasts for
	public static final double maxVel = 70; // inches/second
	public static final double maxAcc = 50; // (inches/second) / second
	public static final int numPointsCircle = 1000; // More means more time but smoother curves, won't converge if too low
	public static final int numPointsTan = 5000; 
	public static final int numPointsTrans = 10; 
	public static final double transDist = 3; 
	public static final double circleRad = 40; 
	public static final double offsetFromGear = 5; // How many inches from the tape we want to stop
	public static final double robotTrackWidth = 31; // inches between drivebase wheels, from center of wheels

}
