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
public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de Euros que quiere convertir a D�lares: ");
        int euros = x.nextInt();
        double d�lares = (double) (euros * 0.98);
        System.out.printf("%d Euros son %.2f D�lares\n", euros, d�lares);
    }
}
