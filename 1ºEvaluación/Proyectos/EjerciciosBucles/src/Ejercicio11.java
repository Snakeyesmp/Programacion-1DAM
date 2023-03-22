/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        double numero;
        double contador = 0;
        double cubo;
        double cuadrado;

        Scanner enter = new Scanner(System.in);

        System.out.println("Introduce un numero.");
        numero = enter.nextDouble();

        while (contador != 5) {

            cuadrado = Math.pow(numero, 2);
            cubo = Math.pow(numero, 3);
            System.out.println("Para el numero " + numero
                    + " el cuadrado es " + cuadrado
                    + " y el cubo es " + cubo);
            cuadrado = 0;
            cubo = 0;
            contador++;
            numero++;

        }

    }
}
