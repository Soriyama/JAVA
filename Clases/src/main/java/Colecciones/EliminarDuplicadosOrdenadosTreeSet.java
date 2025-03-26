package Colecciones;

import java.util.ArrayList;
import java.util.TreeSet;

public class EliminarDuplicadosOrdenadosTreeSet {
    public static void main(String[] args) {
        ArrayList<Integer> listaConDuplicados = new ArrayList<>();
        listaConDuplicados.add(3);
        listaConDuplicados.add(1);
        listaConDuplicados.add(2);
        listaConDuplicados.add(2);
        // TreeSet mantiene el orden natural de los elementos
        TreeSet<Integer> conjuntoSinDuplicados = new TreeSet<>(listaConDuplicados);
        System.out.println("Elementos únicos ordenados: " + conjuntoSinDuplicados);
    }
}
