/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        double numero;
        double resto;
        double resto2;
        String text = "El numero 1 es una excepción matemática según lo libros.";
        System.out.println("Introduce un numero");
        numero = enter.nextDouble();

        while (numero != 1) {
            resto = numero % numero;
            resto2 = numero % 1;
            if (resto == resto2) {
                text = "El numero es primo.";

            } else {
                text = "No es un numero primo";
            }
        }
        System.out.println(text);

    }
}
