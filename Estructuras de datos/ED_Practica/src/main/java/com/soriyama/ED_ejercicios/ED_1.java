/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.soriyama.repaso_4;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.AbstractListModel;
/**
 *
 * @author esteb
 */
public class Repaso_4 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroEjercicios = 17; // Número total de ejercicios
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
     * 1. Realiza un programa en Java que muestre un menú al usuario en el que
     * le va a permitir elegir entre una de las siguientes opciones: sumar,
     * restar, multiplicar, dividir, potencia o salir. Debe pedir al usuario los
     * datos necesarios para la operación seleccionada (comprobando que los
     * valores son correctos) y una vez ejecutada la operación mostrar el
     * resultado. a. Implementa una función para sumar donde se reciben como
     * entrada dos números y se devuelve la suma de los números. b. Implementa
     * una función para restar donde se reciben como entrada dos números y se
     * devuelve la resta de los números. c. Implementa una función para
     * multiplicar donde se reciben como entrada dos números y se devuelve la
     * multiplicación de los números. d. Implementa una función para dividir
     * donde se reciben como entrada dos números y se devuelve la división de
     * los números. e. Implementa una función para calcular la potencia del
     * primero de los números elevado al segundo donde se reciben como entrada
     * dos números y se devuelve la potencia.. f. Implementa las opciones
     * anteriores para enteros y para float. Pruébalo introduciendo distintas
     * combinaciones de enteros y flotantes, ¿qué pasa? g. Implementa una nueva
     * versión de la potencia utilizando una función recursiva.
     *
     */
    public static void ejercicio1() {
        int opcion;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("5- Potencia");
            System.out.println("6- Salir");

            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 6) {
                System.out.println("Elije una opcion entre 1 y 6 ");
            }
            System.out.println("Introduce el primer numero");
            int a = sc.nextInt();
            System.out.println("Introduce el segundo numero");
            int b = sc.nextInt();
            double resultado;
            switch (opcion) {
                case 1:
                    resultado = sumar(a, b);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;
                case 2:
                    resultado = restar(a, b);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(a, b);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;
                case 4:
                    resultado = dividir(a, b);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;
                case 5:
                    resultado = potencia(a, b);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;
            }
        } while (opcion != 6);

    }

    public static double sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static double restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static double multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static double dividir(int a, int b) {
        int resultado = a / b;
        return resultado;
    }

    public static double potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; // Caso base: cualquier número elevado a 0 es 1
        }
        if (exponente < 0) {
            return 1.0 / potencia(base, -exponente); // Manejo de exponentes negativos
        }
        return base * potencia(base, exponente - 1); // Llamada recursiva
    }

    /**
     * 2. Crea un programa que defina un array de enteros de una dimensión con
     * 12 posiciones y que almacene los números del 1 al 12. Imprime el valor de
     * la posición 5. ¿Qué valor es? ¿y en la quinta posición?
     */
    public static void ejercicio2() {
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("El valor de la posicion 5 es: " + arr[5]);

    }

    /**
     * Implementa un programa que defina un array de Strings con 12 posiciones e
     * inicialízalo con los meses del año.
     */
    public static void ejercicio3() {
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
    }

    /**
     * Recorre el array del ejercicio anterior utilizando un bucle for y muestra
     * por pantalla los meses del año
     */
    public static void ejercicio4() {
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        for (int i = 0; i < meses.length; i++) {
            System.out.println((i + 1) + "- " + meses[i]);
        }

    }

    /**
     * Repite el ejercicio anterior, pero utilizando un foreach para recorrer el
     * array.
     */
    public static void ejercicio5() {
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        for (String mesesAnio : meses) {
            System.out.println(mesesAnio);
        }
    }

    /**
     *
     */
    public static void ejercicio6() {
        int[] edad = {1, 2, 3, 4, 5};
        for (int i = 0; i < edad.length; i++) {
            edad[i] = 0;
        }
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "]=" + edad[i]);
        }
    }

    /**
     *
     */
    public static void ejercicio7() {
        int[] edad = {1, 2, 3, 4, 5};
        for (int e : edad) {
            e = 0;
        }
        for (int e : edad) {
            System.out.println(e);
        }
    }

    /**
     * Crear un programa que defina un array de enteros de 10 posiciones y que
     * solicite al usuario que introduzca valores para todas sus posiciones
     */
    public static void ejercicio8() {
        int[] arr = new int[10];
        int posicion = 0;
        do {
            System.out.println("Introduce un numero en la posicion: " + posicion + " del array");
            arr[posicion] = sc.nextInt();
            System.out.println("Posicion guardada");
            posicion++;
        } while (posicion != 10);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("El numero de la posicion " + i + " es: " + arr[i]);
        }

    }

    /**
     * Añádele al programa anterior el código para que sume los elementos del
     * array. Versión con contador que recorre el array.
     */
    public static void ejercicio9() {
        int[] arr = new int[10];
        int posicion = 0;
        do {
            System.out.println("Introduce un numero en la posicion: " + posicion + " del array");
            arr[posicion] = sc.nextInt();
            System.out.println("Posicion guardada");
            posicion++;
        } while (posicion != 10);
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
        }
        System.out.println("La suma de todas las posiciones es: " + suma);
    }

    /**
     * Repite el ejercicio anterior utilizando un for-each
     */
    public static void ejercicio10() {
        int[] arr = new int[10];
        int posicion = 0;
        do {
            System.out.println("Introduce un numero en la posicion: " + posicion + " del array");
            arr[posicion] = sc.nextInt();
            System.out.println("Posicion guardada");
            posicion++;
        } while (posicion != 10);
        int suma = 0;
        for (int posiciones : arr) {
            suma += posiciones;

        }
        System.out.println("La suma de todas las posiciones es: " + suma);
    }

    /**
     * Añádele al programa anterior el código para que calcule la media de los
     * valores en las posiciones pares
     */
    public static void ejercicio11() {
        int[] arr = new int[10];
        int posicion = 0;
        do {
            System.out.println("Introduce un numero en la posicion: " + posicion + " del array");
            arr[posicion] = sc.nextInt();
            System.out.println("Posicion guardada");
            posicion++;
        } while (posicion != arr.length);
        int suma = 0;
        int cantPosiciones = 0;
        for (int i = 0; i < arr.length; i++) {
            int resto = i % 2;
            if (resto == 0) {
                suma += arr[i];
                cantPosiciones++;
            }
        }
        double media = suma / (double) cantPosiciones;

        System.out.println("La media de los valores de las posiciones pares es: " + media);

    }

    /**
     * Crea un programa que defina un array bidimensional que tenga dos
     * elementos en una dimensión y tres en la otra. Inicialízalo
     */
    public static void ejercicio12() {
        int[][] arr = {
            {1, 2, 3}, // Primera fila con tres elementos
            {4, 5, 6} // Segunda fila con tres elementos
        };
    }

    /**
     * Crea un array de tipo int que tenga 5 valores inicializados
     * aleatoriamente entre 1 y 10. Posteriormente pregunta al usuario un valor
     * en ese rango y comprueba si está en el array. Realiza la búsqueda
     * recorriendo el array. ¿Sería posible comprobarlo sin recorrer el array?
     */
    public static void ejercicio13() {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }

        System.out.println("Introduce un numero para verificar si existe: ");
        int seleccion = sc.nextInt();
        int pos = 0;
        for (int numeros : arr) {
            if (numeros == seleccion) {
                System.out.println("El numero existe en la posicion " + pos);
            } else {
                System.out.println("El numero no existe");
            }
            pos++;
        }
    }

    /**
     * Crea un array de enteros de 10 posiciones y pide al usuario que
     * introduzca los valores para inicializar el array. Calcula la suma y la
     * media de los valores introducidos.
     */
    public static void ejercicio14() {

    }

    /**
     * Crea un matriz (array de dos dimensiones) de 3 y 2 posiciones en cada
     * dimensión. Pide al usuario los valores para inicializar el array. Calcula
     * la suma y la media por cada fila de la matriz.
     */
    public static void ejercicio15() {
        int[][] matriz = new int[3][2];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Introduce el numero en la fila " + fila + " columna " + columna);
                matriz[fila][columna] = sc.nextInt();
            }
        }

        for (int fila = 0; fila < matriz.length; fila++) {

            int sumaFila = 0;

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                sumaFila += matriz[fila][columna];

            }
            double promedio = sumaFila / (double) matriz[fila].length;
            System.out.println("La suma de la fila " + fila + ": " + sumaFila);
            System.out.println("El promedio de la fila " + fila + ": " + promedio);

        }

    }

    /**
     * Repite el ejercicio anterior pero calculando la suma y la media por cada
     * columna de la matriz.
     */
    public static void ejercicio16() {
        int[][] matriz = new int[3][2];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Introduce el numero en la fila " + fila + " columna " + columna);
                matriz[fila][columna] = sc.nextInt();
            }
        }

        for (int columna = 0; columna < matriz[0].length; columna++) {

            int sumaColumna = 0;

            for (int fila = 0; fila < matriz.length; fila++) {
                sumaColumna += matriz[fila][columna];

            }
            double promedio = sumaColumna / (double) matriz.length;
            System.out.println("La suma de la columna " + columna + ": " + sumaColumna);
            System.out.println("El promedio de la fila " + columna + ": " + promedio);

        }
    }

    /**
     * Repite el ejercicio anterior pero calculando la suma y la media total.
     */
    public static void ejercicio17() {
        int[][] matriz = new int[3][2];

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Introduce el numero en la fila " + fila + " columna " + columna);
                matriz[fila][columna] = sc.nextInt();
            }
        }
        int sumaTotal = 0;
        int divisor = 0;
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {
                sumaTotal += matriz[fila][columna];
                divisor++;
            }
        }
        double promedio = sumaTotal / (double) divisor;
        System.out.println("La suma total es: " + sumaTotal);
        System.out.println("El promedio total es: " + promedio);
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
