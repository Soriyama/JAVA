package Colecciones;

import java.util.Arrays;

public class Ej_10 {

        public static void main(String[] args) {
            String [] array = {"Maria", "Pedro", "Isabel", "Laura"};
            String [] arrayClonado = Arrays.copyOf(array,array.length);
            System.out.println("Array primario");
            recorrerArray(array);
            System.out.println();
            System.out.println("Array clonado");
            recorrerArray(arrayClonado);
            array[1]="Marcos";
            System.out.println();
            System.out.println("Array primario");
            recorrerArray(array);
            System.out.println();
            System.out.println("Array clonado");
            recorrerArray(arrayClonado);
        }

        public static void recorrerArray(String[] array){
            for (String arr: array){
                System.out.println(arr);
            }
        }
    }
