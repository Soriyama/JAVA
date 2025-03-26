package Colecciones.Ej_13;

import java.util.*;
import java.util.Comparator;
public class Ej_13 {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList <Vehiculo> vehiculos = new ArrayList<>();
    public static void main(String[] args) throws FaltaRecursosException {
        Vehiculo vehiculo1 = new CocheElectrico("Opel","Corsa", "Blanco", 18000, 200, 50);
        Vehiculo vehiculo2 = new CocheCombustion("Ford", "Kuga", "Negro", 32000,80,"Gasolina", 30);
        Vehiculo vehiculo3 = new CocheCombustion("Mazda", "Demio", "Morado", 25000,80,"Diesel", 2);
        Vehiculo vehiculo4 = new CocheCombustion("Citroen", "C4", "Rojo", 29000,80,"Hidrógeno", 70);
        Vehiculo vehiculo5 = new CocheElectrico("Mercedes","Clase 3", "Gris", 45000, 500, 9);
        Vehiculo vehiculo6 = new CocheElectrico("Mercedes","Clase 1", "Negro", 60000, 500, 90);
        Collections.addAll(vehiculos, vehiculo1,vehiculo2,vehiculo3,vehiculo4,vehiculo5,vehiculo6);
        int seleccion;
        do {

            System.out.println("CONCESIONARIO");
            System.out.println("Selecciona una opción:");
            System.out.println("0. Salir");
            System.out.println("1. Mostrar todos los coches registrados");
            System.out.println("2. Registrar coche");
            System.out.println("3. Borrar coche");
            System.out.println("4. Mostrar información de un coche");
            System.out.println("5. Ordenar por precio");
            System.out.println("6. Ordenar alfabeticamente por marca");
            System.out.println("7. Ordenar por marca y lugo precio ");
            System.out.println("8. Revisar niveles");
            System.out.print("Selección: ");
            seleccion = entradaDato();
            System.out.println();

            switch (seleccion){
                case 0:
                    System.out.println("¡Hsta luego!");
                    break;
                case 1:
                    mostrarVehiculos();
                    break;
                case 2:
                    registrarVehiculo();
                    break;
                case 3:
                    borrarVehiculo();
                    break;
                case 4:
                    mostrarInfo();
                    break;
                case 5:
                    ordenarPrecio();
                    break;
                case 6:
                    ordenarMarca();
                    break;
                case 7:
                    ordenarMarcaPrecio();
                    break;
                case  8:
                    revisarNiveles();
                    break;
                default:
                    System.out.println("Selección no disponible");
                    break;
            }
        }while (seleccion != 0);
    }
    public static void mostrarVehiculos(){
        if (!vehiculos.isEmpty()) {
            for (Vehiculo coche : vehiculos) {

                System.out.println(coche);
            }
        }else {
            System.out.println("No existen vehículos");
            System.out.println();
        }
        System.out.println();
    }
    public static void registrarVehiculo(){
        System.out.println("Registro de vehiculo:");
        System.out.println("Seleciona una opción:");
        System.out.println("1. Eléctrico");
        System.out.println("2. Combustión");
        int tipo = entradaDato();
        System.out.println();
        sc.nextLine();
        System.out.println("Introduce los datos del vehiculo:");
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Precio: ");
        int precio = sc.nextInt();
        Vehiculo vehiculo;
        if (tipo == 1){

            System.out.print("Capacidad (KWh): ");
            int capacidad = entradaDato();
            System.out.print("Carga actual: ");
            int carga = entradaDato();
            vehiculo = new CocheElectrico(marca,modelo,color,precio,capacidad,carga);
        }else{
            System.out.print("Capacidad de depósito: ");
            int capacidadDeposito = entradaDato();
            System.out.println("Tipo de combustible");
            String [] combustibles ={"Gasolina","Diesel", "Hidrógeno","GLP"};
            String tipoCombustible="";
            for(int i = 0; i<= combustibles.length -1;i++){
                System.out.println((i+1)+"- "+combustibles[i]);
            }
            while (true) {
                System.out.print("Selección: ");
                int seleccion = entradaDato();
                if (seleccion < 0 || seleccion > combustibles.length) {
                    System.out.println("El numero introducido no corresponde con ninguna opción");
                }else{
                    tipoCombustible = combustibles[seleccion -1];
                    break;
                }
            }
            System.out.print("Nivel de combustible: ");
            int nivelCombustible = 0;
            while (true) {
                int nivel = sc.nextInt();
                if (nivel >= 0 || nivel <= 100) {
                    nivelCombustible = nivel;
                    break;
                }else{
                    System.out.println("introduce un valor de 0 a 100");
                }
            }
            vehiculo = new CocheCombustion(marca,modelo,color,precio,capacidadDeposito,tipoCombustible,nivelCombustible);
        }
        int posicion = vehiculos.size();
        vehiculos.add(posicion, vehiculo);
        System.out.println("Vehiculo registrado");
        System.out.println();
    }
    public static void borrarVehiculo(){
    if (!vehiculos.isEmpty()){
        System.out.println("Eliminar registro: ");
        System.out.println();
        int numero = 0;
        for (Vehiculo coche : vehiculos) {
            System.out.println(numero+"- "+coche.getMarca() +" "+ coche.getModelo() );
            numero++;
        }
        while (true) {
            System.out.println("Seleccion: ");
            int seleccion = entradaDato();
            if (seleccion >= 0 && seleccion < numero) {
                vehiculos.remove(seleccion);
                break;
            } else {
                System.out.println("Selecciona un número dentro del rango");
            }
        }

    }else {
        System.out.println("No existen vehiculos");
        System.out.println();
    }
    }
    public static void mostrarInfo(){
        if (!vehiculos.isEmpty()){
            System.out.println("Visualizar información: ");
            System.out.println();
            int numero = 0;
            for (Vehiculo coche : vehiculos) {
                System.out.println(numero+"- "+coche.getMarca() +" "+ coche.getModelo() );
                numero++;
            }
            while (true) {
                System.out.print("Seleccion: ");
                int seleccion = entradaDato();
                if (seleccion >= 0 && seleccion < numero) {
                    Vehiculo coche = vehiculos.get(seleccion);
                    coche.mostrarInfo();
                    break;
                } else {
                    System.out.println("Selecciona un número dentro del rango");
                    System.out.println();
                }
            }

        }else {
            System.out.println("No existen vehiculos");

        }
        System.out.println();
    }

