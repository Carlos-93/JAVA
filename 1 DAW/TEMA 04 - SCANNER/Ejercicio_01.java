/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturadatosteclado;

import java.util.Scanner;

/**
 *
 * @author carlosaragal
 */
public class Ejercicio_01 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Introduce una operación: ");
        int a = x.nextInt();
        int b = x.nextInt();
        System.out.println("La suma de a + b es " + (a + b));
        System.out.println("La resta de a - b es " + (a - b));
        System.out.println("La multiplicación de a * b es " + (a * b));
        System.out.printf("La división de a / b es %.3f\n", ((double) a / b));

    }
}
