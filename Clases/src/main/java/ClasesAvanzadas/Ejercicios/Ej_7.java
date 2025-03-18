package ClasesAvanzadas.Ejercicios;

public class Ej_7 {
}
class Animal {
    private String nombre;
    private int edad;
    public Animal (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+ this.edad);
    }
}
class Perro extends Animal implements Saludable{
    private String raza;
    private String tamano;
    public Perro(String nombre, int edad, String raza, String tamano){
        super(nombre, edad);
        this.raza=raza;
        this.tamano=tamano;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Información del Perro: ");
      super.mostrarInformacion();
        System.out.println("Raza: "+ this.raza);
        System.out.println("Tamaño: "+this.tamano);
    }
    @Override
    public void saludar() {
        System.out.println("¡Guau!");
    }
}
class Gato extends Animal implements Saludable{
    private String raza;
    public Gato(String nombre, int edad, String raza ){
        super(nombre, edad);
        this.raza=raza;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Información del Gato: ");
        super.mostrarInformacion();
        System.out.println("Raza: "+ this.raza);
    }
    @Override
    public void saludar() {
        System.out.println("¡Miau!");
    }
}
class Loro extends Animal implements Saludable{
    private String color;
    public Loro(String nombre, int edad, String color){
        super(nombre, edad);
        this.color=color;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Información del Loro: ");
        super.mostrarInformacion();
        System.out.println("Color: "+ this.color);
    }
    @Override
    public void saludar() {
        System.out.println("¡Hola hola!");
    }
}
class Pez extends Animal implements Saludable {
    private String color;
    private String tamano;
    public Pez(String nombre, int edad, String color, String tamano){
        super(nombre, edad);
        this.color=color;
        this.tamano=tamano;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("Información del Pez: ");
        super.mostrarInformacion();
        System.out.println("Color: "+ this.color);
        System.out.println("Tamaño: "+this.tamano);
    }
    @Override
    public void saludar() {
        System.out.println("¡Blub blub!");
    }
}