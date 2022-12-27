/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables;

/**
 *
 * @author carlosaragal
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 144;
        int y = 999;
        System.out.println("x = " + x + " y = " + y);
        System.out.println("La suma de y (999) + x (144) es = " + (y + x));
        System.out.println("La resta de y (999) - y (144) es = " + (y - x));
        System.out.println("La multiplicacion de y (999) * x (144) es = " + (y * x));
        double division = (double) y / (double) x;
        System.out.println("La division de y (999) / x (144) es = " + division);
    }
}