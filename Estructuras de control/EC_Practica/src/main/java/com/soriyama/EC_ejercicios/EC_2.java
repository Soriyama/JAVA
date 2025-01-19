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
public class EC_2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroEjercicios = 5; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio del bloque UT3_2:");
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

        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i);
        }

    }

    /**
     *
     */
    public static void ejercicio2() {
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    /**
     *
     */
    public static void ejercicio3() {
        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     *
     */
    public static void ejercicio4() {
        int suma= 0;
        for (int i = 1; i <= 200; i++) {

            if (i % 2 == 0) {
                if(!(i % 10 == 0))
                suma += i;
            }
        }
        System.out.println("La suma total es: "+suma);
    }

    /**
     *
     */
    public static void ejercicio5() {
        int n;
        System.out.println("Introduce un numero: ");
        n = sc.nextInt();
        
        for(int i = 0; i<=n -1; i++){
            System.out.print("A");
        }
        System.out.println("");
    }

}
