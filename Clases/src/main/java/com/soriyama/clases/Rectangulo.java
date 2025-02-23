package com.soriyama.clases;

public class Rectangulo {
    private double alto;
    private double ancho;
    private String color;

    public Rectangulo(){
    }
    public Rectangulo(double alto, double ancho, String color){
        this.alto=alto;
        this.ancho=ancho;
        this.color=color;
    }

    public double getAlto() {
        return alto;
    }
    public double getAncho() {
        return ancho;
    }
    public String getColor() {
        return color;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
