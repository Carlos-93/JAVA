/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author carlosaragal
 */
public class Práctica_09 {

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
        int ejercicio = sc.nextInt();

        switch (ejercicio) {

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

        System.out.print("Introduce la cantidad de numeros para mostrar la serie de Fibonacci: ");
        int numero = sc.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int fibo3;

        for (int i = 1; i <= numero; i++) {
            switch (i) {
                case 1 ->
                    System.out.print(fibo1 + ", ");
                case 2 ->
                    System.out.print(fibo2 + ", ");
                default -> {
                    System.out.print((fibo1 + fibo2) + ", ");
                    fibo3 = fibo2;
                    fibo2 = fibo1 + fibo2;
                    fibo1 = fibo3;
                }
            }
        }
    }

    static void Ejercicio_02() {

        System.out.print("Introduce el numero de caracteres para pintar la altura de una piramide: ");
        int numero = sc.nextInt();
        System.out.print("Introduce el caracter: ");
        String caracter = sc.next();
        System.out.println();

        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = numero - 1;

        while (planta <= numero) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print(caracter);
            }
            System.out.println();

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
    }

    static void Ejercicio_03() {
        System.out.println("Introduce un numero entero, hasta que salga un numero negativo: ");
        int numeroEntero;
        int numeroElemento = 0;
        int sumaImpar = 0;
        int numeroElementoImpar = 0;
        int mayorPar = 0;

        do {
            numeroEntero = sc.nextInt();

            if (numeroEntero >= 0) {
                numeroElemento++;
                if ((numeroEntero % 2) == 1) {
                    sumaImpar += numeroEntero;
                    numeroElementoImpar++;
                } else {
                    if (numeroEntero > mayorPar) {
                        mayorPar = numeroEntero;
                    }
                }
            }
        } while (numeroEntero >= 0);

        System.out.println("Ha introducido " + numeroElemento + " numeros enteros positivos.");
        System.out.print("La media de los numeros impares es ");
        System.out.println(sumaImpar / numeroElementoImpar + ".");
        System.out.println("El numero maximo de los pares ha sido el " + mayorPar + ".");
    }

    static void Ejercicio_04() {
        System.out.print("Introduce un numero entero: ");
        int numeroEntero = sc.nextInt();
        int numero = numeroEntero;
        int reves = 0;

        while (numero > 0) {
            reves = reves * 10 + numero % 10;
            numero = numero / 10;
        }
        System.out.println("Si le damos la vuelta al " + numeroEntero + " obtenemos el " + reves);
    }

    static void Ejercicio_05() {

        System.out.print("Introduce un numero entero: ");
        int numeroEntero = sc.nextInt();
        int factorial = numeroEntero;
        for (int i = factorial; i != 1; i--) {
            numeroEntero = numeroEntero * (i - 1);
        }
        System.out.println(factorial + "!=" + numeroEntero);
    }

    static void Ejercicio_06() {

        String primerDia;
        String segundoDia;
        boolean datos = true;
        int primeraHora;
        int segundaHora;
        int diaUno = 0;
        int diaDos = 0;
        int horas = 0;
        System.out.print("Introduce el primer dia: ");
        primerDia = sc.next();
        System.out.print("Introduce la primera hora: ");
        primeraHora = sc.nextInt();
        System.out.print("Introduce el segundo dia: ");
        segundoDia = sc.next();
        System.out.print("Introduce la segunda hora: ");
        segundaHora = sc.nextInt();

        switch (primerDia) {
            case "1", "lunes" -> diaUno = 1;
            case "2", "martes" -> diaUno = 2;
            case "3", "miercoles" -> diaUno = 3;
            case "4", "jueves" -> diaUno = 4;
            case "5", "viernes" -> diaUno = 5;
            case "6", "sabado" -> diaUno = 6;
            case "7", "domingo" -> diaUno = 7;
            default -> datos = false;
        }
        switch (segundoDia) {
            case "1", "lunes" -> diaDos = 1;
            case "2", "martes" -> diaDos = 2;
            case "3", "miercoles" -> diaDos = 3;
            case "4", "jueves" -> diaDos = 4;
            case "5", "viernes" -> diaDos = 5;
            case "6", "sabado" -> diaDos = 6;
            case "7", "domingo" -> diaDos = 7;
            default -> datos = false;
        }
        if ((primeraHora < 0) || (primeraHora > 23) || (primeraHora < 0) || (primeraHora > 23)) {
            datos = false;
        }
        if (diaUno == diaDos) {
            if (primeraHora > segundaHora) {
                datos = false;
            } else {
                horas = segundaHora - primeraHora;
            }
        } else {
            horas = (24 - segundaHora) + (primeraHora) + ((diaDos - diaUno - 1) * 24);
        }
        if (datos) {
            System.out.print("Entre las " + primeraHora + "h del dia " + primerDia + " y las " + segundaHora + "h del dia " + segundoDia + " hay una diferencia de " + horas + " horas/s\n");
        } else {
            System.out.print("Introduce los datos correctamente de nuevo");
        }
    }

    static void Ejercicio_07() {

        int altura;
        int i;
        System.out.print("Introduce la altura de la letra L: ");
        altura = sc.nextInt();
        System.out.println();
        for (i = 0; i < altura - 1; i++) {
            System.out.println("*");
        }
        for (i = 0; i < ((altura / 2) + 1); i++) {
            System.out.print("* ");
        }
    }
}