/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.soriyama.clases;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class Clases {

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

    public static void ejercicio1() {
        //d)
        Producto p1 = new Producto("Ordenador", 1000, 0.21);
        double precioFinalP1 = p1.calcularPrecioFinal();
        Producto p2 = new Producto("Pan", 2, 0.04);
        double precioFinalP2 = p2.calcularPrecioFinal();
        System.out.println("El precio final de p1 es: " + precioFinalP1);
        System.out.println("El precio final de p2 es: " + precioFinalP2);
        //f)
        System.out.println("El precio total de ambos es: " + (precioFinalP1 + precioFinalP2));
        //g)
        p1.setDescuento(0.1);
        p2.setDescuento(0.1);
        double precioFinalP1Des = p1.calcularPrecioFinal();
        double precioFinalP2Des = p2.calcularPrecioFinal();
        System.out.println("El precio final con descuento del 10% de p1 es: " + precioFinalP1Des);
        System.out.println("El precio final con descuento del 10% de p2 es: " + precioFinalP2Des);
        //h)
        p2.nombre = "bollo";
        System.out.println("El nombre de p2 es: " + p2.nombre);

    }

    public static void ejercicio2() {

    }

    public static void ejercicio3() {
        Perro can1 = new Perro();
        Perro can2 = new Perro();

        can1.setAlto(15);
        can1.setPeso(8.5f);
        can1.setSonido("Bark");
        can1.setDomestico(true);

        System.out.println("El perro es " + can1.getAlto() + " cm de alto, pesa " + can1.getPeso() + ", hace " + can1.getSonido() + " y " + (can1.isDomestico() == true ? "es domestico" : "no es domestico"));

        can2.setAlto(40);
        can2.setPeso(20f);
        can2.setSonido("grrr");
        can2.setDomestico(false);

        System.out.println("El perro es " + can2.getAlto() + " cm de alto, pesa " + can2.getPeso() + ", hace " + can2.getSonido() + " y " + (can2.isDomestico() == true ? "es domestico" : "no es domestico"));

    }

    public static void ejercicio4() {

    }

    public static void ejercicio5() {

    }

}
