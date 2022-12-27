/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturadatosteclado;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio_09 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Calcula el volumen de un cono");
        
        System.out.print("Introduzca el radio de la base (cm): ");
        int r = x.nextInt();
        System.out.print("Introduzca la altura (cm): ");
        int h = x.nextInt();
        double pi = 3.14;
        double v = pi * r * r * h / 3;
        System.out.println("El volumen del cono es de " + v + " cm³");
    }
}
