package C9_3_3ʹ��JDOM����һ��XML�ĵ�;

import org.jdom2.*;  
import org.jdom2.output.*;  
import java.io.*;   

public class JDOM {
	public void BuildXML() throws Exception {
		Element root, student, number, name, age;
		root = new Element("student-info");
		student = new Element("student");
		number = new Element("number");
		name = new Element("name");
		age = new Element("age");
		Document doc = new Document(root);
		number.setText("001");
		name.setText("lnman");
		age.setText("24");
		student.addContent(number);
		student.addContent(name);
		student.addContent(age);
		root.addContent(student);
		Format format = Format.getCompactFormat();
		format.setEncoding("gb2312");
		format.setIndent("   ");
		XMLOutputter XMLOut = new XMLOutputter(format);
		XMLOut.output(doc, new FileOutputStream("src/C9_3_3ʹ��JDOM����һ��XML�ĵ�/studentinfo.xml"));
	}

	public static void main(String[] args) throws Exception {
		JDOM w = new JDOM();
		System.out.println("��������XML�ĵ�.....");
		w.BuildXML();
		System.out.println("....................");
		System.out.println("....................");
		System.out.println("....................");
		System.out.println("....................");
		System.out.println("....................");
		System.out.println("....................");
		System.out.println("�ĵ������ɣ�����");
	}
}
