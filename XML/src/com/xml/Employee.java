
package com.xml;


import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Employee {
    public static void main(String[] args) throws TransformerConfigurationException {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
         Document doc = docBuilder.newDocument();
         
         Element rootElement = doc.createElement("Company");
         doc.appendChild(rootElement);
         
         Element staff = doc.createElement("Staff");
         rootElement.appendChild(staff);
         
         Attr attr = doc.createAttribute("id");
         attr.setValue("1000");
         staff.setAttributeNode(attr);
         
         Element firstName= doc.createElement("firstName");
         firstName.appendChild(doc.createTextNode("Tahmina"));
         staff.appendChild(firstName);
         
         Element lastName= doc.createElement("lastName");
         lastName.appendChild(doc.createTextNode("Sultana"));
         staff.appendChild(lastName);
         
         Element nickName= doc.createElement("nickName");
         nickName.appendChild(doc.createTextNode("Chonda"));
         staff.appendChild(nickName);
         
         Element salary= doc.createElement("salary");
         salary.appendChild(doc.createTextNode("100000000"));
         staff.appendChild(salary);
         
        
         Element country= doc.createElement("country");
         country.appendChild(doc.createTextNode("Bangladesh"));
         staff.appendChild(country);
         
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("tahmina.xml"));
            
            transformer.transform(source, result);
            
            System.out.println("File Saved!");
           
            
            
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
