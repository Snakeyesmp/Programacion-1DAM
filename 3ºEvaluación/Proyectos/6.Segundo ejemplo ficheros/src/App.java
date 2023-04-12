import java.io.File;

public class App {
    public static void main(String[] args) {

        File temp = new File("C:/Temp");
        File fotos = new File("C:/Temp/Fotos");
        File document = new File("C:/Temp/Documento.txt");

        System.out.println(temp.getAbsolutePath() + " ¿Existe? " + temp.exists() + "\n");

        mostrarEstado(fotos);
        mostrarEstado(document);

    }

    public static void mostrarEstado(File f) {
        System.out.println(f.getAbsolutePath() + "¿Archivo? " + f.isFile());
        System.out.println(f.getAbsolutePath() + "¿Carpeta? " + f.isDirectory() + "\n");
    }
}
