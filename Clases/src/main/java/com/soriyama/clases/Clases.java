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
    private static Cuenta cuenta;

    public static void main(String[] args) {
        int numeroEjercicios = 17; // Número total de ejercicios
        int opcion;

        do {
            System.out.println("Selecciona el ejercicio del bloque UT-5:");
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
        Perro can1 = new Perro();
        Perro can2 = new Perro(40,20f,"grrr","Carne", false);

        can1.setAlto(15);
        can1.setPeso(8.5f);
        can1.setSonido("Bark");
        can1.setDomestico(true);

        System.out.println("El perro 1 es " + can1.getAlto() + " cm de alto, pesa " + can1.getPeso() + ", hace " + can1.getSonido() + " y " + (can1.isDomestico() == true ? "es domestico" : "no es domestico"));

        System.out.println("El perro 2 es " + can2.getAlto() + " cm de alto, pesa " + can2.getPeso() + ", hace " + can2.getSonido() + ", come " + can2.getAlimentacion() + " y " + (can2.isDomestico() == true ? "es domestico" : "no es domestico"));

    }

    public static void ejercicio5() {
    Rectangulo rectangulo1 = new Rectangulo();
    Rectangulo rectangulo2 = new Rectangulo(15.1,20,"blanco");
    rectangulo1.setAncho(14.1);
    rectangulo1.setAlto(10);
    rectangulo1.setColor("azul");
        System.out.println("El rectangulo 1 tiene un alto, ancho y color de:" + rectangulo1.getAlto() + ", " + rectangulo1.getAncho()+ " y es " + rectangulo1.getColor());
        System.out.println("El rectangulo 2 tiene un alto, ancho y color de:" + rectangulo2.getAlto() + ", " + rectangulo2.getAncho()+ " y es " + rectangulo2.getColor());
    }

    public static void ejercicio6() {
        System.out.println("Inserta el radio de la 1ª circunferencia: ");
        double radio1 = sc.nextDouble();
        System.out.println("Inserta el radio de la 2ª circunferencia: ");
        double radio2 = sc.nextDouble();

        Circulo circulo1 = new Circulo();
        circulo1.setRadio(15.5);
        System.out.println("1ª circunferencia:");
        System.out.println("Radio: "+ circulo1.getRadio());
        System.out.println("Diámetro: "+ circulo1.calcularDiametro());
        System.out.println("Circunferencia: "+ circulo1.calcularCircunferencia());
        System.out.println("Superficie: "+ circulo1.calcularSuperficie());

        System.out.println();

        Circulo circulo2 = new Circulo(radio2);
        System.out.println("2ª circunferencia:");
        System.out.println("Radio: "+ circulo2.getRadio());
        System.out.println("Diámetro: "+ circulo2.calcularDiametro());
        System.out.println("Circunferencia: "+ circulo2.calcularCircunferencia());
        System.out.println("Superficie: "+ circulo2.calcularSuperficie());

    }

    public static void ejercicio7() {

    }

    public static void ejercicio8() {

    }

    public static void ejercicio9() {

    }

    public static void ejercicio10() {
        Cuenta cuenta = new Cuenta("Esteban", 35.5);
        cuenta.ingresar(50.2);
        System.out.println();
        cuenta.retirar(40);
        System.out.println();
        cuenta.retirar(47);
    }

    public static void ejercicio11() {

    }

    public static void ejercicio12() {
    EjemplarLibro libro1= new EjemplarLibro("El Quijote");
    EjemplarLibro libro2= new EjemplarLibro("El señor de los anillos");

    boolean prestamo1 = libro1.prestar();
        System.out.println("El libro de El Quijote " + (prestamo1? "se peude prestar" : "ya esta prestado"));
        System.out.println();
        EjemplarLibro libro3= new EjemplarLibro(libro1);
        System.out.println(libro3);
        boolean prestamo2 = libro1.prestar();
        System.out.println("El libro de El Quijote " + (prestamo2? "se peude prestar" : "ya esta prestado"));
        System.out.println();

        boolean devolucion1 = libro1.devolver();
        System.out.println("El libro de El Quijote " + (devolucion1? "se ha devuelto" : "no esta prestado"));
        System.out.println();
        boolean prestamo3 = libro1.prestar();
        System.out.println("El libro de El Quijote " + (prestamo3? "se peude prestar" : "ya esta prestado"));

    }

    public static void ejercicio13() {

    }

    public static void ejercicio14() {

    }

    public static void ejercicio15() {

    }

    public static void ejercicio16() {

    }

    public static void ejercicio17() {

    }

}
