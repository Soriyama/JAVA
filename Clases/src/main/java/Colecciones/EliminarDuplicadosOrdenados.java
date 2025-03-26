package Colecciones;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class EliminarDuplicadosOrdenados {
    public static void main(String[] args) {
        ArrayList<Integer> listaConDuplicados = new ArrayList<>();
        listaConDuplicados.add(1);
        listaConDuplicados.add(4);
        listaConDuplicados.add(2);
        listaConDuplicados.add(2);
        listaConDuplicados.add(3);
        // LinkedHashSet mantiene el orden de inserción
        LinkedHashSet<Integer> conjuntoSinDuplicados = new LinkedHashSet<>(listaConDuplicados);
        System.out.println("Elementos únicos ordenados: " + conjuntoSinDuplicados);
    }
}
