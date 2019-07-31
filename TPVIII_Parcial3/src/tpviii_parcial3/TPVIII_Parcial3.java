/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpviii_parcial3;
import java.util.Arrays;

/**
 *
 * @author carlosjaime
 */
public class TPVIII_Parcial3 {
      
    public static void main(String[] args) { 
        int pila1[] = { 3, 2, 1, 1, 1 }; 
        int pila2[] = { 4, 3, 2 }; 
        int pila3[] = { 1, 1, 4, 1 }; 

        int tamaño1 = pila1.length; 
        int tamaño2 = pila2.length; 
        int tamaño3 = pila3.length; 
        System.out.println("Pila 1: " + Arrays.toString(pila1));
        System.out.println("Pila 2: " + Arrays.toString(pila2));
        System.out.println("Pila 2: " + Arrays.toString(pila2));
        System.out.println("Resultado: " + alturaMaxima(pila1, pila2, pila3, tamaño1, tamaño2, tamaño3)); 
    } 
    
    public static int alturaMaxima(int pila1[], int pila2[], int pila3[], int tamaño1, int tamaño2, int tamaño3) { 
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0; 
        
        for (int i=0; i < tamaño1; i++) {
            suma1 += pila1[i]; 
        }

        for (int i=0; i < tamaño2; i++) {
            suma2 += pila2[i]; 
        }

        for (int i=0; i < tamaño3; i++) {
            suma3 += pila3[i]; 
        }

        int altura1 =0;
        int altura2 = 0;
        int altura3 = 0; 
        int resultado = 0;

        while (true) { 
           if (altura1 == tamaño1 || altura2 == tamaño2 || altura3 == tamaño3) {
             return 0; 
           }
            
          if (suma1 == suma2 && suma2 == suma3) {
             return suma1;
          }

          if (suma1 >= suma2 && suma1 >= suma3) {
             suma1 -= pila1[altura1++]; 
          } else if (suma2 >= suma3 && suma2 >= suma3) {
             suma2 -= pila2[altura2++]; 
          } else if (suma3 >= suma2 && suma3 >= suma1) {
             suma3 -= pila3[altura3++]; 
          }
        }      
    } 
}
