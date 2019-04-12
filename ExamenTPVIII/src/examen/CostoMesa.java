/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author carlosjaime
 */
public class CostoMesa extends Rectangulo{
    public static double calcularCosto (double costo) {
        double area = calcularArea();
        return area * costo;
    }
}
