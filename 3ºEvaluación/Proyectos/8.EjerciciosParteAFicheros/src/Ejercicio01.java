import java.io.File;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una ruta a buscar");

        String rutaABuscar = sc.nextLine();
        sc.close();
        File archivo01 = new File(rutaABuscar);

        muestraInfoRuta(archivo01);

    }

    static void muestraInfoRuta(File archivo) {

        File[] lista = archivo.listFiles();
        System.out.println(archivo.getAbsolutePath());

        if (archivo.isFile()) {
            System.out.println("Nombre del archivo: " + archivo.getName());
        } else {

            for (int i = 0; i < lista.length; i++) {

                File f = lista[i];

                if (f.isDirectory()) {
                    System.out.println("[DIR]" + f.getName()); // DIR SI ES UNA CARPETA
                } else {
                    System.out.println("[ARX]" + f.getName()); // ARX SI ES UN ARCHIVO
                }
            }
        }
    }
}
