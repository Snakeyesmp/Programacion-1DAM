import java.io.File;

public class App {
    public static void main(String[] args) {

        // Dos rutas relativas
        File carpetaAbs = new File(
                "C:/Users/admin/Documents/Programación/Programacion-1DAM/3ºEvaluación/Proyectos/5.EjemploFicheros/Documentos/Fotografias");
        File archivoAbs = new File(
                "C:/Users/admin/Documents/Programación/Programacion-1DAM/3ºEvaluación/Proyectos/5.EjemploFicheros/Documentos/Fotografias/boxeo.jpg");

        // Dos rutas relativas

        File carpetaRel = new File("documentos"); // LA RUTA RELATIVA ES PARTIENDO DESDE LA CARPETA DEL PROYECTO
        File archivoRel = new File("documentos/boxeo.jpg");

        // Mostramos sus rutas

        mostrarRutas(carpetaAbs);
        mostrarRutas(archivoAbs);
        mostrarRutas(carpetaRel);
        mostrarRutas(archivoRel);

    }

    public static void mostrarRutas(File f) {

        System.out.println("getParent()        " + f.getParent());
        System.out.println("getName()          " + f.getName());
        System.out.println("getAbsolutePath()  " + f.getAbsolutePath() + "\n");

    }

}
