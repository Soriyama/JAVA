package Colecciones;

public class Ej_8 {
    public static void main(String[] args) {
        String [] array = {"Maria", "Pedro", "Isabel", "Laura"};
        String [] arrayClonado = array.clone();
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
