package ClasesAvanzadas.Ejercicios.Ej_2;
/*
a. Implementa la clase main para que llame haga una llamada al constructor de la clase hija. ¿Cuál es el error? ¿Por qué?
b. ¿Cómo se arregla el error?

 */
public class Ej_2 {
    public static void main(String[] args) {
        Hija hija = new Hija();
        System.out.println(hija.nombre);
        System.out.println(hija.edad);

    }
}
class Padre{
    public String nombre;
    public Padre (String nombre) {this.nombre=nombre;}
}
class Hija extends Padre {
    public int edad;
    public Hija(){
        // El error sucede porque la clase hija no proporciona al contructor de la clase padre el atributo nombre.
        // para solucionar el error hay que definir dicho atributo con super : super("Hija");
        super("Hija");
        edad=10;}

}
