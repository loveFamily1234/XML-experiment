package C9_3_2使用SAX载入并遍历XML文档;

import java.io.IOException; 
import javax.xml.parsers.*; 
import org.xml.sax.SAXException; 

public class Main {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// 通过工厂获得SAX解析器  
		SAXParserFactory factory = SAXParserFactory.newInstance(); 
		SAXParser saxParser = factory.newSAXParser(); //解析器  
		// 通过解析器解析xml文件  
		saxParser.parse("src/C9_3_2使用SAX载入并遍历XML文档/9_3_1.xml", new SAXHandler()); //使用自定义的监听器 
	} 
} 
