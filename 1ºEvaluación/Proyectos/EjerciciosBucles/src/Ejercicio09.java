/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio09 {

    public static void main(String[] args) {

        int numero;

        Scanner intro = new Scanner(System.in);

        System.out.println("Introduce un numero por teclado.");
        
        numero = intro.nextInt();
        
        String digitos = String.valueOf(numero);
        
        int longitud = digitos.length();
        
        if (numero < 0) {
            longitud = longitud--;
        } 
        System.out.println("El numero tiene " +longitud);
        intro.close();

    }

}
