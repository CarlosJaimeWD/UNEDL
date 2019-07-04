/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acomodararreglo;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author carlosjaime
 */
public class AcomodarArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stringArray = JOptionPane.showInputDialog("Ingresa los numeros del arreglo separador por coma");
       
        String[] array2 = stringArray.split(",");
        int[] array = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            array[i] = Integer.parseInt(array2[i]);
        }
        Arrays.sort(array);
        
        JOptionPane.showMessageDialog(null, "Array viejo: " + Arrays.toString(array2) + "\nArray nuevo: " + Arrays.toString(array));
        
    }
    
}
