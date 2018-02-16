package C9_3_1_2使用DOM插入新元素;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import org.apache.crimson.tree.*;

public class dom {
	public static void main(String[] args) {
		Element items = null;
		Element item = null;
		Element productName = null;
		Element quantity = null;
		Element USPrice = null;
		Element shipDate = null;
		try{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("src/C9_3_1_2使用DOM插入新元素/9_3_1.xml");
			items = (Element)doc.getElementsByTagName("items").item(0);
			
			item = doc.createElement("item");
			item.setAttribute("partNum", "926-AA");
			
			productName = doc.createElement("productName");
			productName.appendChild(doc.createTextNode("Baby Monitor"));
			item.appendChild(productName);
			
			quantity = doc.createElement("quantity");
			quantity.appendChild(doc.createTextNode("1"));
			item.appendChild(quantity);
			
			USPrice = doc.createElement("USPrice");
			USPrice.appendChild(doc.createTextNode("39.98"));
			item.appendChild(USPrice);
			
			shipDate = doc.createElement("shipDate");
			shipDate.appendChild(doc.createTextNode("1999-05-21"));
			item.appendChild(shipDate);
			
			items.appendChild(item);
			((XmlDocument)doc).write(new FileOutputStream("src/C9_3_1_2使用DOM插入新元素/changed.xml"));
			System.out.println("插入完毕！！！");
		}catch(Exception e){
			e.printStackTrace();
		}
				
	}

}
