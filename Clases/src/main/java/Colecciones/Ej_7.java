package Colecciones;

public class Ej_7 {
    public static void main(String[] args) {
    int [] array = {1,2,3,4};
    int [] arrayClonado = array.clone();
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
