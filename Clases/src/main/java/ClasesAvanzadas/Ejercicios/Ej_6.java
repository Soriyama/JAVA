package ClasesAvanzadas.Ejercicios;

public class Ej_6 {
    public static void main(String[] args) {
        String [] modulos={"Matemáticas", "Inglés", "Ciencias", "Historia"};
        Alumno alumno = new Alumno(modulos, "Juan", "Calo", 20);
        Profesor profesor = new Profesor("b345673f", "668884445", "Lunes a Viernes 9:00 - 17:00", "Ana", "Calvo", 30 );
        System.out.println();

        Persona[] arrayPersonas = new Persona[2];
        arrayPersonas[0]= alumno;
        arrayPersonas[1]= profesor;

        for (int i=0; i< arrayPersonas.length; i++){
            Persona persona= arrayPersonas[i];
            System.out.println();
            persona.mostrarInformacion();
        }

    }
}
