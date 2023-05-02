
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio05 {

    public static void main(String[] args) throws IOException {
        // Crear la carpeta 'Diccionario'
        File carpetaDiccionario = new File("Documentos\\Diccionario");
        carpetaDiccionario.mkdir();
        // Crear un archivo por letra del alfabeto
        for (char c = 'A'; c <= 'Z'; c++) {
            File archivoLetra = new File(carpetaDiccionario, c + ".txt");
            archivoLetra.createNewFile();
        }

        // Leer el archivo 'diccionario.txt' y escribir cada palabra en el archivo
        // correspondiente
        File archivoDiccionario = new File("Documentos\\Diccionario\\diccionario.txt");
        Scanner scannerDiccionario = new Scanner(archivoDiccionario);
        while (scannerDiccionario.hasNextLine()) {
            String palabra = scannerDiccionario.nextLine();
            if (!palabra.isEmpty()) {
                char primeraLetra = Character.toUpperCase(palabra.charAt(0));
                if (primeraLetra >= 'A' && primeraLetra <= 'Z') {
                    File archivoLetra = new File(carpetaDiccionario, primeraLetra + ".txt");
                    FileWriter fw = new FileWriter(archivoLetra, true);
                    PrintWriter printWriter = new PrintWriter(fw);
                    printWriter.println(palabra);
                    printWriter.close();
                }
            }
        }
        scannerDiccionario.close();
    }
}
