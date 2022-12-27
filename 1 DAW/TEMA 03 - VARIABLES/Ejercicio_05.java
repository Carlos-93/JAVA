/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ejercicio_05 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = x.nextInt();
        System.out.printf("Base imponible%9.2f\n", baseImponible);
        System.out.printf("IVA%20.2f\n", (baseImponible * 0.21));
        System.out.printf("-----------------------\n");
        System.out.printf("Total%18.2f\n", (baseImponible * 1.21));
    }
}
