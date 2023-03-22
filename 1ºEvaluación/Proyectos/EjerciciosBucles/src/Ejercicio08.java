/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        double numero;
        double contador = 0;
        double solucion;
 
        System.out.println("Introduzca un numero");
        numero = intro.nextDouble();

        while (contador != 11) {
            solucion = contador * numero;

            System.out.println("La multipliacion de " + numero + " por " + contador + " es igual a " + solucion);
            contador++;
        }

    }
}
