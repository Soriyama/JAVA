package Colecciones;

public class Padre{
    public void metodoPadre(){
        System.out.println("Soy el padre");
    }
    public void metodo1(){
        System.out.println("Metodo 1 en el padre");
    }
    public void metodo2(){
        System.out.println("Metodo 2 en el padre");
    }
    public void metodo3(){
        System.out.println("Metodo 3 en el padre");
    }
}
class Hija extends Padre {
    public void metodoHija(){
        System.out.println("Soy la clase Hija");
    }
    @Override
    public void metodo1(){
        System.out.println("Metodo 1 en la Hija");
    }
    @Override
    public void metodo2(){
        super.metodo2();
        System.out.println("Metodo 2 en la Hija");
    }
}
class Nieta extends Hija {
    public void metodoNieta(){
        System.out.println("Soy la clase Nieta");
    }
    @Override
    public void metodo1(){
        System.out.println("Metodo 1 en la Nieta");
    }
    @Override
    public void metodo2(){
        super.metodo2();
        System.out.println("Metodo 2 en la Nieta");
    }
}