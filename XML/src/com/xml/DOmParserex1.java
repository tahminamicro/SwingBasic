package com.xml;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOmParserex1 {

    public static void main(String[] args) {
        try {
            File inputFile = new File("tahmina.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root Element" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Staff");
            System.out.println("-------------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element:" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("Student roll No :" + eElement.getAttribute("id"));
                    System.out.println("First Name: " + eElement.getElementsByTagName("firstName").item(0).getTextContent());
                    System.out.println("Last Name: " + eElement.getElementsByTagName("lastName").item(0).getTextContent());

                    System.out.println("Nick Name: " + eElement.getElementsByTagName("nickName").item(0).getTextContent());
                    System.out.println("Salary: " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                    System.out.println("Country: " + eElement.getElementsByTagName("country").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
