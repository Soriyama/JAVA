/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soriyama.EC_ejercicios;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class EC_5 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroEjercicios = 5; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio del bloque UT3_5:");
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
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        System.out.println("El numero tiene " + String.valueOf(numero).length() + " cifras");

    }

    /**
     *
     */
    public static void ejercicio2() {
        int cifra1, cifra2;
        System.out.println("Introduce la primea cifra: ");
        cifra1 = sc.nextInt();
        System.out.println("Introduce la segunda cifra: ");
        cifra2 = sc.nextInt();

        System.out.println("Las cifras que hay entre la cifra mayor y la menor son: ");
        int mayor = Math.max(cifra1, cifra2);
        int menor= Math.max(cifra1, cifra2);

        for (int i = mayor; i >= menor; i--) {
            System.out.print(i + "");
        }
        System.out.println(" ");
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

}
