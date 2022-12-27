/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Práctica_08 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---(MENU)---");
        System.out.println("[1] Ejercicio 01");
        System.out.println("[2] Ejercicio 02");
        System.out.println("[3] Ejercicio 03");
        System.out.println("[4] Ejercicio 04");
        System.out.println("[5] Ejercicio 05");
        System.out.println("[6] Ejercicio 06");
        System.out.println("[7] Ejercicio 07");

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
            case 5 -> {
                Ejercicio_05();
            }
            case 6 -> {
                Ejercicio_06();
            }
            case 7 -> {
                Ejercicio_07();
            }
            default ->
                System.out.println("Selecciona un ejercicio valido");
        }
    }

    static void Ejercicio_01() {
        System.out.println("Introduce un numero entero: ");
        int numero = sc.nextInt();
        System.out.println("""
                           Que tipo de bucle vas a utilizar? 
                           [1] FOR
                           [2] WHILE
                           [3] DO-WHILE""");
        int bucles = sc.nextInt();
        switch (bucles) {
            case 1 -> {
                for (int i = 0; i <= 100; i++) {
                    if (i % numero == 0) {
                        System.out.println("los multiplos de " + numero + " son: " + i);
                    }
                }
            }
            case 2 -> {
                int i = 0;
                while (i <= 100) {
                    System.out.println("los multiplos de " + numero + " son: " + i);
                    i += numero;
                }
            }
            case 3 -> {
                int i = 0;
                do {
                    System.out.println("los multiplos de " + numero + " son: " + i);
                    i += numero;
                } while (i <= 100);
            }
            default ->
                System.out.println("Introduce un tipo de bucle correcto");
        }
    }

    static void Ejercicio_02() {
        System.out.println("Introduce un numero entero mayor de 10: ");
        int numero = sc.nextInt();
        System.out.println("Vamos a restar numeros de 10 en 10 desde el numero introducido hasta el 0");
        System.out.println("""
                           Que tipo de bucle vas a utilizar? 
                           [1] FOR
                           [2] WHILE
                           [3] DO-WHILE""");
        int bucles = sc.nextInt();
        switch (bucles) {
            case 1 -> {
                for (int i = numero; i >= 0; i -= 10) {
                    System.out.println(i);
                }
            }
            case 2 -> {
                int i = numero;
                while (i >= 0) {
                    System.out.println(i);
                    i -= 10;
                }
            }
            case 3 -> {
                int i = numero;
                do {
                    System.out.println(i);
                    i -= 10;
                } while (i >= 0);
            }
            default ->
                System.out.println("Introduce un tipo de bucle correcto");
        }
    }

    static void Ejercicio_03() {
        System.out.print("Introduce una tabla de multiplicar: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %2d = %3d\n", numero, i, numero * i);
        }
    }

    static void Ejercicio_04() {
        System.out.print("Introduzca un numero: ");
        int numero = sc.nextInt();

        System.out.println("numero | cuadrado | cubo |");
        System.out.println("--------------------------");
        for (int i = numero; i < numero + 5; i++) {
            System.out.printf("%4d |%7d |%8d|\n", i, i * i, i * i * i);
        }
    }

    static void Ejercicio_05() {
        System.out.print("Introduzca un numero: ");
        int numero = sc.nextInt();
        int numero2 = numero;
        int i = 0;
        while (numero != 0) {
            numero = numero / 10;
            i++;
        }
        System.out.println("El numero " + numero2 + " tiene " + i + " digito/s.");
    }

    static void Ejercicio_06() {
        int numeroAleatorio;
        int intentos;
        int contador = 3;

        numeroAleatorio = (int) (10 * Math.random() + 0);
        System.out.println("Adivina un numero secreto entre el 0 y el 10, "
                + "tienes 3 intentos.");

        do {
            System.out.println("Numero de intentos: " + contador);
            System.out.print("Introduce un numero: ");
            intentos = sc.nextInt();
            if (intentos > numeroAleatorio) {
                System.out.println("El numero aleatorio es menor, te quedan "
                        + (contador - 1) + " intento/s: ");
            } else if (intentos < numeroAleatorio) {
                System.out.println("El numero aleatorio es mayor, te quedan "
                        + (contador - 1) + " intento/s: ");
            }
            contador--;
        } while (intentos != numeroAleatorio && contador > 0);
        if (contador == 0) {
            System.out.println("Has gastado los tres intentos, el numero secreto era el " + numeroAleatorio);
        } else {
            System.out.println("CORRECTO! has adivinado el numero secreto");
        }
    }

    static void Ejercicio_07() {
        System.out.print("Introduce una base: ");
        int base = sc.nextInt();

        System.out.print("Introduce un exponente: ");
        int exponenteFinal = sc.nextInt();

        int potencia;
        int exponente;

        for (int i = 1; i <= exponenteFinal; i++) {

            potencia = 1;
            exponente = i;

            for (int j = 0; j < exponente; j++) {
                potencia *= base;
            }

            System.out.println("La potencia de " + base + "*" + i + " es " + potencia);
        }
    }
}
