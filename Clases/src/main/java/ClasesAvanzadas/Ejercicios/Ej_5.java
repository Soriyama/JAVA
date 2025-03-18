package ClasesAvanzadas.Ejercicios;

public class Ej_5 {
    public static void main(String[] args) {
        String [] modulos={"Matemáticas", "Inglés", "Ciencias", "Historia"};
        Alumno alumno = new Alumno(modulos, "Juan", "Calo", 20);
        alumno.mostrarInformacion();
        System.out.println();
        Profesor profesor = new Profesor("b345673f", "668884445", "Lunes a Viernes 9:00 - 17:00", "Ana", "Calvo", 30 );
        profesor.mostrarInformacion();
    }
}

 class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos,int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Edad: "+ getEdad());
    }

}

class Profesor extends Persona implements Saludable {
    private String nuss;
    private String telefono;
    private String horario;
    public Profesor(String nuss, String telefono, String horario, String nombre, String apellidos, int edad){
        super(nombre, apellidos, edad);
        this.nuss=nuss;
        this.telefono=telefono;
        this.horario=horario;
    }
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("NUSS: "+ this.nuss);
        System.out.println("Teléfono: "+ this.telefono);
        System.out.println("Horario: "+ this.horario);

    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy "+this.getNombre()+ " y soy profesor.");
    }
}
class Alumno extends Persona implements Saludable{
    String [] modulos;

    public Alumno(String[] modulos, String nombre, String apellidos, int edad){
        super(nombre, apellidos, edad);
        this.modulos=modulos;
    }
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Módulos: ");
        int i = 1;
        for ( String materias : this.modulos){
            System.out.println(i+"- "+materias);
            i++;
        };
    }
    @Override
    public void saludar() {
        System.out.println("Hola, soy "+this.getNombre()+ " y soy alumno.");
    }
}
