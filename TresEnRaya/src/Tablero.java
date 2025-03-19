import java.util.ArrayList;
import java.util.List;
public class Tablero {

    private List<List<Character>> celdas;
    private static int tamano = 3;
    public Tablero(){
        celdas=new ArrayList<>();
        for(int fila = 0; fila < this.tamano; fila++){
            celdas.add(new ArrayList<>());
            for(int columnas = 0; columnas < this.tamano; columnas++){
                celdas.get(fila).add(' ');
            }
        }
    }

    public void mostrarTablero(){
        for(int fila = 0; fila < this.tamano; fila++){
            for(int columna = 0; columna <this.tamano; columna++){
                System.out.print(celdas.get(fila).get(columna));
                if (columna < this.tamano - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();

        }
    }
    public boolean realizarMovimiento(int fila, int columna, char jugador){
        if(celdaVacia(fila,columna)){
            celdas.get(fila -1).set(columna -1, jugador);
            return true;
        }
        return false;
    }

    public boolean celdaVacia(int fila, int columna){
        if(celdas.get(fila).get(columna) != ' '){
            System.out.println("La posición eligida no ya está seleccionada");
           return false;
        }
        return true;
    }
}
