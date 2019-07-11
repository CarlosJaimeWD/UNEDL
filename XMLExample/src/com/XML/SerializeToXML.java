
package com.XML;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class SerializeToXML {
    private static final String SERIALIZED_FILE_NAME="settings.xml";

	public static void main(String args[]){

		empleados e1=new empleados(1,"carlos", "jaime");
		empleados e2=new empleados(2, "pepe", "garcia");


		List list=new ArrayList();
		list.add(e1);
		list.add(e2);


		DVD se=new DVD();
		se.setMovies(list);

		XMLEncoder encoder=null;
		try{
		encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));
		}catch(FileNotFoundException fileNotFound){
			System.out.println("ERROR: While Creating or Opening the File dvd.xml");
		}
		encoder.writeObject(se);
		encoder.close();

	}
}
