package Colecciones;
import Colecciones.*;

import java.util.ArrayList;

public class Ej_2 {
    public static void main(String[] args) {
        ArrayList <Persona> coleccion = new ArrayList<>();
        Persona persona1 = new Persona("Esteban", 35);
        Persona persona2 = new Persona("Natu", 37);
        coleccion.add(0,persona1);
        coleccion.add(1,persona2);

        for (Persona ver : coleccion){
            System.out.println(ver.toString());
        }
    }
}
