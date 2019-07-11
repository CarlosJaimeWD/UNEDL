package com.technicalkeeda.app;
 
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter;
import com.thoughtworks.xstream.io.xml.StaxDriver;
 
public class XmlTrasformer {
 
    public static void main(String[] args) {
        XmlTrasformer xmlTrasformer = new XmlTrasformer();
 
        Employee employee = new Employee();
        Address address = new Address();
        address.setAddressLine("Pradhikaran Nigdi");
        address.setState("Maharashtra");
        address.setCity("Pune");
        address.setPincode(400245);
 
        employee.setAddress(address);
        employee.setEmployeeId(1);
        employee.setFirstName("Yashwant");
        employee.setLastName("Chavan");
 
 
        String employeeXml = xmlTrasformer.objectToXml(employee);
        xmlTrasformer.writeFile(employeeXml);
        Employee returnValue = xmlTrasformer.xmlToObject("employee.xml");
        System.out.println("Xml to Employee\n" + returnValue);
 
 
    }
 
    /* Xml to Object*/
    public Employee xmlToObject(String xmlFileName) {
        XStream xstream = new XStream(new StaxDriver());
        xstream.registerConverter(new EncodedByteArrayConverter());
        xstream.alias("Employee", Employee.class);
        Employee employee = null;
        try {
            employee = (Employee) xstream.fromXML(new FileReader(xmlFileName));
 
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException Occured" + e.getMessage());
        }
        return employee;
    }
 
 
    /* Object to Xml*/
    public String objectToXml(Employee employee) {
        XStream xstream = new XStream();
        xstream.alias("Employee", Employee.class);
        return xstream.toXML(employee);
 
    }
 
    /* Write xml String into file*/
    public void writeFile(String xmlString) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("employee.xml"));
            out.write(xmlString);
        } catch (IOException e) {
            System.out.println("IOException Occured" + e.getMessage());
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
                System.out.println("IOException Occured" + e.getMessage());
            }
        }
    }
 
}