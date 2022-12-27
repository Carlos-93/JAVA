/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurascondicionales2;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author carlosaragal
 */
public class Práctica_06 {

    static Scanner sc = new Scanner(System.in);
    static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("---(MENU)---");
        System.out.println("[1] Ejercicio 01");
        System.out.println("[2] Ejercicio 02");
        System.out.println("[3] Ejercicio 03");
        System.out.println("[4] Ejercicio 04");
        System.out.println("[5] Ejercicio 05");
        System.out.println("[6] Ejercicio 06");

        System.out.print("Escoge una opcion: ");
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
            
            default ->
                System.out.println("Esta opcion no existe, intentalo de nuevo");
        }
    }

    static void Ejercicio_01() {
        int puntuacion = 0;
        System.out.println("Pregunta 1");
        System.out.println("----------");
        System.out.println("Que es Eclipse?");
        System.out.println("a) Un fenomeno astrologico");
        System.out.println("b) Un IDE");
        System.out.println("c) Un lenguaje de alto nivel");
        System.out.println("d) Una peli de vampiros de la saga Crepusculo");
        String respuesta1 = sc.nextLine();

        switch (respuesta1) {
            case "b" -> {
                puntuacion = puntuacion + 1;
                System.out.println("Respuesta Correcta\n");
            }
            default ->
                System.out.println("Respuesta Incorrecta\n");
        }

        System.out.println("Pregunta 2");
        System.out.println("----------");
        System.out.println("Que extension debe tener el archivo que contiene el codigo fuente de un programa escrito en Java?");
        System.out.println("a) .java");
        System.out.println("b) .class");
        System.out.println("c) .font");
        System.out.println("d) .exe");
        String respuesta2 = sc.nextLine();

        switch (respuesta2) {
            case "a" -> {
                puntuacion = puntuacion + 1;
                System.out.println("Respuesta Correcta\n");
            }
            default ->
                System.out.println("Respuesta Incorrecta\n");
        }

        System.out.println("Pregunta 3");
        System.out.println("----------");
        System.out.println("Que es Java?");
        System.out.println("a) Un personaje de StarWars");
        System.out.println("b) Un lenguaje de programacion interpretado o intermedio");
        System.out.println("c) Un lenguaje informatico de bajo nivel");
        String respuesta3 = sc.nextLine();
        switch (respuesta3) {
            case "b" -> {
                puntuacion = puntuacion + 1;
                System.out.println("Respuesta Correcta\n");
            }
            default ->
                System.out.println("Respuesta Incorrecta\n");
        }

        System.out.println("Pregunta 4");
        System.out.println("----------");
        System.out.println("Se puede programar en Java sin un entorno de desarrollo como Netbeans?");
        System.out.println("a) No");
        System.out.println("b) Si");
        String respuesta4 = sc.nextLine();
        switch (respuesta4) {
            case "b" -> {
                puntuacion = puntuacion + 1;
                System.out.println("Respuesta Correcta\n");
            }
            default ->
                System.out.println("Respuesta Incorrecta\n");
        }

        System.out.println("Pregunta 5");
        System.out.println("----------");
        System.out.println("Cada plataforma debe disponer de su propia JVM para poder ejecutar los programas escritos en Java");
        System.out.println("a) Verdadero");
        System.out.println("b) Falso");
        String respuesta5 = sc.nextLine();
        switch (respuesta5) {
            case "a" -> {
                puntuacion = puntuacion + 1;
                System.out.println("Respuesta Correcta\n");
            }
            default ->
                System.out.println("Respuesta Incorrecta\n");
        }
        System.out.println("Puntuacion del examen: " + puntuacion + " puntos");
    }

    static void Ejercicio_02() {
        System.out.print("Introduce el nombre completo del primer alumno: ");
        String name1;
        name1 = sc.nextLine();

        System.out.print("Introduce el nombre completo del segundo alumno: ");
        String name2;
        name2 = sc.nextLine();

        System.out.print("Introduce el nombre completo del tercer alumno: ");
        String name3;
        name3 = sc.nextLine();

        if ((name1.compareTo(name2) < 0) && ((name2.compareTo(name3) < 0)) && (name1.compareTo(name3) < 0)) {
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
        } else if ((name2.compareTo(name1) < 0) && ((name1.compareTo(name3) < 0)) && (name2.compareTo(name3) < 0)) {
            System.out.println(name2);
            System.out.println(name1);
            System.out.println(name3);
        } else if ((name3.compareTo(name2) < 0) && ((name2.compareTo(name1) < 0)) && (name3.compareTo(name1) < 0)) {
            System.out.println(name3);
            System.out.println(name2);
            System.out.println(name1);
        } else {
            System.out.println(name3);
            System.out.println(name1);
            System.out.println(name2);
        }
    }

    static void Ejercicio_03() {
        System.out.println("Introduce un numero de tres cifras:");
        String cifra;
        cifra = sc.nextLine();
        int number;
        number = cifra.length();
        while (number != 3) {
            System.out.println("El numero de cifras es incorrecto, introduce un numero de tres cifras");
            cifra = sc.nextLine();
            number = cifra.length();
        }
        char n1;
        n1 = cifra.charAt(0);
        char n2;
        n2 = cifra.charAt(2);
        if (n1 == n2) {
            System.out.println("El numero introducido es capicua");
        } else {
            System.out.println("El numero introducido no es capicua");
        }
    }

    static void Ejercicio_04() {
        System.out.print("Introduce un numero:");
        int numero = sc.nextInt();

        if (numero <= 9) {
            System.out.println("Este numero contiene 1 digitos");
        } else if (numero <= 99) {
            System.out.println("Este numero contiene 2 digitos");
        } else if (numero <= 999) {
            System.out.println("Este numero contiene 3 digitos");
        } else if (numero <= 9999) {
            System.out.println("Este numero contiene 4 digitos");
        } else if (numero <= 99999) {
            System.out.println("Este numero contiene 5 digitos");
        } else {
            System.out.println("Este numero tiene un exceso de digitos");
        }
    }

    static void Ejercicio_05() {
        int sumaMinutos;
        int total;
        int minutosRestantes;

        System.out.print("Introduce un dia de la semana, de lunes a viernes: ");
        String currentDay = (sc.next()).toLowerCase();
        System.out.print("Introduce la hora: ");
        int currentHour = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int currentMinutes = sc.nextInt();

        switch (currentDay) {

            case "lunes" -> {
                sumaMinutos = ((currentHour * 60) + currentMinutes);
                minutosRestantes = 6660 - sumaMinutos;
                System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana");
            }

            case "martes" -> {
                sumaMinutos = ((currentHour * 60) + currentMinutes);
                total = 1440 + sumaMinutos;
                minutosRestantes = 6660 - total;
                System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana");
            }

            case "miercoles" -> {
                sumaMinutos = ((currentHour * 60) + currentMinutes);
                total = 2880 + sumaMinutos;
                minutosRestantes = 6660 - total;
                System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana");
            }

            case "jueves" -> {
                sumaMinutos = ((currentHour * 60) + currentMinutes);
                total = 4320 + sumaMinutos;
                minutosRestantes = 6660 - total;
                System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana");
            }

            case "viernes" -> {
                sumaMinutos = ((currentHour * 60) + currentMinutes);
                total = 5760 + sumaMinutos;
                minutosRestantes = 6660 - total;
                System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana");
            }

            default ->
                System.out.println("Estas en fin de semana");
        }
    }

    static void Ejercicio_06() {
        double general = 0.21;
        double reducido = 0.1;
        double superreducido = 0.04;

        df.setRoundingMode(RoundingMode.UP);

        System.out.print(
                "Introduzca la base imponible: ");
        double base = sc.nextDouble();

        System.out.print(
                "Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String iva = sc.next();

        System.out.print(
                "Introduzca el codigo promocional (sinpromo, mitad, descfijo o porcentaje): ");
        String promoción = sc.next().toLowerCase();

        switch (iva) {
            case "general" -> {
                System.out.println("");
                double totalGeneral = base * general;
                double descuentoFijoG = (totalGeneral + base) - 5;
                double descuentoPorcentajeG = (totalGeneral + base) * 0.05;
                switch (promoción) {
                    case "sinpromo" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(totalGeneral + base));
                    }
                    case "mitad" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %3s %1s\n", "Cod.promo.(mitad): ", "-", df.format((totalGeneral + base) / 2));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format((totalGeneral + base) / 2));
                    }
                    case "descfijo" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %1s %1s\n", "Cod.promo.(descfijo): ", "-", df.format((totalGeneral + base) - descuentoFijoG));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(descuentoFijoG));
                    }
                    case "porcentaje" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%8s %1s %1s\n", "Cod.promo.(descfijo): ", "-", df.format((totalGeneral + base) - descuentoPorcentajeG));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(descuentoPorcentajeG));
                    }
                    default ->
                        System.out.println("INTRODUCE UN CODIGO PROMOCIONAL VALIDO");
                }
            }
            case "reducido" -> {
                System.out.println("");
                double totalGeneral = base * reducido;
                double descuentoFijoG = (totalGeneral + base) - 5;
                double descuentoPorcentajeG = (totalGeneral + base) * 0.05;
                switch (promoción) {
                    case "sinpromo" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(totalGeneral + base));
                    }
                    case "mitad" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %3s %1s\n", "Cod.promo.(mitad): ", "-", df.format((totalGeneral + base) / 2));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format((totalGeneral + base) / 2));
                    }
                    case "descfijo" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %1s %1s\n", "Cod.promo.(descfijo): ", "-", df.format((totalGeneral + base) - descuentoFijoG));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(descuentoFijoG));
                    }
                    case "porcentaje" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %1s %1s\n", "Cod.promo.(descfijo): ", "-", df.format((totalGeneral + base) - descuentoPorcentajeG));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(descuentoPorcentajeG));
                    }
                    default ->
                        System.out.println("INTRODUCE UN CODIGO PROMOCIONAL VALIDO");
                }
            }
            case "superreducido" -> {
                System.out.println("");
                double totalGeneral = base * superreducido;
                double descuentoFijoG = (totalGeneral + base) - 5;
                double descuentoPorcentajeG = (totalGeneral + base) * 0.05;
                switch (promoción) {
                    case "sinpromo" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(totalGeneral + base));
                    }
                    case "mitad" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %3s %1s\n", "Cod.promo.(mitad): ", "-", df.format((totalGeneral + base) / 2));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format((totalGeneral + base) / 2));
                    }
                    case "descfijo" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %1s %1s\n", "Cod.promo.(descfijo): ", "-", df.format((totalGeneral + base) - descuentoFijoG));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(descuentoFijoG));
                    }
                    case "porcentaje" -> {
                        System.out.printf("%15s %13s\n", "Base imponible ", df.format(base));
                        System.out.printf("%10s %18s\n", "IVA (21%) ", df.format(totalGeneral));
                        System.out.printf("%15s %13s\n", "Precio con IVA ", df.format(totalGeneral + base));
                        System.out.printf("%10s %1s %1s\n", "Cod.promo.(descfijo): ", "-", df.format((totalGeneral + base) - descuentoPorcentajeG));
                        System.out.printf("%6s %22s\n", "TOTAL ", df.format(descuentoPorcentajeG));
                    }
                    default -> {
                        System.out.println("INTRODUCE UN CODIGO PROMOCIONAL VALIDO");
                    }
                }
            }
        }
    }
}
