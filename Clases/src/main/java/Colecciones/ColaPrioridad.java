package Colecciones;

import java.util.PriorityQueue;

public class ColaPrioridad {
    public static void main(String[] args) {
        PriorityQueue<Tarea> colaPrioridad = new PriorityQueue<>();
        colaPrioridad.add(new Tarea("Tarea 1", 3)); // Prioridad 3 (baja)
        colaPrioridad.add(new Tarea("Tarea 2", 1)); // Prioridad 1 (alta)
        colaPrioridad.add(new Tarea("Tarea 3", 2)); // Prioridad 2 (media)
        System.out.println("Tarea con mayor prioridad: " + colaPrioridad.poll());
    }
}

class Tarea implements Comparable<Tarea> {
    String nombre;
    int prioridad;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        return this.prioridad - otraTarea.prioridad; // Prioridad más baja = mayor prioridad
    }

    @Override
    public String toString() {
        return nombre;
    }
}
