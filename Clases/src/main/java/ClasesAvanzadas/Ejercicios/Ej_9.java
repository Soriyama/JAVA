package ClasesAvanzadas.Ejercicios;

public class Ej_9 {
    public static void main(String[] args) {
        String [] modulos={"Matemáticas", "Inglés", "Ciencias", "Historia"};
        Alumno alumno = new Alumno(modulos, "Juan", "Calo", 20);
        Profesor profesor = new Profesor("b345673f", "668884445", "Lunes a Viernes 9:00 - 17:00", "Ana", "Calvo", 30 );
        Perro perro = new Perro("Pampo", 3, "Chihuahuana", "Mediano");
        Gato gato = new Gato("Katy", 15, "Siamés");
        Loro loro = new Loro("Lorito", 10 , "Amarillo/Verde");
        Pez pez = new Pez("Pescadito", 2, "Gris", "Diminuto");
        Saludable [] llamarSaludo = new Saludable[6];
        llamarSaludo[0]=profesor;
        llamarSaludo[1]=alumno;
        llamarSaludo[2]=perro;
        llamarSaludo[3]=gato;
        llamarSaludo[4]=loro;
        llamarSaludo[5]=pez;

        for (Saludable saludable : llamarSaludo) {
            saludable.saludar(); 
        }

    }
}
