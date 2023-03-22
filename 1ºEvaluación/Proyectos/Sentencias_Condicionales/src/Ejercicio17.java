/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Mario Muñoz
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        //Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado
        Scanner enter = new Scanner(System.in);

        System.out.println("Escribe un numero entero");

        String str = enter.nextLine();

        int longitud = str.length();

        char ultimo = str.charAt(longitud - 1);

        System.out.println(ultimo);
    }
}
