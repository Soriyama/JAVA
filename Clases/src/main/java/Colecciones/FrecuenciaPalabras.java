package Colecciones;

import java.util.HashMap;

public class FrecuenciaPalabras {
    public static void main(String[] args) {
        String texto = "Este es un ejemplo de texto con palabras repetidas repetidas";
        String[] palabras = texto.split(" ");
        HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();
        for (String palabra : palabras) {
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }
        System.out.println("Frecuencia de palabras: " + frecuenciaPalabras);
    }
}
