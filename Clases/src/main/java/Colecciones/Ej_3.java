package Colecciones;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random= new Random();
        ArrayList <Integer> miArray = new ArrayList<>();
        for(int i = 0; i <= 4; i++){
            miArray.add(random.nextInt(10));
        }
        System.out.print("Inserta un número para buscar: ");
        int numero = sc.nextInt();

        for(int i : miArray){
            if (i == numero){
                System.out.println("El numero existe recorriendo el array");
            }
        }

        System.out.println(miArray.contains(numero)? "Contiene el numero " + numero : "No contiene el numero "+numero);

        for(int i = 0 ; i< miArray.size(); i++){
            System.out.println("La posición "+ i + " contiene el número " + miArray.get(i));
        }
    }


}
