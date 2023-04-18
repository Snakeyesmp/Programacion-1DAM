import java.io.File;

public class Ejercicio03 {
    public static void main(String[] args) {

        // Creo objetos de tipo archivo para el estado actual de la carpeta y el nombre
        // que quiero que se quede
        File documentos = new File("Documentos");
        File docs = new File("DOCS");

        File fotografias = new File("DOCS/Fotografias");
        File fotos = new File("DOCS/FOTOS");

        File libros = new File("DOCS/Libros");
        File lecturas = new File("DOCS/LECTURAS");
        // Cambio la carpeta documentos de nombre
        if (documentos.renameTo(docs)) {
            System.out.println("El nombre de la carpeta documentos ha sido cambiada a DOCS");
        } else {
            System.out.println("No se ha encontrado la carpeta documentos");
        }
        // Cambio la carpeta fotografias de nombre
        if (fotografias.renameTo(fotos)) {

            System.out.println("El nombre de la carpeta fotografias ha sido cambiada a FOTOS");
        } else {
            System.out.println("No se ha encontrado la carpeta Fotografias");
        }
        // Cambio la carpeta libros de nombre
        if (libros.renameTo(lecturas)) {

            System.out.println("El nombre de la carpeta libros ha sido cambiada a LECTURAS");
        } else {
            System.out.println("No se ha encontrado la carpeta libros");
        }

        // Cambiar el nombre de los archivos en la carpeta FOTOS
        File[] archivosFotos = fotos.listFiles();
        for (File archivo : archivosFotos) {
            if (archivo.isFile()) {
                String nombre = archivo.getName();
                int indice = nombre.lastIndexOf('.');
                if (indice > 0 && indice < nombre.length() - 1) {
                    String nuevoNombre = nombre.substring(0, indice);

                    if (archivo.renameTo(new File(fotos, nuevoNombre))) {
                        System.out.println(
                                "El archivo \"" + archivo.getName() + "\" \t ahora se llama: \t" + nuevoNombre);

                    }
                }
            }
        }

        // Cambiar el nombre de los archivos en la carpeta LECTURAS

        File[] archivosLecturas = lecturas.listFiles();
        for (File archivo : archivosLecturas) {
            if (archivo.isFile()) {
                String nombre = archivo.getName();
                int indice = nombre.lastIndexOf('.');
                if (indice > 0 && indice < nombre.length() - 1) {
                    String nuevoNombre = nombre.substring(0, indice);

                    if (archivo.renameTo(new File(lecturas, nuevoNombre))) {
                        System.out.println(
                                "El archivo \"" + archivo.getName() + "\" \t ahora se llama: \t" + nuevoNombre);

                    }
                }
            }
        }


    }
}
