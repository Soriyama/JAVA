package Colecciones;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ej_6 {

        public static void main (String args []){
            Scanner sc = new Scanner(System.in);
            Empleado [] empleados = new Empleado[4];
            empleados[0]=new Empleado(1,"Maria", 45, 40000);
            empleados[1]=new Empleado(2,"Juan", 33, 37000);
            empleados[2]=new Empleado(3,"Sara", 27, 35000);
            empleados[3]=new Empleado(4,"Pedro", 55, 55000);
            String opcion= "z";
            String seleccion;
            do{
                System.out.println("Elige una opcion: ");
                System.out.println("a. Ordenar por edad");
                System.out.println("b. Ordenar por numero de empleado");
                System.out.println("c. Ordenar por nombre");
                System.out.println("d. Ordenar por salario");
                System.out.println("e. Por nombre en orden descendente");
                System.out.println("f. Por salario en orden descendente");
                System.out.println("z. Salir");
                System.out.print("Selección: ");
                seleccion = sc.nextLine();

                switch (seleccion){
                    case "a":
                    Arrays.sort(empleados);
                        System.out.println("Ordenada por Edad: " + Arrays.toString(empleados));
                        break;
                    case "b":
                        Arrays.sort(empleados, new EmpleadoComparadorNumeroEmpleado());
                        System.out.println("Ordenada por numero de empleado: " + Arrays.toString(empleados));
                        break;
                    case "c":
                        Arrays.sort(empleados, new EmpleadoComparadorNombre());
                        System.out.println("Ordenada por Nombre: " + Arrays.toString(empleados));
                        break;
                    case "d":
                        Arrays.sort(empleados, new EmpleadoComparadorSalario());
                        System.out.println("Ordenada por Salario: " + Arrays.toString(empleados));
                        break;
                    case "e":
                        Arrays.sort(empleados, new EmpleadoComparadorNombreDescendente());
                        System.out.println("Ordenada por Nombre: " + Arrays.toString(empleados));
                        break;
                    case "f":
                        Arrays.sort(empleados, new EmpleadoComparadorSalarioDescendente());
                        System.out.println("Ordenada por Salario: " + Arrays.toString(empleados));
                        break;
                    case "z":
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("selección no correcta");
                }
            }while (!opcion.equals(seleccion));

        }

    }
    class EmpleadoComparadorSalario implements Comparator<Empleado>{
    public int compare(Empleado emp1, Empleado emp2){
        return  emp1.getSalario() - emp2.getSalario();
    }
    }

class EmpleadoComparadorNumeroEmpleado implements Comparator<Empleado>{
    public int compare(Empleado emp1, Empleado emp2){
        return  emp1.getnEmpleado() - emp2.getnEmpleado();
    }
}
class EmpleadoComparadorNombre implements Comparator<Empleado> {
    @Override
    public int compare(Empleado emp1, Empleado emp2) {
        return emp1.getNombre().compareTo(emp2.getNombre());
    }
}
class EmpleadoComparadorNombreDescendente implements Comparator<Empleado> {
    @Override
    public int compare(Empleado emp1, Empleado emp2) {
        return emp2.getNombre().compareTo(emp1.getNombre());
    }
}
class EmpleadoComparadorSalarioDescendente implements Comparator<Empleado> {
    @Override
    public int compare(Empleado emp1, Empleado emp2) {
        return emp2.getSalario() - emp1.getSalario();
    }
}
