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
public class Ejercicio_06 {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        System.out.print("Introduce la primera letra: ");
        char primeraLetra = (x.next()).charAt(0);
        System.out.print("Introduce la segunda letra: ");
        char segundaLetra = (x.next()).charAt(0);
        System.out.print("Introduce el nombre: ");
        String name = x.next();

        System.out.println(primeraLetra + "" + segundaLetra + name);
    }
}