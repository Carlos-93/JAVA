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
public class Práctica_10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------(MENU)-----");
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

        int numero;
        int result = 0;

        System.out.print("Introduce un numero para sumarle los digitos: ");
        numero = sc.nextInt();

        while (numero > 0) {
            result += numero % 10;
            numero = numero / 10;
        }
        System.out.println("La suma de todos los digitos es de: " + result);
    }

    static void Ejercicio_02() {
        sc.useDelimiter("\n");
        int numeroCaracter = 0;

        System.out.print("Introduce una palabra o frase: ");
        String palabra = sc.next();

        System.out.print("Introduce el caracter a contar: ");
        String caracter = sc.next();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == caracter.charAt(0)) {
                numeroCaracter++;
            }
        }

        if (numeroCaracter != 0) {
            System.out.println("Este caracter aparece " + numeroCaracter + " vez/es");
        } else {
            System.out.println("Este caracter no aparece en la frase que has introducido");
        }
    }

    static void Ejercicio_03() {
        System.out.print("Introduce una palabra: ");
        String palabra = sc.next();
        String espacio = " ";
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(espacio + palabra.charAt(i));
            espacio += "  ";
        }
    }

    static void Ejercicio_04() {
        System.out.println("\n");
        int numero = 10;
        for (int fila = 1; fila <= numero; fila++) {
            for (int columnas = 1; columnas <= numero; columnas++) {
                System.out.printf("%-4s", (fila * columnas));
            }
            System.out.println();
        }
        System.out.println();
    }

    static void Ejercicio_05() {

        System.out.print("Cuanto dinero vas a apostar? ");
        int dinero = sc.nextInt();
        boolean partidaTerminada = false;
        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        int suma = dado1 + dado2;
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);

        switch (suma) {
            case 7, 11 -> {
                System.out.println("Enhorabuena! Has ganado otros " + dinero + " Euros!");
                System.out.println("Ahora tienes el doble de la cantidad apostada, " + dinero * 2 + " Euros!");
            }
            case 2, 3, 12 ->
                System.out.println("Lo siento, has perdido todo tu dinero ");
            default -> {
                System.out.print("Tienes que seguir tirando, debes conseguir el ");
                System.out.println(suma + " para ganar");
                System.out.println("Si obtienes un 7, perderas la partida");
                System.out.println("Pulsa ENTER para tirar los dados");
                sc.nextLine();

                do {
                    dado1 = (int) (Math.random() * 6 + 1);
                    dado2 = (int) (Math.random() * 6 + 1);
                    System.out.println("Dado 1: " + dado1);
                    System.out.println("Dado 2: " + dado2);
                    System.out.println("Suma: " + (dado1 + dado2));
                    if ((dado1 + dado2) == suma) {
                        System.out.println("Enhorabuena! Has ganado otros " + dinero + " Euros!");
                        System.out.println("Ahora tienes " + dinero * 2 + " Euros!");
                        partidaTerminada = true;
                    } else if ((dado1 + dado2) == 7) {
                        System.out.println("Lo siento, has perdido todo tu dinero ");
                        partidaTerminada = true;
                    } else {
                        System.out.println("Continua jugando");
                        System.out.println("Pulse ENTER para tirar los dados.");
                        sc.nextLine();
                    }
                } while (!partidaTerminada);
            }
        }
    }

    static void Ejercicio_06() {

        int alumnos = 1;
        double sumaNotas;
        double maximo = 0;

        do {
            System.out.print("Introduce el numero de estudiantes que hay en la clase: ");
            alumnos = sc.nextInt();
        } while (alumnos <= 0);

        System.out.print("Introduce la nota del alumno 1: ");
        sumaNotas = sc.nextDouble();
        maximo = maximo + sumaNotas;

        for (int i = 2; i <= alumnos; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            sumaNotas = sc.nextDouble();
            maximo = maximo + sumaNotas;
        }
        System.out.printf("La nota media de los alumnos es: %.2f %n", maximo / alumnos);
    }

    static void Ejercicio_07() {

        boolean es_primo = true;
        System.out.print("Ingrese un numero entero: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num / 2; i++) {
            es_primo = (num % i) != 0;
        }

        System.out.print("El numero " + num);

        if (es_primo == true) {
            System.out.print(" es primo\n");
        } else {
            System.out.print(" NO es primo\n");
        }
    }
}
