package config;

public class PathConfig {
	public static final double dt = 0.025; // How many seconds each segment lasts for
	public static final double maxVel = 10; // Feet/second
	public static final double maxAcc = 10; // (Feet/second) / second
	public static final int numPoints = 20000; // More means more time but smoother curves, won't converge if too low
	public static final int robotTrackWidth = 2; // Feet between drivebase wheels, from center of wheels
}
