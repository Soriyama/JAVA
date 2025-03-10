package com.soriyama.Clases;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular){
        this.titular=titular;
    }
    public Cuenta(String titular, double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public String toString() {
        return "Cuenta{" +
                "titular='" + this.titular + '\'' +
                ", cantidad=" + this.cantidad +
                '}';
    }

    public void ingresar(double cantidad){
        if (cantidad >=0 ){
            System.out.println("Cantidad anterior: " +this.cantidad);
            this.cantidad+=cantidad;
            System.out.println("Cantidad actual: "+ this.cantidad);
        }

    }
    public void retirar(double cantidad){
    if (cantidad < this.cantidad){
        this.cantidad -= cantidad;
    }else if (cantidad > this.cantidad){
        this.cantidad = 0;
    }
        System.out.println("Cantidad actual: "+ this.cantidad);
    }
}
