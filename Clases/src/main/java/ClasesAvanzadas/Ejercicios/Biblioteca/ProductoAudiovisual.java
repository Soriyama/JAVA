package ClasesAvanzadas.Ejercicios.Biblioteca;

public class ProductoAudiovisual {
    private String titulo;
    private String compania;

    public ProductoAudiovisual(String titulo, String compania){
        this.titulo=titulo;
        this.compania=compania;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCompania() {
        return compania;
    }
    public void mostrarInformacion(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Compañía: " + this.compania);
    }

}

class Videojuego extends ProductoAudiovisual implements Inventariable{

    private String plataforma;
    private static int codigo = 0;
    private String codigoInventariable;
    public Videojuego(String titulo, String compania, String plataforma){
    super(titulo,compania);
    this.plataforma=plataforma;
      this.codigoInventariable=getCodigoInventario();
  }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Plataforma: " + this.plataforma);

    }

    @Override
    public String getCodigoInventario(){
        codigo ++;
        String codigoInventariable = "V" + String.valueOf(this.codigo);
        return codigoInventariable;
    }
}

class Pelicula extends ProductoAudiovisual implements Inventariable{
    private String director;
    private int duracion;
    private static int codigo = 0;
    private String codigoInventariable;
    public Pelicula(String titulo, String compania, String director, int duracion){
        super(titulo,compania);
        this.director=director;
        this.duracion=duracion;
        this.codigoInventariable=getCodigoInventario();
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Director: " + this.director);
        System.out.println("Duración: " + this.duracion + " minutos");
    }

    public String getCodigoInventario(){
        codigo ++;
        String codigoInventariable = "P" + String.valueOf(this.codigo);
        return codigoInventariable;
    }
}
