/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
        int numeroEjercicios = 20; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio:");
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
        int i = 1;
        // a)
        // Usando operador if else
        if (i >= 10) {
            System.out.println("a) i es mayor a 10");
        } else {
            System.out.println("a) i es menor a 10");
        }
        // Usando el operador ternario
        System.out.println(i >= 10 ? "a) i es mayor a 10" : "a) i es menor a 10");

        // b)
        if (i > 0 && i < 10) {
            System.out.println("b) i está entre 0 y 10");
        } else {
            System.out.println("b) i no está entre 0 y 10");
        }

        // c)
        if (i > 0 && i > 10) {
            System.out.println("c) i es mayor a 0 y a 10");
        } else {
            System.out.println("c) i no está entre 0 y 10");
        }

        // d)
        i = -1;
        if (i > 0 || i < 10) {
            System.out.println("d) i es mayor a 0 o menor a 10");
        }

        // e)
        i = 1;
        int j = 10;
        if ((i > 0 && i < 10) || j == 1) {
            System.out.println("e) i está entre 0 y 10");
        } else {
            System.out.println("e) i no está entre 0 y 10");
        }

        // f)
        i = 1;

        if (!(i == 1)) {
            System.out.println("f) i es diferente a 1");
        } else {
            System.out.println("f) i es igual a 1");
        }

        // g)
        int año = 1999;

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("g) el año " + año + " es bisiesto");
        } else {
            System.out.println("g) el año " + año + " no es bisiesto");
        }

    }

    /**
     *
     */
    public static void ejercicio2() {

        int num;
        do {
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            System.out.println(num % 2 == 0 ? "El numero es par" : "El numero es impar");

        } while (num != 0);

    }

    /**
     *
     */
    public static void ejercicio3() {
        int a;
        int b;

        System.out.println("Introduce el primer número: ");
        a = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("a es mayor a b ");
        } else if (a < b) {
            System.out.println("a es menor a b ");
        } else if (a == b) {
            System.out.println("a es igual a b ");
        }

    }

    /**
     *
     */
    public static void ejercicio4() {
        System.out.println("Intoduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Intoduce el segundo número");
        int num2 = sc.nextInt();

        if (num1 != 0 && num2 != 0) {
            float total = (float) num1 / num2;
            System.out.println("El resultado de la división es: " + total);
        } else {
            System.out.println("No se puede hacer una división entre 0");
        }
    }

    /**
     *
     */
    public static void ejercicio5() {

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        // Determinamos cuál es el menor y cuál es el mayor
        int menor = (num1 < num2) ? num1 : num2;
        int mayor = (num1 > num2) ? num1 : num2;

        // Usamos cortocircuito para verificar si el menor es divisor del mayor
        if (menor != 0 && mayor % menor == 0) {
            System.out.println("El menor número (" + menor + ") es divisor del mayor (" + mayor + ").");
        } else {
            System.out.println("El menor número (" + menor + ") no es divisor del mayor (" + mayor + ").");
        }
    }

    /**
     *
     */
    public static void ejercicio6() {
        int mes;
        do {
            System.out.print("Introduce un número de mes: ");
            mes = sc.nextInt();
            if (mes >= 1 && mes <= 12) {
                switch (mes) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("El mes tiene 31 días");
                        break;
                    case 2:
                        System.out.println("El mes tiene 28 días");
                        break;

                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("El mes tiene 30 días");
                        break;

                }
            } else {
                System.out.println("El numero de mes debe ser entre 1 y 12");
            }
        } while (mes < 1 || mes > 12);
        System.out.println("Programa terminado.");
    }

    /**
     *
     */
    public static void ejercicio7() {
        int dia;
        do {
            System.out.println("Introduce el número del día: ");
            dia = sc.nextInt();
            if ((dia < 1) || (dia > 7)) {
                System.out.println("Día incorrecto");
            } else {
                switch (dia) {
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                        break;
                    case 3:
                        System.out.println("Miércoles");
                        break;
                    case 4:
                        System.out.println("Jueves");
                        break;
                    case 5:
                        System.out.println("Viernes");
                        break;
                    case 6:
                        System.out.println("Sábado");
                        break;
                    case 7:
                        System.out.println("Domingo");
                        break;
                    default:

                        break;
                }
            }
        } while (dia < 1 || dia > 7);
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
        int ant = 0, ant2 = 1, num;
        for (int i = 1; i <= 12; i++) {
            System.out.println(ant);
            num = ant + ant2;

            ant = ant2;
            ant2 = num;
        }
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

    }

    /**
     *
     */
    public static void ejercicio16() {

        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        String cadena = "*";
        for (int i = 0; i < num; i++) {
            System.out.println(cadena);
            cadena += "*";
        }
    }

    /**
     *
     */
    public static void ejercicio17() {

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
