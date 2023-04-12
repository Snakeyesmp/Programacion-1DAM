import java.io.File;

public class ListadoDeFicheros {

    public static void main(String[] args) {

        File dir = new File("C:/Temp");
        File[] lista = dir.listFiles();

        System.out.println("Contenido de " + dir.getAbsolutePath() + ":");
        // Recorremos el array y mostramos el nombre de cada elemento

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
