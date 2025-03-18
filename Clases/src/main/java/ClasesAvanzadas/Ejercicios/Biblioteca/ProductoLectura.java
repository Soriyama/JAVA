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

    public void mostrarInformacion(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Editor: " + this.editor);
        System.out.println("Año: " + this.anio);
    }
}

class Libro extends ProductoLectura implements Inventariable{
    private String autor;
    private int numPaginas;
    private static int codigo = 0;
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
        String codigoInventariable = "L" + String.valueOf(this.codigo);
        return codigoInventariable;
    }


}

class Revista extends ProductoLectura implements Inventariable{
   private String tema;
   private int numeroEdicion;
   private static int codigo = 0;
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
        String codigoInventariable = "R" + String.valueOf(this.codigo);
        return codigoInventariable;
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
}
