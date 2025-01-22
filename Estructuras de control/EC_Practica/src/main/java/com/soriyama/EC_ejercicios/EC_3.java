/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soriyama.EC_ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class EC_3 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroEjercicios = 6; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio del bloque UT3_3:");
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
        int suma = 0;

        for (int i = 33; i <= 66; i++) {
            if (i % 3 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma es: " + suma);
    }

    /**
     *
     */
    public static void ejercicio2() {
        int suma = 0;
        for (int i = 1; i <= 40; i++) {
            if (!(i % 10 == 5)) {
                suma += i;
            }
        }
        System.out.println("La suma es: " + suma);
    }

    /**
     *
     */
    public static void ejercicio3() {
        for (int i = 1; i <= 120; i++) {
            if (120 % i == 0) {
                System.out.println("El numero " + i + " es divisor de 120 y el resultado es entero");
            }
        }
    }

    /**
     *
     */
    public static void ejercicio4() {
        System.out.println("Introduce la base");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();

        double area = base * altura / 2;

        System.out.println("El area del triangulo es: " + area);
    }

    /**
     *
     */
    public static void ejercicio5() {
        System.out.println("Introduce la base");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();
        
        if (base > altura && base % altura ==0){
         double area = base * altura;   
         System.out.println("El area es: " + area);
        }else{
            System.out.println("El area no se puede calcular");
        }
    }

    /**
     *
     */
    public static void ejercicio6() {
        Random rd = new Random();
        int numero = rd.nextInt(2, 140);
        for (int valor = numero;  valor > 0; --valor)
            if (numero % valor ==0)
                System.out.println("[ "+valor+" ] es divisor de [ "+numero+" ]");
                       

    
    }

}
