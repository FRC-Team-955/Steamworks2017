package vision;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLParser {
	VisionStruct vs = new VisionStruct();
	
	public VisionStruct parseString(String xml) {
		
		try {
			Document doc = stringToDoc(xml);
			doc.getDocumentElement().normalize();
	
			NodeList goalList = doc.getElementsByTagName("Root");
			vs.update((Element) goalList.item(0));
	
		} catch (Exception e) {
//			e.printStackTrace();
		}

		return vs;
	}

	public static Document stringToDoc(String xml) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xml));
		return builder.parse(is);
	}
}
