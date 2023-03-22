/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1evaluacionmariomuñoz;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class PalindromoMARIO {

    public static void main(String[] args) {

        String palabraUsuario;
        Scanner enter = new Scanner(System.in);

        palabraUsuario = enter.nextLine();
        palabraUsuario = palabraUsuario.toLowerCase();

        palabraUsuario = palabraUsuario.replace(" ", "");

        int contInicio = 0;
        int contFinal = palabraUsuario.length() - 1;
        boolean noPalindromo = false;
        
        System.out.println("Introduce tu palabra o frase");
        
        while ((contInicio < contFinal) && (!noPalindromo)) {

            if (palabraUsuario.charAt(contInicio) == palabraUsuario.charAt(contFinal)) {
                contInicio++;
                contFinal--;
            } else {
                noPalindromo = true;
            }
        }
        if (!noPalindromo) {
            System.out.println(palabraUsuario + " es palindromo");
        } else {
            System.out.println(palabraUsuario + " no es palindromo");
        }
    }
}