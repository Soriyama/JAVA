package ClasesAvanzadas.Ejercicios;

public class Ej_8 {
    public static void main(String[] args) {
        Perro perro = new Perro("Pampo", 3, "Chihuahuana", "Mediano");
        Gato gato = new Gato("Katy", 15, "Siamés");
        Loro loro = new Loro("Lorito", 10 , "Amarillo/Verde");
        Pez pez = new Pez("Pescadito", 2, "Gris", "Diminuto");
        //a)
        /*
        perro.mostrarInformacion();
        System.out.println();
        gato.mostrarInformacion();
        System.out.println();
        loro.mostrarInformacion();
        System.out.println();
        pez.mostrarInformacion();
        */
        //b)
        Animal[] arrayAnimal = {perro,gato,loro,pez};

        for(int i = 0 ; i< arrayAnimal.length; i++){
            System.out.println();
            Animal animal = arrayAnimal[i]; // Se declara una variable animal de tipo Animal que referencia al objeto Animal en la posición en arrayAnimal
            animal.mostrarInformacion();
        }
        //c)
    }

}
