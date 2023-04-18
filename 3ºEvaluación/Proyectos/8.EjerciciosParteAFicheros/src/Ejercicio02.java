import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Partiendo de una copia del programa anterior, modifica la función
 * muestraInfoRuta:
 * ● En el caso de un directorio, mostrará la lista de directorios y archivos en
 * orden alfabético. Es decir, primero los directorios en orden alfabético y
 * luego los archivos en orden alfabético. Te será útil Arrays.sort().
 * ● Añade un segundo argumento ‘boolean info’ que cuando sea ‘true’ mostrará,
 * junto a la información de cada directorio o archivo, su tamaño en bytes y la
 * fecha de la última modificación. Cuando ‘info’ sea ‘false’ mostrará la
 * información como en el ejercicio anterior.
 */
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

    /**
     * Recibe un archivo e imprime por pantalla todos los elementos que contiene,
     * dependiendo de si es un archivo o una carpeta mostrará un texto u otro
     * 
     * @param archivo archivo del que se va a mostrar informacion sobre la ruta
     * @param info    booleano para saber si el usuario quiere que se muestre
     *                información extra(tamaño y ultima fecha modificacion) sobre
     *                cada uno de los archivos
     */
    static void muestraInfoRuta(File archivo, boolean info) {

        File[] listaArchivos = archivo.listFiles();
        System.out.println(archivo.getAbsolutePath());

        Arrays.sort(listaArchivos); // Se ordena en orden alfabetico los archivos y carpetas

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

                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Como la ultima fecha de
                                                                                     // modificacion la da en
                                                                                     // milisegundos la pasamos a un
                                                                                     // formato normal

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