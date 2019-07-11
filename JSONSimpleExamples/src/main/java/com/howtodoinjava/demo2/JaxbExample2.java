package com.howtodoinjava.demo2;
 
import java.io.File;
import java.io.StringWriter;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
 
public class JaxbExample2
{
    public static void main(String[] args)
    {
        String fileName = "employee.xml";
 
//Call method which read the XML file above
jaxbXmlFileToObject(fileName);
    }
 
   
 
private static void jaxbXmlFileToObject(String fileName) {
         
        File xmlFile = new File(fileName);
         
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Employee.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee employee = (Employee) jaxbUnmarshaller.unmarshal(xmlFile);
             
            System.out.println(employee);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}