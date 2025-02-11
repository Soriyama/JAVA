/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soriyama.clases;

/**
 *
 * @author esteb
 */
public class Producto {

    public String nombre;
    public double precio;
    public double IVA;
    public double descuento;

    public Producto(String nom, double p, double IVA) {
        this.nombre = nom;
        this.precio = p;
        this.IVA = IVA;
        this.descuento = 0;
    }

    public double calcularPrecioFinal() {
        double prFin = this.precio + (this.precio
                * this.IVA);
        double prFinDesc = prFin - (prFin
                * this.descuento);
        return prFinDesc;
    }

    public void setDescuento(double desc) {
        this.descuento = desc;
    }
}
