/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Ejercicio07 {
    public static void main(String[] args) throws FileNotFoundException {
        // Pedir al usuario que introduzca el archivo de texto a procesar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo de texto a procesar:");
        String rutaArchivo = scanner.nextLine();
        scanner.close();

        // Leer el archivo de texto y procesar sus datos estadísticos
        File archivo = new File(rutaArchivo);
        Scanner scannerArchivo = new Scanner(archivo);
        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;
        Map<String, Integer> mapaPalabras = new HashMap<>();
        while (scannerArchivo.hasNextLine()) {
            String linea = scannerArchivo.nextLine();
            numLineas++;
            String[] palabras = linea.split("[^\\p{L}0-9']+");
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    numPalabras++;
                    numCaracteres += palabra.length();
                    String palabraLowerCase = palabra.toLowerCase();
                    mapaPalabras.put(palabraLowerCase, mapaPalabras.getOrDefault(palabraLowerCase, 0) + 1);
                }
            }
        }
        scannerArchivo.close();

        // Imprimir los datos estadísticos por pantalla
        System.out.println("Número de líneas: " + numLineas);
        System.out.println("Número de palabras: " + numPalabras);
        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Las 10 palabras más comunes:");
        PriorityQueue<Map.Entry<String, Integer>> heapPalabras = new PriorityQueue<>(
                Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<String, Integer> entrada : mapaPalabras.entrySet()) {
            heapPalabras.offer(entrada);
            if (heapPalabras.size() > 10) {
                heapPalabras.poll();
            }
        }
        List<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>();
        while (!heapPalabras.isEmpty()) {
            listaPalabras.add(heapPalabras.poll());
        }
        Collections.reverse(listaPalabras);
        for (Map.Entry<String, Integer> entrada : listaPalabras) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " veces");
        }
    }
}
