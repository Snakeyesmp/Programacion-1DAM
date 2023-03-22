/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1evaluacionmariomuñoz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EJE_Ahorcado {
    public static void main(String[] args) {
        //Definimos la variable de numero de intentos
        int intentos = 10;
        //Declaramos variable boolean que se usara en el else de abajo
        boolean juegoGanado;
        //Llamamos a la funcion para conseguir una palabra aleatoria
        String palabraSecreta = getPalabraSecreta();
        //Llamamos a la funcion para obtener el numero de caracteres de la palabra
        char[] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca letras de una en una ");
        
        do {
            System.out.println("te quedan " + intentos + " intentos");
            //Se imprimen los guiones con sus letras si corresponde
            System.out.println(palabraGuiones);
            //Solo se lee la primera letra que introduce el usuario
            char letra = lector.next().charAt(0);
            letra = Character.toLowerCase(letra);
            boolean letraAcertada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //se comprueba si la letra introducida coincide con alguna de las letras de la palabra
                if (palabraSecreta.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    letraAcertada = true;
                }
            }
            if (!letraAcertada) {
                System.out.println("Sigue intentando");
                --intentos;
                if (intentos == 0) {
                    System.out.println("Intentos agotados, HAS PERDIDO!");
                    System.out.println("La palabra era " + getPalabraSecreta());
                    juegoTerminado = true;
                }
            } else {
                juegoGanado = !hayGuiones(palabraGuiones);
                if (juegoGanado) {
                    System.out.println("Acertaste la palabra, HAS GANADO!");
                    juegoTerminado = true;
                }
            }
        } while (!juegoTerminado);
    }
    
    /**
     * Se obtiene la palabra secreta de un array segun un numero aleatorio
     *
     * @return palabras[numRandom]
     */
    static String getPalabraSecreta() {
        //Se crea el array con las posibles palabras
        String[] palabras = {"perro", "casa", "coche", "cocina", "persona", "gato", "camion", "autobus", "triste", "teclado","raton","java","cabeza",};
        Random r = new Random();
        //Se genera un numero aleatorio entre 0, y la longitud del array
        int numRandom = r.nextInt(palabras.length);
        //Se elige una palabra en base a ese numero aleatorio    
        return palabras[numRandom];
    }
    
    /**
     * Se obtiene el numero de guiones de la palabra
     *
     * @param palabra
     * @return palabraGuiones
     */
    static char[] getGuionesFromPalabra(String palabra) {
        //Declaramos una variable que contenga el numero de letras de palabra elegida
        int numLetrasPalabra = palabra.length();
        //Se define el numero de intentos para jugar
        //Declaramos un array de char con una longitud igual a las letras que tenga la palabra seleccionada
        char[] palabraGuiones = new char[numLetrasPalabra];
        //Rellenamos con guiones la longitud de la palabra
        for (int i = 0; i < numLetrasPalabra; i++) {
            palabraGuiones[i] = '_';
        }
        return palabraGuiones;
    }
    
    /**
     * 
     * @param array
     * @return booleano hayGuiones 
     */
    static boolean hayGuiones(char[] array) {
        for (char i : array) {
            if (i == '_') {
                return true;
            }
        }
        return false;
    }
}