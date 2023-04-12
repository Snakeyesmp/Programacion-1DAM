import java.io.File;
import java.sql.Date;

public class UltimaModificacion {
    public static void main(String[] args) {

        File documento = new File("C:/temp/Documento.txt");

        System.out.println(documento.getAbsolutePath());

        long milisegundos = documento.lastModified();
        Date fecha = new Date(milisegundos);

        System.out.println("Ultima modificacion (ms)    :" + milisegundos);
        System.out.println("Ultima modificacion /fecha) :" + fecha);
        System.out.println("Tamaño del archivo          :" + documento.length());

    }
}
