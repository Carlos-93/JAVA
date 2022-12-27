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
public class Ejercicio_02 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Introduce tu nombre completo: ");
        String name = x.nextLine();
        System.out.println("Nombre y Apellidos \n" + name);
    }
}
