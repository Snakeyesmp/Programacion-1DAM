import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        File ficheroPersonas = new File("Documentos/usa_personas.txt");
        File ficheroPersonasOrdenadas = new File("Documentos/usa_personas_ordenadas.txt");

        ordenarPersonas(ficheroPersonas);

    }

    public static ArrayList<String> ordenarPersonas(File ficheroPersonas) {

        ArrayList<String> nombres = new ArrayList<String>();
        Scanner sc;
        try {
            sc = new Scanner(ficheroPersonas);

            do {
                String[] nombreCompleto = sc.nextLine().split(" ");
                String nombre = nombreCompleto[0];
                nombres.add(nombre);
                // System.out.println(nombre);

            } while (sc.hasNextLine());
            sc.close();
            Collections.sort(nombres);
            System.out.println(nombres);
            return nombres;
        } catch (FileNotFoundException e) {
            System.out.println("Ha dao error👍");
            return null;
        }

    }

}
