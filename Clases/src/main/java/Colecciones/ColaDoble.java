package Colecciones;

import java.util.ArrayDeque;

public class ColaDoble {
    public static void main(String[] args) {
        ArrayDeque<Integer> colaDoble = new ArrayDeque<>();
        colaDoble.addFirst(1);
        colaDoble.addLast(2);
        colaDoble.addFirst(3);
        System.out.println("Elementos en orden inverso: ");
        while (!colaDoble.isEmpty()) {
            System.out.println(colaDoble.pollLast()); // pollLast() elimina y devuelve el último elemento
        }
    }
}
