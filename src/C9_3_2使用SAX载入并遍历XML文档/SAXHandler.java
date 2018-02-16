package C9_3_2使用SAX载入并遍历XML文档;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//自定义SAX解析监听器 
class SAXHandler extends DefaultHandler { 
		public void startDocument() throws SAXException {
			System.out.println("开始读取文档...... "); 
			System.out.println("-----------------------------------------------");
		}  
		public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) 
				throws SAXException {
			System.out.println("<"+qName+">"); 
		}  
		public void characters(char[] ch, int start, int length) throws SAXException {
			String text = new String(ch,start,length); 
			//去掉xml文件中的空格节点 
			if(text.trim().equals("")) { 
				return; 
			}  
			System.out.println("      "+text); 
		}  
		public void endElement(String namespaceURI, String localName, String qName) throws SAXException { 
			System.out.println("</"+qName+">"); 
		}  
		public void endDocument() throws SAXException {
			System.out.println("-----------------------------------------------");
			System.out.println("读取文档结束！！！"); 
		} 
}