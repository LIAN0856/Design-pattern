package Bui;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean() {
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc;
			doc=builder.parse(new File("configBui.xml"));
			
			NodeList n= doc.getElementsByTagName("className");
			Node classNode=n.item(0).getFirstChild();
			
			String cName=classNode.getNodeValue();
			
			Class c=Class.forName(cName);
			
			Object obj=c.newInstance();
			
			return obj;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
