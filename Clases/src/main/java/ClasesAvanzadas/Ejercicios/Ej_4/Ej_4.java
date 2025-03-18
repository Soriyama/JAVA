package ClasesAvanzadas.Ejercicios.Ej_4;

public class Ej_4 {
    public static void main(String[] args) {
    Familiar familiar = new Padre(13, "Juan", 2);
    familiar.metodo2();
    }
}
abstract class Familiar {
    protected int edad;
    protected String nombre;
/*Esta clase NO se puede instanciar, este constructor sólo va a ser utilizado por las clases hijas*/
protected Familiar(int edad, String nombre){
this.edad=edad;
this.nombre=nombre;
}
public void metodo1(){
//cuerpo del método
}
public abstract void metodo2();
protected void metodo3(){
//cuerpo del metodo
}
//Necesitamos cambiar de private a protected para poder acceder al método desde las clases hijas
    protected void metodo4(){
//cuerpo del metodo
System.out.println("PREMIO!!!");
}
}
class Padre extends Familiar{
private int numHijos;
Padre (int edad, String nombre, int numHijos) {
super(edad, nombre);
this.numHijos=numHijos;
}
public void metodo2(){
//estamos obligados a definir este método porque Padre no es una clase abstracta
metodo4();
}
}
