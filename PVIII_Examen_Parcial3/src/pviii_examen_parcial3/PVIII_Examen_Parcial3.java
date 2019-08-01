/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pviii_examen_parcial3;

import java.util.Scanner;

/**
 *
 * @author carlosjaime
 */
public class PVIII_Examen_Parcial3 {

    /**
     * @param args the command line arguments
     */
    int a[];
    int n;

    public PVIII_Examen_Parcial3(int size) {
        n = size;
        a = new int[n];
    }

    public void leerArreglo() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce " + n + " elementos: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
    }

    public void imprimirArreglo() {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public void ordenar() {
        int i;
        for (i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print((i) + "  ");
            imprimirArreglo();
        }
        System.out.println("Permutas: " + i);
        System.out.println("Primer elemento: " + a[0]);
        System.out.println("Ultimo elemento: " + a[n-1]);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el tamaño del arreglo: ");
        int n = s.nextInt();
        PVIII_Examen_Parcial3 ob = new PVIII_Examen_Parcial3(n);
        ob.leerArreglo();
        System.out.print("Arreglo = ");
        ob.imprimirArreglo();
        ob.ordenar();
    }

}
