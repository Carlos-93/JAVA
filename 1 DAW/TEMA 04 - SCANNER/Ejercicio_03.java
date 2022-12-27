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
public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Introduce tu nombre completo: ");
        String name = x.nextLine();
        System.out.print("Introduce tu dirección: ");
        String address = x.nextLine();
        System.out.print("Introduce tu número de teléfono: ");
        String phonenumber = x.nextLine();
        System.out.println("Nombre y Apellidos: \n" + name + "\nDirección: \n" + address + "\nNúmero de teléfono: \n" + phonenumber);
    }
}
