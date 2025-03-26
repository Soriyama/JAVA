package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> mA = new ArrayList<>();
        String [] nombres = {"Juan", "Maria", "lucia", "Natu", "Esteban"};
        for(int i = 0 ; i <=4; i++){
            mA.add(i,nombres[i]);
        }
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();

        for (String nom : mA){
            System.out.println(nom);
            if (nom.equals(nombre)){
                System.out.println("El nombre está en la lista (Bucle)");
            }
        }

        System.out.println(mA.contains(nombre)?"El nombre está en la lista (Directo)": "El nombre no está en la lista");
    }
}
