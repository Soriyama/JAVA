package ClasesAvanzadas.Ejercicios.Biblioteca;

import java.util.*;
import java.util.Comparator;
public class Biblioteca {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList <Inventariable> biblioteca = new ArrayList<>();

        // Crear 4 libros
        Libro libro1 = new Libro("El señor de los anillos", "Minotauro", 1954, "J.R.R. Tolkien", 1200);
        Libro libro2 = new Libro("Cien años de soledad", "Sudamericana", 1967, "Gabriel García Márquez", 496);
        Libro libro3 = new Libro("1984", "Secker & Warburg", 1949, "George Orwell", 328);
        Libro libro4 = new Libro("Orgullo y prejuicio", "T. Egerton", 1813, "Jane Austen", 432);

        // Crear 4 revistas
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", 2025, "Ciencia y Exploración", 150);
        Revista revista2 = new Revista("Time", "Time USA, LLC", 2025, "Noticias y Actualidad", 50);
        Revista revista3 = new Revista("Hola!", "HOLA, S.L.", 2025, "Celebridades y Estilo de vida", 120);
        Revista revista4 = new Revista("Computer Hoy", "Axel Springer España", 2025, "Tecnología e Informática", 100);

        Collections.addAll(biblioteca, libro1, revista1, libro2,revista2);
        imprimir(biblioteca);
        System.out.println();
        Collections.addAll(biblioteca,libro3, revista1,libro4,revista1);
        imprimir(biblioteca);
        System.out.println();
        // Ordenar la biblioteca por título utilizando la clase OrdenarPorTitulo
        Collections.sort(biblioteca, new OrdenarPorTitulo());
        System.out.println("--- Biblioteca ordenada por título ---");
        imprimir(biblioteca);
        System.out.println();

        System.out.println("Sin duplicados:");
        LinkedHashSet<Inventariable> conjuntoSinDuplicado = new LinkedHashSet<>(biblioteca);
//        imprimirSinDuplicados(conjuntoSinDuplicado);
        HashMap <String,Inventariable> conjuntoHashMap = new HashMap<>();
        for (Inventariable item : biblioteca){
            if (item instanceof Libro) {
                Libro libro = (Libro) item;
                conjuntoHashMap.put(libro.getTitulo(), item);
            } else if (item instanceof Revista) {
                Revista revista = (Revista) item;
                conjuntoHashMap.put(revista.getTitulo(), item);
            }
        }
//        System.out.println("Introduce un titulo");
//        String titulo = sc.nextLine();
//        if(conjuntoHashMap.containsKey(titulo)){
//            Inventariable encontrado = conjuntoHashMap.get(titulo);
//            if (encontrado instanceof Libro){
//                Libro libro = (Libro) encontrado;
//                libro.mostrarInformacion();
//            } else if (encontrado instanceof Revista) {
//                Revista revista = (Revista) encontrado;
//                revista.mostrarInformacion();
//            }
//        }


    }
    static class OrdenarPorTitulo implements Comparator<Inventariable>{
        @Override
        public int compare(Inventariable o1, Inventariable o2) {
            String titulo1="";
            String titulo2="";
            if (o1 instanceof Libro){
                titulo1=((Libro) o1).getTitulo();
            } else if (o1 instanceof Revista) {
                titulo1=((Revista) o1).getTitulo();
            }
            if (o2 instanceof Libro){
                titulo2=((Libro) o2).getTitulo();
            } else if (o2 instanceof Revista) {
                titulo2=((Revista) o2).getTitulo();
            }
            return titulo1.compareToIgnoreCase(titulo2) ;
        }
    }


    public static void imprimir(ArrayList<? extends Inventariable> bibliotecaList){
        for(Inventariable articulo: bibliotecaList) {
            System.out.println(articulo);
        }
    }
    public static void imprimirSinDuplicados(LinkedHashSet<? extends Inventariable> bibliotecaList){
        for(Inventariable articulo: bibliotecaList) {
            if (articulo instanceof Libro){
                ProductoLectura libro = (Libro) articulo;
                libro.mostrarInformacion();
            } else if (articulo instanceof Revista) {
                ProductoLectura revista = (Revista) articulo;
                revista.mostrarInformacion();
            }

        }
    }
}


