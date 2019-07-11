package com.XML;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DeserializeFromXML {

    private static final String SERIALIZED_FILE_NAME = "settings.xml";

    public static void main(String[] args) {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File settings.xml not found");
        }
        DVD bourneSeries = (DVD) decoder.readObject();
        //System.out.println(bourneSeries.getMovies());
        for(Object movie: bourneSeries.getMovies()){
            System.out.println(movie);
        }
        
        
    }
}
