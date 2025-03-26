package Colecciones;

import java.lang.Comparable;
public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private int salario;
    private int edad;
    private int nEmpleado;
    public Empleado (int nEmpleado, String nombre, int edad, int salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
        this.nEmpleado= nEmpleado;

    }
    public String getNombre(){
        return nombre;
    }
    public int getSalario(){
        return salario;
    }
    public int getEdad(){
        return edad;
    }
    public int getnEmpleado() { return nEmpleado;}

    public void setnEmpleado(int nEmpleado) {this.nEmpleado = nEmpleado;}
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSalario(int salario){
        this.salario=salario;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public String toString(){
        return " ["+this.nEmpleado+", "+this.nombre+ ", "+ this.edad+", "+this.salario+ "] ";
    }
    @Override
    public int compareTo(Empleado empleado){
        return this.edad- empleado.edad;
    }
}