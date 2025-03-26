package Colecciones;
import java.util.ArrayList;
import java.util.HashSet;

public class EliminarDuplicados {
    public static void main(String[] args) {
        ArrayList<Integer> listaConDuplicados = new ArrayList<>();
        listaConDuplicados.add(1);
        listaConDuplicados.add(2);
        listaConDuplicados.add(2);
        listaConDuplicados.add(3);
        HashSet<Integer> conjuntoSinDuplicados = new HashSet<>(listaConDuplicados); // HashSet no permite duplicados
        System.out.println("Elementos únicos: " + conjuntoSinDuplicados); // Imprime los elementos únicos
    }
}
