package ClasesAvanzadas.Pruebas;
class ClaseA{

    public void mostrar1(){
        System.out.println("mostrar 1 en clase A");
    }
    public void mostrar2(){
        System.out.println("mostrar 2 en clase A");
    };
    public void mostrar3(){

    };
}

class ClaseB extends ClaseA{

    @Override
    public void mostrar2(){
        System.out.println("mostrar 2 en clase B");
    }

    public void mostrar3(){
        System.out.println("mostrar 3 en clase B");
    }
}
class ClaseC extends ClaseB{

    @Override
    public void mostrar2(){
        System.out.println("mostrar 2 en clase C");
    }
}


public class Pruebas {
    public static void main(String[] args) {
    ClaseA clase;
    ClaseA clase1;

    clase = new ClaseB();
    clase1 = new ClaseC();
        clase1.mostrar1();
        clase.mostrar2();
        clase1.mostrar3();
        clase1.mostrar2();
    }
}
