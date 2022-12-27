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
public class Ejercicio_07 {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        System.out.print("Introduce la primera letra: ");
        char letra1 = (x.next()).charAt(0);
        System.out.print("Introduce la segunda letra: ");
        char letra2 = (x.next()).charAt(0);
        System.out.print("Introduce la tercera letra: ");
        char letra3 = (x.next()).charAt(0);
        System.out.print("Introduce la cuarta  letra: ");
        char letra4 = (x.next()).charAt(0);
        System.out.print("Introduce la quinta  letra: ");
        char letra5 = (x.next()).charAt(0);
        System.out.println(letra1 + "" + letra2 + letra3 + letra4 + letra5);
    }
}
