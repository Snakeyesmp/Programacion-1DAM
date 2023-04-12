import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaDeFicheros {

    public static void main(String[] args) {

        File f = new File("C:/Programas/Documento.txt");

        try {
            Scanner sc = new Scanner(f);
            System.out.println(sc.nextLine());
            sc.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error! :D");
        }

    }
}
