/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Mario Muñoz
 */
public class Ejercicio18 {

    //. Escribe un programa que diga cuál es la primera cifra de un número entero introducido por
//      teclado. Se permiten números de hasta 5 cifras.
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("Escribe un numero entero con una longitud maxima de 5 cifras");

        String str = enter.nextLine();
        int longitud = str.length();
        if (longitud > 5) {
            System.out.println("Introduce un numero de MAXIMO cinco cifras, gracias");
        } else {

            char primer = str.charAt(0);

            System.out.println(primer);
        }
    }
}
