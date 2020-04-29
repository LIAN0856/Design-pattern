package Factory;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtil
{
//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean() {
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc;
			doc=builder.parse(new File("configFactory.xml"));
			
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