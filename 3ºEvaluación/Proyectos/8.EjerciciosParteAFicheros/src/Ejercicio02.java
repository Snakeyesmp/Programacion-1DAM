import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una ruta a buscar");

        String rutaABuscar = sc.nextLine();
        System.out.println("Introduzca \"true\" si quiere saber información sobre los archivos, \"false\" si no ");
        boolean info = sc.nextBoolean();

        sc.close();
        File archivo01 = new File(rutaABuscar);

        muestraInfoRuta(archivo01, info);

    }

    static void muestraInfoRuta(File archivo, boolean info) {

        File[] listaArchivos = archivo.listFiles();
        System.out.println(archivo.getAbsolutePath());

        Arrays.sort(listaArchivos);

        if (archivo.isFile()) {
            System.out.println("Nombre del archivo: " + archivo.getName());
        } else {

            if (!info) {
                for (int i = 0; i < listaArchivos.length; i++) {
                    File f = listaArchivos[i];

                    if (f.isDirectory()) {
                        System.out.println("[DIR]" + f.getName()); // DIR SI ES UNA CARPETA
                    } else {
                        System.out.println("[ARX]" + f.getName()); // ARX SI ES UN ARCHIVO
                    }
                }
            } else {

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

                for (int i = 0; i < listaArchivos.length; i++) {
                    
                    File f = listaArchivos[i];
                    long lastModified = f.lastModified();
                    if (f.isDirectory()) {
                        System.out.println("[DIR]" + f.getName() + " " + f.length() + " bytes  "
                                + dateFormat.format(lastModified));
                        // DIR SI ES UNA CARPETA
                    } else {
                        System.out.println(
                                "[ARX]" + f.getName() + f.length() + " bytes  " + dateFormat.format(lastModified));
                        // ARX SI ES UN ARCHIVO
                    }
                }
            }
        }
    }
}