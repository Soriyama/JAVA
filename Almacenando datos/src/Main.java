import java.io.*;
import java.nio.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Redirigir la entrada estándar desde un archivo
        FileInputStream fileInputStream = new FileInputStream ("entrada.txt");
        System.setIn(fileInputStream);
        Scanner scanner = new Scanner(System.in);
        String inputFromFile = scanner.nextLine();
        System.out.println("Texto leído desde el archivo entrada.txt: " + inputFromFile);
    }
}