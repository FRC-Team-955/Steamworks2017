package vision;

import java.rmi.server.ServerCloneException;

import config.DriveConfig;
import config.VisionConfig;

public class VisionCore {
	private XMLParser xmlParser = new XMLParser();
	private VisionStruct vs = new VisionStruct();
	private SocketCore socket = new SocketCore();

	public VisionCore() {	
		new Thread(socket).start();		
	}
	
	public VisionStruct getVisionStruct() {
		return vs;
	}
	
	public void update() {
		System.out.println(socket.getXML());
		try{
			vs = xmlParser.parseString(socket.getXML());
		} catch(Exception e) {
			
		}
	}
	
}
