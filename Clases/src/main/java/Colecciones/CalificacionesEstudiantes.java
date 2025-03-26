package Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        HashMap<String, Integer> calificaciones = new HashMap<>();

        // Agregar calificaciones de estudiantes
        calificaciones.put("Ana", 85);
        calificaciones.put("Carlos", 92);
        calificaciones.put("Elena", 78);
        calificaciones.put("Javier", 95);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();

        if (calificaciones.containsKey(nombreEstudiante)) {
            int calificacion = calificaciones.get(nombreEstudiante);
            System.out.println("La calificación de " + nombreEstudiante + " es: " + calificacion);
        } else {
            System.out.println("No se encontró información para el estudiante " + nombreEstudiante);
        }

        scanner.close();
    }
}
