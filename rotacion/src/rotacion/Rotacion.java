/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author carlosjaime
 */
public class Rotacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de arreglo"));
        int rotacion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de rotaciones"));
        
        for (int i = 0; i < tamaño; i++ ) {
            array.add(i+1);
        }
        
        int numero;
        for (int i = 0; i < rotacion; i++) {
            numero = array.get(0);
            array.remove(0);
            array.add(numero);
        }
         
        JOptionPane.showMessageDialog(null, array.toString(), "Arreglo rotado", 1);
    }
    
}
