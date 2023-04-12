import java.io.File;

public class GestionFicheros1 {

    public static void main(String[] args) {

        File fotos = new File("C:/Temp/Fotos");
        File doc = new File("C:/Temp/Documento.txt");

        boolean mkdirFot = fotos.mkdir();

        if (mkdirFot) {
            System.out.println("Creada carpeta"+fotos.getName()+"? "+mkdirFot);
        }else{
            boolean delCa = fotos.delete();
            System.out.println("Borrada carpeta" + fotos.getName() + "? " + delCa);
            boolean delAr = doc.delete();
            System.out.println("Borrado archivo" + doc.getName()+ "? " + delAr);

        }
    }

}
