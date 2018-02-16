package C9_3_2ʹ��SAX���벢����XML�ĵ�;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//�Զ���SAX���������� 
class SAXHandler extends DefaultHandler { 
		public void startDocument() throws SAXException {
			System.out.println("��ʼ��ȡ�ĵ�...... "); 
			System.out.println("-----------------------------------------------");
		}  
		public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) 
				throws SAXException {
			System.out.println("<"+qName+">"); 
		}  
		public void characters(char[] ch, int start, int length) throws SAXException {
			String text = new String(ch,start,length); 
			//ȥ��xml�ļ��еĿո�ڵ� 
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
			System.out.println("��ȡ�ĵ�����������"); 
		} 
}