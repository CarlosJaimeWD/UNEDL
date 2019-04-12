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
public class Rectangulo {
    private static double base;
    private static double altura;
    private static double area;

    public Rectangulo() {
    }
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static double getArea() {
        return area;
    }

    public static void setArea(double area) {
        Rectangulo.area = area;
    }

    public static double calcularArea() {
        area = base * altura;
        return area;
    }
    
    

    
    
}
