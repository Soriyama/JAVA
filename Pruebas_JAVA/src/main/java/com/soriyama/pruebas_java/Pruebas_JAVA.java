/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.soriyama.pruebas_java;

/**
 *
 * @author esteb
 */
public class Pruebas_JAVA {

    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        obj1.imprimir(24.3, 5);
    }

}

class Clase1 {

    private double valor = 9.8;
    private int x = 7;

    public void imprimir(double valor, int x) {
        System.out.print(valor + " " + this.x
        );
    }
}
