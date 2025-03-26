package Colecciones;
import java.util.LinkedList;
import java.util.Iterator;

public class ListaTareas {
    public static void main(String[] args) {
        LinkedList<String> tareasPendientes = new LinkedList<>();
        tareasPendientes.add("Hacer la compra");
        tareasPendientes.add("Estudiar para el examen");
        tareasPendientes.add("Llamar al médico");
        System.out.println("Tareas pendientes: " + tareasPendientes);
        Iterator<String> iterador = tareasPendientes.iterator();
        while (iterador.hasNext()) {
            String tarea = iterador.next();
            if (tarea.equals("Hacer la compra")) {
                iterador.remove(); // Marcar como completada
            }
        }
        System.out.println("Tareas pendientes después de completar una: " + tareasPendientes);
    }
}