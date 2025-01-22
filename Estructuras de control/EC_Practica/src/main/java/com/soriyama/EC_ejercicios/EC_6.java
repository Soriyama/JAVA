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
public class EC_6 {
     private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroEjercicios = 1; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio del bloque UT3_6:");
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

}
