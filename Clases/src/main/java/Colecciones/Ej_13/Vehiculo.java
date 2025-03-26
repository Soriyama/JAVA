package Colecciones.Ej_13;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int precio;
    private int capacidadDeposito;

    public Vehiculo(String marca, String modelo, String color, int precio, int capacidadDeposito){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.capacidadDeposito = capacidadDeposito;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Color: "+getColor());
        System.out.println("Precio: "+getPrecio());
        System.out.println("Capacidad de depósito: "+ getCapacidadDeposito()+ "l");
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                ", capacidadDeposito=" + capacidadDeposito +
                '}';
    }
    //Excepciones
    public abstract void acelerar(int velocidad) throws VelocidadExcedidaException;

    public abstract void comprobarRecursos() throws FaltaRecursosException;
    public abstract void reparar();
}

class CocheElectrico extends Vehiculo implements Reparable{
    private int capacidadBateria;
    private int cargaActual;
    public CocheElectrico(String marca, String modelo, String color, int precio, int capacidadBateria, int cargaActual){
        super(marca, modelo, color, precio, 0);
        this.capacidadBateria = capacidadBateria;
        this.cargaActual = cargaActual;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void mostrarInfo(){
        System.out.println("Vehiculo eléctrico");
        super.mostrarInfo();
        System.out.println("Capacidad de batería: "+getCapacidadBateria()+ " KWh");
        System.out.println("Carga de batería: "+getCargaActual()+"%");
    }

    @Override
    public String toString() {
        return super.toString() +"CocheElectrico{" +
                "capacidadBateria=" + capacidadBateria +
                ", cargaActual=" + cargaActual +
                "} " ;
    }
    @Override
    public void acelerar(int velocidad) throws VelocidadExcedidaException {
        if (velocidad > 120) {
            throw new VelocidadExcedidaException("Velocidad excesiva: " + velocidad + " km/h");
        }
    }
    @Override
    public void comprobarRecursos() throws FaltaRecursosException {
        if (cargaActual < 10) { // Ejemplo: carga mínima del 10%
            throw new FaltaRecursosException("Carga de batería insuficiente");
        }else {
            System.out.println("Carga de batería suficiente");
        }
    }

    @Override
    public void reparar() {
        setCargaActual(100);
        System.out.println("Cargado al "+cargaActual+"%");
    }
}

class CocheCombustion extends Vehiculo implements Reparable{
    private String tipoCombustible;
    private int nivelCombustible ;

    public CocheCombustion(String marca, String modelo, String color, int precio, int capacidadDeposito, String tipoCombustible, int nivelCombustible ){
        super(marca, modelo, color, precio,capacidadDeposito);
        this.tipoCombustible = tipoCombustible;
        this.nivelCombustible =nivelCombustible ;

    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public int getCargaActual() {
        return nivelCombustible ;
    }

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(int nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vehiculo de combustión");
        super.mostrarInfo();
        System.out.println("Tipo de combustible:" + getTipoCombustible());
        System.out.println("Nivel de combustible: " + getNivelCombustible() + "%");

    }

    @Override
    public String toString() {
        return super.toString() + "CocheCombustion{" +
                "tipoCombustible='" + tipoCombustible + '\'' +
                ", nivelCombustible=" + nivelCombustible +
                "} " ;
    }

    @Override
    public void acelerar(int velocidad) throws VelocidadExcedidaException {
        if (velocidad > 120) {
            throw new VelocidadExcedidaException("Velocidad excesiva: " + velocidad + " km/h");
        }
    }
    @Override
    public void comprobarRecursos() throws FaltaRecursosException {
        if (getNivelCombustible() < 5) {
            throw new FaltaRecursosException("Nivel de combustible bajo");
        }else {
            System.out.println("Nivel correcto");
        }
    }

    @Override
    public void reparar() {
       setNivelCombustible(100);
        System.out.println("Repostado al "+nivelCombustible+"%");
    }
}
class VelocidadExcedidaException extends Exception {
    public VelocidadExcedidaException(String message) {
        super(message);
    }
}
class FaltaRecursosException extends Exception {
    public FaltaRecursosException(String message) {
        super(message);
    }
}

