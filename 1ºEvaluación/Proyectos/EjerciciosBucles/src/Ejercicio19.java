/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresar la altura del triangulo a dibujar : ");
        int n = entrada.nextInt();
        System.out.print("Ingresar que caracter se imprimira: ");
        String s = entrada.next();

        int g = 0;

        for (int x = 0; x < n; x++) {
            
            System.out.println(" ");

            for (int b = n; b > x; b--) {
                System.out.print(" ");
                g = b;
            }

            for (int j = 0; g > j; j++) {
                System.out.print(s);
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}