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
public class EC_1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroEjercicios = 5; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio del bloque UT3_1:");
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
        int a = 0;
        int b = 0;
        System.out.println("Introduce el primer numero");
        a = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        b = sc.nextInt();

        if ((a - b) > b) {
            System.out.println("a-b es mayor a b");
        } else {
            System.out.println("a-b es menor a b");
        }

        if ((b - a) > a) {
            System.out.println("b-a es mayor a a");
        } else {
            System.out.println("b-a es menor a a");
        }

    }

    /**
     *
     */
    public static void ejercicio2() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hola");

        }
    }

    /**
     *
     */
    public static void ejercicio3() {
        int num;
        System.out.println("Introduce un numero entero");
        num = sc.nextInt();
        System.out.println("El numero introducido es :" + num);
        System.out.println("El doble de" + num + " es: " + 2 * num);
        System.out.println("El cuadrado del numero " + num + " es: " + num * num);

    }

    /**
     *
     */
    public static void ejercicio4() {
        int n = 1;

        while (n <= 20) {
            System.out.println(n);
            n++;
        }
    }

    /**
     *
     */
    public static void ejercicio5() {
        int n, muestra = 1;
        do {            
            System.out.println("Muestra" + muestra); 
            System.out.println("introduce el numero de la muestra");
            n = sc.nextInt();
        } while (n != muestra++);
        
    }

    
}
