/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlfull;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author carlosjaime
 */
public class xml1 {
    public static void main (String args[]) {
        try{
    //creating the JAXB context
    JAXBContext jContext = JAXBContext.newInstance(Student.class);
    //creating the marshaller object
    Marshaller marshallObj = jContext.createMarshaller();
    //setting the property to show xml format output
    marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    //setting the values in POJO class
    Student student = new Student("abhishek", 1163, "hadoop");
    //calling the marshall method
    marshallObj.marshal(student, new FileOutputStream("student.xml"));
} catch(Exception e) {
    e.printStackTrace();
}
        
        
try{
    //getting the xml file to read
    File file = new File("student.xml");
    //creating the JAXB context
    JAXBContext jContext = JAXBContext.newInstance(Student.class);
    //creating the unmarshall object
    Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
    //calling the unmarshall method
    Student student=(Student) unmarshallerObj.unmarshal(file);
    System.out.println(student.getName()+" "+student.getId()+" "+student.getSubject());
}catch(Exception e){
    e.printStackTrace();
}
    }
}
