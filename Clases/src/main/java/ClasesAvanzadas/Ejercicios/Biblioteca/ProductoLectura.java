package ClasesAvanzadas.Ejercicios.Biblioteca;

import java.util.Date;

import static java.lang.Math.random;

public class ProductoLectura {
    private String titulo;
    private String editor;
    private int anio;

    public ProductoLectura(String titulo, String editor, int anio){
        this.titulo=titulo;
        this.editor=editor;
        this.anio=anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrarInformacion(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Editor: " + this.editor);
        System.out.println("Año: " + this.anio);
    }
    @Override
    public String toString() {
        return "ProductoLectura{" +
                "titulo='" + titulo + '\'' +
                ", editor='" + editor + '\'' +
                ", anio=" + anio +
                '}';
    }
}

class Libro extends ProductoLectura implements Inventariable{
    private String autor;
    private int numPaginas;
    static int codigo = 0;
    private String codigoInventariable;

    public Libro(String titulo, String editor, int anio, String autor, int numPaginas ){
        super(titulo,editor,anio);
        this.autor=autor;
        this.numPaginas=numPaginas;
        this.codigoInventariable=getCodigoInventario();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo inventario: " + this.codigoInventariable);
        super.mostrarInformacion();
        System.out.println("Autor: " + this.autor);
        System.out.println("Nº de páginas: " + this.numPaginas);

    }
    @Override
    public String getCodigoInventario(){
        codigo ++;
        String codigoInventariable = "L" + String.valueOf(codigo);
        return codigoInventariable;
    }
    @Override
    public String toString() {
        return "Libro{" +
                super.toString().substring(ProductoLectura.class.getSimpleName().length() + 1) + ", " + // Llamada a toString de la superclase
                "autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", codigoInventariable='" + codigoInventariable + '\'' +
                '}';
    }
}

class Revista extends ProductoLectura implements Inventariable{
    private String tema;
    private int numeroEdicion;
    static int codigo = 0;
    private String codigoInventariable;

    public Revista(String titulo, String editor, int anio, String tema, int numeroEdicion){
        super(titulo,editor,anio);
        this.tema=tema;
        this.numeroEdicion=numeroEdicion;
        this.codigoInventariable=getCodigoInventario();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Codigo inventario: " + this.codigoInventariable);
        super.mostrarInformacion();
        System.out.println("Tema: " + this.tema);
        System.out.println("Nº edición: " + this.numeroEdicion);
    }
    @Override
    public String getCodigoInventario(){
        codigo ++;
        String codigoInventariable = "R" + String.valueOf(codigo);
        return codigoInventariable;
    }
    @Override
    public String toString() {
        return "Revista{" +
                super.toString().substring(ProductoLectura.class.getSimpleName().length() + 1) + ", " + // Llamada a toString de la superclase
                "tema='" + tema + '\'' +
                ", numeroEdicion=" + numeroEdicion +
                ", codigoInventariable='" + codigoInventariable + '\'' +
                '}';
    }
}

class Periodico extends ProductoLectura{
    private Date fechaPublicacion;
    public Periodico(String titulo, String editor, int anio, Date fechaPublicacion){
        super(titulo,editor,anio);
        this.fechaPublicacion=fechaPublicacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Fecha de publicación: " + this.fechaPublicacion);
    }
    @Override
    public String toString() {
        return "Periodico{" +
                super.toString().substring(ProductoLectura.class.getSimpleName().length() + 1) + ", " + // Llamada a toString de la superclase
                "fechaPublicacion=" + fechaPublicacion +
                '}';
    }
}