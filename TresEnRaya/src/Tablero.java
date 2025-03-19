public class Tablero {

    char [][] tablero;
    public Tablero(){
        this.tablero=new char[3][3];
    }
    public Tablero(int filas,int columnas){
    this.tablero= new char[filas][columnas];
    }
    public void mostrarTablero(){
        for(int i = 0; i <= tablero.length; i++){

            for(int j = 0; j <=tablero[i].length;j++){
                System.out.print(" " + tablero[i][j] + " |");
            }
            System.out.println();
        }
    }
}
