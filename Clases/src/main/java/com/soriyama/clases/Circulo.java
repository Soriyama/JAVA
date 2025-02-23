package com.soriyama.clases;

public class Circulo {
    private double radio;
    public Circulo(double radio){
        this.radio=radio;
    }
    public Circulo(){
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public double calcularCircunferencia(){
        double circunferencia = 2 * 3.1416 * this.radio;
        return circunferencia;
    }
    public double calcularSuperficie(){
        double superficie = 3.1416 * (this.radio * this.radio);
        return superficie;
    }
    public double calcularDiametro(){
        double diamtro = this.radio * 2;
        return diamtro;
    }
}
