package Colecciones;

public class Persona {
    private String nombre;
    private int edad;
    Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //getters y setters
    @Override
    public String toString() {
        return "nombre=" + nombre + ",{ edad=" + edad + '}';
    }
}