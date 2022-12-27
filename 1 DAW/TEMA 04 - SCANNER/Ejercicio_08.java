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
public class Ejercicio_08 {

    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        
        System.out.print("Número de horas trabajadas durante la semana: ");
        
        int horasTrabajadas = x.nextInt();
        
        System.out.println("Tu salario semanal es de " + (horasTrabajadas * 12) + " Euros");
    }
}
