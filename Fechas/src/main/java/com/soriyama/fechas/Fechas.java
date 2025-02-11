/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.soriyama.fechas;

/**
 *
 * @author esteb
 */
import java.util.Scanner;
import java.time.LocalDate;

public class Fechas {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Selecciona una opcion para ver el resultado:");
            System.out.println("1- Introducir fecha manualmente sin parsear");
            System.out.println("2- Obtencion de la fecha del sistema");
            System.out.println("3- Introducir fecha manualmente parseando una cadena");
            System.out.print("Seleccion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 ->
                    opcion1();
                case 2 ->
                    opcion2();
                case 3 ->
                    opcion3();
                default ->
                    System.out.println("El numero introducido no corresponde con ninguna opcion");
            }

        } while (opcion != 0);
    }

    public static void opcion1() {
        System.out.println("Introduce el día: ");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el mes: ");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el año: ");
        int año = Integer.parseInt(sc.nextLine());
        LocalDate fecha = LocalDate.of(año, mes, dia);
        System.out.println("La fecha es: " + fecha);
    }

    public static void opcion2() {
        LocalDate fecha = LocalDate.now();
        System.out.println("La fecha actual es: " + fecha);
    }

    public static void opcion3() {
        System.out.println("Introduce fecha con el siguiente formato: AAAA-MM-DD");
        sc.nextLine(); 
        String fecha = sc.nextLine();
      
        LocalDate pfecha = LocalDate.parse(fecha);
        System.out.println("La fecha introducida es: " + pfecha);
    }
}
