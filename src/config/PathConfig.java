package config;

public class PathConfig {
	public static final double dt = 0.025; // How many seconds each segment lasts for
	public static final double maxVel = 40; // inches/second
	public static final double maxAcc = 60; // (inches/second) / second
	public static final int numPointsCircle = 1000; // More means more time but smoother curves, won't converge if too low
	public static final int numPointsTan = 5000; 
	public static final int numPointsTrans = 10; 
	public static final double transDist = 3;
	public static final double circleRad = 40;
	public static final int robotTrackWidth = 31; // Feet between drivebase wheels, from center of wheels
}
