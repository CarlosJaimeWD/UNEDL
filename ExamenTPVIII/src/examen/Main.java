/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;
import examen.CostoMesa;

/**
 *
 * @author carlosjaime
 */
public class Main {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        Rectangulo rectangulo1;
        
        System.out.print("Digite la base del rectangulo: ");
        double base = in.nextDouble();
        System.out.print("Digite la altura del rectangulo: ");
        double altura = in.nextDouble();
        rectangulo1 = new Rectangulo(base, altura);
        System.out.print("Digite el costo por metro cuadrado: ");
        double costo = in.nextDouble();
        rectangulo1.calcularArea();
        System.out.println("\nArea de la mesa: " + rectangulo1.getArea());
        System.out.println("El costo total es: " + CostoMesa.calcularCosto(costo));
    }
}
