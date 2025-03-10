package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //miLista.add("Domingo");

        for(Object elemento: miLista){
            System.out.println("Dia de la semana: " + elemento );
        }
    }
}
