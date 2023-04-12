import java.io.File;

public class RenombrarFichero {

    public static void main(String[] args) {
        File origenDir = new File("C:/Temp/fotos");
        File destinoDir = new File("C:/Temp/Media/Fotografias");
        File origenDoc = new File("C:/Temp/Media/Fotografias/Document.txt");
        File destinoDoc = new File("C:/Temp/Document.txt");

        boolean res = origenDir.renameTo(destinoDir);

        System.out.println("Se ha movido y renombrado la carpeta? " + res);

        res = origenDoc.renameTo(destinoDoc);

        System.out.println("Se ha movido el documento? " + res);
    }
}
