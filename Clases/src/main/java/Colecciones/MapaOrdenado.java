package Colecciones;

import java.util.TreeMap;

public class MapaOrdenado {
    public static void main(String[] args) {
        TreeMap<String, Integer> mapaOrdenado = new TreeMap<>();
        mapaOrdenado.put("Juan", 30); // Añadimos pares clave-valor (clave, valor)
        mapaOrdenado.put("Ana", 25);
        mapaOrdenado.put("Carlos", 35);
        mapaOrdenado.put("Beatriz", 28);

        System.out.println("Pares clave-valor ordenados por nombre:");
        for (String nombre : mapaOrdenado.keySet()) { // Recorremos las claves
            int edad = mapaOrdenado.get(nombre);// Obtenemos el valor asociado a la clave (nombre)
            System.out.println(nombre + ": " + edad);
        }
    }
}