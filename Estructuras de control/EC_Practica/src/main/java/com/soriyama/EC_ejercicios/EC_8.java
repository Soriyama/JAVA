/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.soriyama.EC_ejercicios;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class EC_8 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroEjercicios = 20; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio del bloque UT3_0:");
            System.out.println("0- Salir");

            // Mostrar todos los ejercicios dinámicamente
            for (int i = 1; i <= numeroEjercicios; i++) {
                System.out.println(i + "- Ejercicio " + i);
            }

            System.out.print("Seleccion: ");
            opcion = sc.nextInt();
            System.out.println("");

            // Verificar si la opción es válida
            if (opcion < 0 || opcion > numeroEjercicios) {
                System.out.println("Error: Selecciona un número entre 0 y " + numeroEjercicios + ".");
            } else if (opcion == 0) {
                System.out.println("¡Hasta luego!");
                sc.close(); // Cerramos el Scanner al salir
            } else {
                // Manejo de las opciones válidas
                System.out.println("Ejecutando Ejercicio " + opcion + "...");

                switch (opcion) {
                    case 1 ->
                        ejercicio1();
                    case 2 ->
                        ejercicio2();
                    case 3 ->
                        ejercicio3();
                    case 4 ->
                        ejercicio4();
                    case 5 ->
                        ejercicio5();
                    case 6 ->
                        ejercicio6();
                    case 7 ->
                        ejercicio7();
                    case 8 ->
                        ejercicio8();
                    case 9 ->
                        ejercicio9();
                    case 10 ->
                        ejercicio10();
                    case 11 ->
                        ejercicio11();
                    case 12 ->
                        ejercicio12();
                    case 13 ->
                        ejercicio13();
                    case 14 ->
                        ejercicio14();
                    case 15 ->
                        ejercicio15();
                    case 16 ->
                        ejercicio16();
                    case 17 ->
                        ejercicio17();
                    case 18 ->
                        ejercicio18();
                    case 19 ->
                        ejercicio19();
                    case 20 ->
                        ejercicio20();

                    // Agrega más casos según los ejercicios implementados
                    default ->
                        System.out.println("Ejercicio " + opcion + " aún no implementado.");
                }
            }
        } while (opcion != 0); // Repetir mientras no se elija salir
    }

    /**
     *
     */
    public static void ejercicio1() {

    }

    /**
     *
     */
    public static void ejercicio2() {

    }

    /**
     *
     */
    public static void ejercicio3() {

    }

    /**
     *
     */
    public static void ejercicio4() {

    }

    /**
     *
     */
    public static void ejercicio5() {

    }

    /**
     *
     */
    public static void ejercicio6() {

    }

    /**
     *
     */
    public static void ejercicio7() {

    }

    /**
     *
     */
    public static void ejercicio8() {

    }

    /**
     *
     */
    public static void ejercicio9() {

    }

    /**
     *
     */
    public static void ejercicio10() {

    }

    /**
     *
     */
    public static void ejercicio11() {

    }

    /**
     *
     */
    public static void ejercicio12() {

    }

    /**
     *
     */
    public static void ejercicio13() {

    }

    /**
     *
     */
    public static void ejercicio14() {

    }

    /**
     *
     */
    public static void ejercicio15() {
        System.out.println("Introduce un numero para el arbol ascendente");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**
     *
     */
    public static void ejercicio16() {
        System.out.println("Introduce un numero para el arbol descendente");
        int numero = sc.nextInt();
        for (int i = numero; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    /**
     *
     */
    public static void ejercicio17() {
        System.out.println("Introduce un numero para el arbol");
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int l = 1; l <= numero - i; l++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {

                System.out.print("*");
            }
            System.out.println("");
        }

    }

    /**
     *
     */
    public static void ejercicio18() {

    }

    /**
     *
     */
    public static void ejercicio19() {

    }

    /**
     *
     */
    public static void ejercicio20() {

    }
}