    public static void ordenarPrecio() {
        vehiculos.sort(new VehiculoComparadorOrdenarPrecio());
        System.out.println("Lista ordenada por Precio:");
        mostrarVehiculos();
    }

    public static void ordenarMarca(){
    vehiculos.sort(new VehiculoComparadorOrdenarMarca());
        System.out.println("Lista ordenada por Marca:");
        mostrarVehiculos();
    }
    public static void ordenarMarcaPrecio(){
    vehiculos.sort(new VehiculoComparadorOrdenarMarcaPrecio());
        System.out.println("Lista ordenada por Marca y precio:");
        mostrarVehiculos();
    }
    public static int entradaDato(){
        int seleccion = 0;
        while (true){
            try {
                seleccion = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("!Error!");
                System.out.println("Deves introducir un numero");
                sc.nextInt();
            }
        }
        return seleccion;
    }
    public static void revisarNiveles() throws FaltaRecursosException {
        if (!vehiculos.isEmpty()){
            System.out.println("Revisión de nivel: ");
            System.out.println();
            int numero = 0;
            for (Vehiculo coche : vehiculos) {
                System.out.println(numero+"- "+coche.getMarca() +" "+ coche.getModelo() );
                numero++;
            }
            while (true) {
                System.out.print("Seleccion: ");
                int seleccion = entradaDato();
                if (seleccion >= 0 && seleccion < numero) {
                    Vehiculo coche = vehiculos.get(seleccion);
                    try {
                        coche.comprobarRecursos();
                    }catch (FaltaRecursosException e){
                        coche.reparar();
                    }

                    break;
                } else {
                    System.out.println("Selecciona un número dentro del rango");
                    System.out.println();
                }
            }

        }else {
            System.out.println("No existen vehiculos");

        }
        System.out.println();
    }
}


//comparadores
 class VehiculoComparadorOrdenarPrecio implements Comparator<Vehiculo>{

     @Override
     public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
         return vehiculo1.getPrecio() - vehiculo2.getPrecio() ;
     }
 }
 class VehiculoComparadorOrdenarMarca implements Comparator<Vehiculo>{

     @Override
     public int compare(Vehiculo o1, Vehiculo o2) {
         return o1.getMarca().compareTo(o2.getMarca());
     }
 }
 class VehiculoComparadorOrdenarMarcaPrecio implements Comparator<Vehiculo>{

     @Override
     public int compare(Vehiculo o1, Vehiculo o2) {
    int compare = o1.getMarca().compareTo(o2.getMarca());
    if (compare != 0){
        return compare;
    }
         return o1.getPrecio() - o2.getPrecio();
     }
 }
