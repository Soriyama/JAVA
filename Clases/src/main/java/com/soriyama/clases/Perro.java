/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soriyama.clases;

/**
 *
 * @author esteb
 */
public class Perro {
//Definimos las propiedades que serán variables de tipo primitivo
//o de otras clases

    private float alto;
    private float peso;
    private String sonido;
    private String alimentacion;
    private boolean domestico;
//Creamos un constructor que servirá para crear objetos
//de esta clase e inicializar las propiedades de los objetos

    Perro() {
        alto = 0.0f;
        peso = 0.0f;
        sonido = new String();
        alimentacion = new String();
        domestico = false;
    }

    Perro(float _alto, float _peso, String _sonido,
            String _alimentacion, boolean _domestico) {
        alto = _alto;
        peso = _peso;
        sonido = _sonido;
        alimentacion = _alimentacion;
        domestico = _domestico;
    }
//Creamos los método que caracterizan el comportamiento del objeto

    public float getAlto() {
        return alto;
    }

    public void setAlto(float _alto) {
        alto = _alto;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float _peso) {
        peso = _peso;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String _sonido) {
        sonido = _sonido;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String _alimentacion) {
        alimentacion = _alimentacion;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean _domestico) {
        domestico = _domestico;
    }
}
