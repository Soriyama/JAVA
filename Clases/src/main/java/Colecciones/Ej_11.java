package Colecciones;

public class Ej_11 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [] arrayClonado= new int[array.length];
        System.arraycopy(array,0,arrayClonado,0,array.length);
        System.out.println("Array primario");
        recorrerArray(array);
        System.out.println();
        System.out.println("Array clonado");
        recorrerArray(arrayClonado);

        arrayClonado[1]=5;

        System.out.println();
        System.out.println("Array primario 2");
        recorrerArray(array);
        System.out.println();
        System.out.println("Array clonado 2");
        recorrerArray(arrayClonado);
    }
    public static void recorrerArray(int[] array){
        for (int arr: array){
            System.out.println(arr);
        }
    }
}