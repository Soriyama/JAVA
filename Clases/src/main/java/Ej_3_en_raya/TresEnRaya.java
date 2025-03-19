package Ej_3_en_raya;
import java.util.Scanner;

public class TresEnRaya {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int seleccion;
       do{
           System.out.println("**** 3 EN RAYA ****");
           System.out.println("Menú:");
           System.out.println("1- Jugar 2 jugadores");
           System.out.println("2- Jugar 1 jugador (contra la máquina)");
           System.out.println("3- Salir");
           System.out.print("Selección:");
           seleccion = sc.nextInt();
           switch (seleccion){
               case 1:
                   System.out.println("Opción 1");
                   break;
               case 2:
                   System.out.println("Opción 2");
                   break;
               case 3:
                   System.out.println("Gracias por jugar");
                   break;
               default:
                   System.out.println("Opcion no valida");
                   break;

           }
       }while (seleccion != 3);

    }
}
