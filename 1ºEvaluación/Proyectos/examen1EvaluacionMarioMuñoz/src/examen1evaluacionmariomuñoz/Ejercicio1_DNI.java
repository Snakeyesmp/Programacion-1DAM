/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1evaluacionmariomuñoz;
//Se importa la clase escaner

import java.util.Scanner;

/**
 *
 * @author Mario Muñoz Pequeño
 */
public class Ejercicio1_DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se inicializan las variables
        int numDNI = 0;
        int calculoLetra;
        String numDNIString;
        String arrayLetra[] = new String[23];
        
        /*
        Esto se haría con un un array de char, pero no he conseguido hacerlo, al igual que no he sabido como asignar valores a todo el array juntos,
        sin crear tantas lineas de codigo
         */
        
        //Se declara un Array, cada posicion con su letra correspondiente
        
        arrayLetra[0] = "T";
        arrayLetra[1] = "R";
        arrayLetra[2] = "W";
        arrayLetra[3] = "A";
        arrayLetra[4] = "G";
        arrayLetra[5] = "M";
        arrayLetra[6] = "Y";
        arrayLetra[7] = "F";
        arrayLetra[8] = "P";
        arrayLetra[9] = "D";
        arrayLetra[10] = "X";
        arrayLetra[11] = "B";
        arrayLetra[12] = "N";
        arrayLetra[13] = "J";
        arrayLetra[14] = "Z";
        arrayLetra[15] = "S";
        arrayLetra[16] = "Q";
        arrayLetra[17] = "V";
        arrayLetra[18] = "H";
        arrayLetra[19] = "L";
        arrayLetra[20] = "C";
        arrayLetra[21] = "K";
        arrayLetra[22] = "E";
        
        //Para hacer correction de errores se podría pasar el numero del DNI a String, y comprobar que su longitud sea de 9 caracteres (No lo hago por falta de tiempo)
        //Se pide al usuario que introduzca su numero del DNI
        System.out.println("Introduzca los numeros del DNI");
        Scanner entrada = new Scanner(System.in);
        //Se guarda en el escaner
        numDNI = entrada.nextInt();
        //Se hace el resto de divirlo entre 23 para calcular la posicion del array en el que está la letra
        calculoLetra = (numDNI % 23);
        //Se dice al usuario su DNI con la letra
        System.out.println("Su DNI completo es: " + numDNI + "-" + arrayLetra[calculoLetra]);
    }
}