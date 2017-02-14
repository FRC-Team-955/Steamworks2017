package vision;

import org.w3c.dom.Element;

import config.VisionConfig;


public class VisionStruct {
	
	private double distX, distY, ang;
	private int timeMs;
	private String tapeStatus;
	
	public double getDistX() {
		return distX;
	}
	
	public double getDistY() {
		return distY;
	}
	
	public double ang() {
		return ang;
	}
	
	public int timeMs() {
		return timeMs;
	}
	
	public String tapeStatus() {
		return tapeStatus;
	}
	
	public void update(double distX, double distY, double ang, int timeMs, String tapeStatus) {
		this.distX = distX;
		this.distY = distY;
		this.ang = ang;
		this.timeMs = timeMs;
		this.tapeStatus = tapeStatus;
	}
	
	public void update(Element n) {
		try {
			distX = Double.parseDouble(n.getAttribute("distX"));
			distY = Double.parseDouble(n.getAttribute("distY"));
			ang = Double.parseDouble(n.getAttribute("ang"));
			timeMs = Integer.parseInt(n.getAttribute("timeMs"));
			tapeStatus = n.getAttribute("distX");
		} catch(NumberFormatException e) {
			//Parsing empty string
			System.out.println("NumberFormatException: string from vision is empty");
		} catch(Exception e) {
			//Do something here
			System.out.println("Exception while parsing xml");
		}
	}
}