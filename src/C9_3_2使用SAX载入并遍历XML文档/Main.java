package C9_3_2ʹ��SAX���벢����XML�ĵ�;

import java.io.IOException; 
import javax.xml.parsers.*; 
import org.xml.sax.SAXException; 

public class Main {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// ͨ���������SAX������  
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		SAXParser saxParser = factory.newSAXParser(); //������  
		// ͨ������������xml�ļ�  
		saxParser.parse("src/C9_3_2ʹ��SAX���벢����XML�ĵ�/9_3_1.xml", new SAXHandler()); //ʹ���Զ���ļ����� 
	} 
} 
