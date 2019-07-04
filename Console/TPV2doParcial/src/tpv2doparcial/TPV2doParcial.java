/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpv2doparcial;

/**
 *
 * @author carlosjaime
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TPV2doParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "/Users/carlosjaime/Documents/Develop/UNEDL/TPV2doParcial/";
        String nombre = JOptionPane.showInputDialog("Ingresa nombre del archivo");
        File file;
        if (nombre != null) {
            path += "/" + nombre + ".txt";
            file = new File(path);
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(TPV2doParcial.class.getName()).log(Level.SEVERE, null, ex);
            }

            String content = JOptionPane.showInputDialog("Ingrese las palabras aqui");

            try (FileWriter writer = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(content);
            } catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }

            if (content != null) {
                String words = content.trim();
                int countWords = words.split("\\s+").length;

                String[] ar = content.split("\\s");
                Map<String, Integer> mp = new HashMap<String, Integer>();
                int count = 0;

                for (int i = 0; i < ar.length; i++) {
                    count = 0;
                    for (int j = 0; j < ar.length; j++) {
                        if (ar[i].equals(ar[j])) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        mp.put(ar[i], count);
                    }
                }

                Scanner in;
                try {
                    in = new Scanner(new FileReader(file));
                    StringBuilder sb = new StringBuilder();
                    while (in.hasNext()) {
                        sb.append(" " + in.next());
                    }
                    in.close();
                    String text = sb.toString();
                    JOptionPane.showMessageDialog(null, "Palabras: " + text + "\nNumero de palabras: " + countWords + "\nPalabras repetidas: " + mp);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TPV2doParcial.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

}
