package XML;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class XMLEncoderDecoderExample
{
    public static void main(String[] args) throws IOException
    {
        UserSettings settings = new UserSettings();
        settings.setFieldOne(10000);
        settings.setFieldTwo("HowToDoInJava.com");
        settings.setFieldThree(false);
        
        UserSettings settings2 = new UserSettings();
        settings2.setFieldOne(100);
        settings2.setFieldTwo("data");
        settings2.setFieldThree(true);
         
        //Before
        System.out.println(settings);
        serializeToXML ( settings );
        UserSettings loadedSettings = deserializeFromXML();
        //After
        System.out.println(loadedSettings);
    }
     
    private static void serializeToXML (UserSettings settings) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("settings.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
                public void exceptionThrown(Exception e) {
                    System.out.println("Exception! :"+e.toString());
                }
        });
        encoder.writeObject(fos);
        encoder.close();
        fos.close();
    }
     
    private static UserSettings deserializeFromXML() throws IOException {
        FileInputStream fis = new FileInputStream("settings.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        UserSettings decodedSettings = (UserSettings) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedSettings;
    }
}