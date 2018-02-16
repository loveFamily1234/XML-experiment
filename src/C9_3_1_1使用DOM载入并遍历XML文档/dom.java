package C9_3_1_1ʹ��DOM���벢����XML�ĵ�;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class dom {
	public static void main(String[] args) {
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("src/C9_3_1_1ʹ��DOM���벢����XML�ĵ�/9_3_1.xml");
			System.out.println(doc.getImplementation());
			NodeList nl = doc.getElementsByTagName("shipTo");
			Element node1 = (Element)nl.item(0);
			System.out.println("-----------------------------------------");
			System.out.println(">>>shipTo�е����Լ�Ԫ�أ�");
			System.out.println(">���ԣ�");
			System.out.print("country:");
			System.out.println(node1.getAttribute("country"));
			System.out.println(">Ԫ�أ�");
			System.out.print("name:");
			System.out.println(node1.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
			System.out.print("street:");
			System.out.println(node1.getElementsByTagName("street").item(0).getFirstChild().getNodeValue());
			System.out.print("city:");
			System.out.println(node1.getElementsByTagName("city").item(0).getFirstChild().getNodeValue());
			System.out.print("state:");
			System.out.println(node1.getElementsByTagName("state").item(0).getFirstChild().getNodeValue());
			System.out.print("zip:");
			System.out.println(node1.getElementsByTagName("zip").item(0).getFirstChild().getNodeValue());
			
			Element node2 = (Element)doc.getElementsByTagName("billTo").item(0);
			System.out.println("-----------------------------------------");
			System.out.println(">>>billTo�е����Լ�Ԫ�أ�");
			System.out.println(">���ԣ�");
			System.out.print("country:");
			System.out.println(node2.getAttribute("country"));
			System.out.println(">Ԫ�أ�");
			System.out.print("name:");
			System.out.println(node2.getElementsByTagName("name").item(0).getFirstChild().getNodeValue());
			System.out.print("street:");
			System.out.println(node2.getElementsByTagName("street").item(0).getFirstChild().getNodeValue());
			System.out.print("city:");
			System.out.println(node2.getElementsByTagName("city").item(0).getFirstChild().getNodeValue());
			System.out.print("state:");
			System.out.println(node2.getElementsByTagName("state").item(0).getFirstChild().getNodeValue());
			System.out.print("zip:");
			System.out.println(node2.getElementsByTagName("zip").item(0).getFirstChild().getNodeValue());
			
			Element node3 = (Element)doc.getElementsByTagName("comment").item(0);
			System.out.println("-----------------------------------------");
			System.out.println(">>>commentԪ�أ�");
			System.out.print("comment:");
			System.out.println(node3.getFirstChild().getNodeValue());
			
			Element node4 = (Element)doc.getElementsByTagName("items").item(0);
			Element node5 = (Element)node4.getElementsByTagName("item").item(0);
			System.out.println("-----------------------------------------");
			System.out.println(">>>items�е�item�����Լ�Ԫ�أ�");
			System.out.println(">���ԣ�");
			System.out.print("partNum:");
			System.out.println(node5.getAttribute("partNum"));
			System.out.println(">Ԫ�أ�");
			System.out.print("productName:");
			System.out.println(node5.getElementsByTagName("productName").item(0).getFirstChild().getNodeValue());
			System.out.print("quantity:");
			System.out.println(node5.getElementsByTagName("quantity").item(0).getFirstChild().getNodeValue());
			System.out.print("USPrice:");
			System.out.println(node5.getElementsByTagName("USPrice").item(0).getFirstChild().getNodeValue());
			System.out.print("comment:");
			System.out.println(node5.getElementsByTagName("comment").item(0).getFirstChild().getNodeValue());
			
			System.out.println("-----------------------------------------");
			System.out.println("���벢�������ĵ���ϣ�����");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
