/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurascondicionales1;

import java.util.Scanner;

/**
 *
 * @author carlosaragal
 */
public class Práctica_05 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---(MENU)---");
        System.out.println("[1] Ejercicio 01");
        System.out.println("[2] Ejercicio 02");
        System.out.println("[3] Ejercicio 03");
        System.out.println("[4] Ejercicio 04");

        System.out.print("Escoge un ejercicio: ");
        int opcion;
        opcion = sc.nextInt();

        switch (opcion) {

            case 1 -> {
                Ejercicio_01();
            }
            case 2 -> {
                Ejercicio_02();
            }
            case 3 -> {
                Ejercicio_03();
            }
            case 4 -> {
                Ejercicio_04();
            }
            default ->
                System.out.println("Esta opcion no existe, intentalo de nuevo");
        }
    }

    static void Ejercicio_01() {
        System.out.println("Introduce un dia de la semana");
        String dia = sc.next();

        switch (dia) {
            case "Lunes" ->
                System.out.println("De 8h a 11h toca Base de Datos");
            case "Martes" ->
                System.out.println("De 8h a 9h toca FOL");
            case "Miercoles" ->
                System.out.println("De 8h a 10h toca Base de Datos");
            case "Jueves" ->
                System.out.println("De 9h a 11h toca Hardware");
            case "Viernes" ->
                System.out.println("De 8h a 9h toca Base de Datos");
            default ->
                System.out.println("No hay clases, es fin de semana");
        }
    }

    static void Ejercicio_02() {
        System.out.println("Introduce una hora del dia");
        int dia = sc.nextInt();

        if ((dia >= 6) && (dia <= 12)) {
            System.out.println("Buenos dias Carlos");
        } else if ((dia >= 13) && (dia <= 20)) {
            System.out.println("Buenas tardes Carlos");
        } else if ((dia >= 21) && (dia <= 24)) {
            System.out.println("Buenas noches Carlos");
        } else if ((dia >= 00) && (dia <= 5)) {
            System.out.println("Buenas noches Carlos");
        } else {
            System.out.println("Error de lectura!");
        }
    }

    static void Ejercicio_03() {
        System.out.println("Introduce un numero de la semana");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miercoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sabado");
            case 7 ->
                System.out.println("Domingo");
            default ->
                System.out.println("Error de lectura!");
        }
    }

    static void Ejercicio_04() {
        System.out.println("Introduce el numero de horas trabajadas durante esta semana");
        int hora = sc.nextInt();
        if (hora <= 40) {
            System.out.println(hora * 12 + " Euros es lo que has generado esta semana");
        } else if (hora >= 40) {
            System.out.println((hora * 12) + (((hora - 40) * 16)) + " Euros es lo que has generado esta semana");
        }
    }
}