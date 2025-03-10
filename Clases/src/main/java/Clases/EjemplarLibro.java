package com.soriyama.Clases;
import java.time.LocalDate;

public class EjemplarLibro {
    private String tituloLibro;
    private LocalDate fecha;
    private int nEjemplares;
    private boolean prestado;

    public EjemplarLibro(String tituloLibro){
    this.tituloLibro = tituloLibro;
    this.fecha = LocalDate.now();
    this.nEjemplares = 1;
    this.prestado = false;
    }

    public EjemplarLibro(EjemplarLibro libro){
        this.tituloLibro = libro.tituloLibro;
        this.fecha = libro.fecha;
        this.nEjemplares = libro.nEjemplares + 1;
        this.prestado = false;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public boolean prestar(){
        if (this.prestado == true){
            return false;
        }else{
            this.prestado = true;
            return true;
        }
    }
    public boolean devolver(){
        if (this.prestado == false){
            return false;
        }else{
            this.prestado = false;
            return true;
        }
    }

    @Override
    public String toString() {
        return  "Titulo='" + this.tituloLibro + '\'' +
                " (" + this.fecha + ")" +
                "{" + this.nEjemplares +
                "}";
    }
}
