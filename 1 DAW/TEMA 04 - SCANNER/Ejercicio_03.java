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
        System.out.print("Introduce tu direcci�n: ");
        String address = x.nextLine();
        System.out.print("Introduce tu n�mero de tel�fono: ");
        String phonenumber = x.nextLine();
        System.out.println("Nombre y Apellidos: \n" + name + "\nDirecci�n: \n" + address + "\nN�mero de tel�fono: \n" + phonenumber);
    }
}
