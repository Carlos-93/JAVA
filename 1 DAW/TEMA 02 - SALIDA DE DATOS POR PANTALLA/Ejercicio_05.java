/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salidadatospantalla;

/**
 *
 * @author Carlos
 */
public class Ejercicio_05 {

    public static void main(String[] args) {
        System.out.println("\033[31mLunes   Martes  Miercoles   Jueves  Viernes");
        System.out.println("=====   ======  =========   ======  =======");
        System.out.printf("\033[32m%2s  \033[35m%7s \033[32m%6s \033[35m%12s \033[32m%6s\n", "M2", "FOL", "M2", "FOL", "M2");
        System.out.printf("\033[32m%2s  \033[36m%6s \033[32m%7s \033[36m%12s \033[34m%6s\n", "M2", "M5", "M2", "M16", "M3");
        System.out.printf("\033[32m%2s  \033[31m%7s \033[34m%6s \033[36m%12s \033[34m%6s\n", "M2", "TUT", "M3", "M16", "M3");
        System.out.printf("%2s %7s %7s %11s %7s\n", "===", "===", "===", "===", "===");
        System.out.printf("\033[33m%2s  \033[35m%6s \033[33m%7s \033[32m%11s \033[34m%7s\n", "M1", "M4", "M1", "M2", "M3");
        System.out.printf("\033[33m%2s  \033[35m%6s \033[33m%7s \033[35m%11s \033[36m%7s\n", "M1", "M4", "M1", "M4", "M5");
        System.out.printf("\033[34m%2s  \033[30m%6s \033[30m%7s \033[30m%11s \033[34m%7s\n", "EIE", "===", "===", "===", "EIE");
    }
}
