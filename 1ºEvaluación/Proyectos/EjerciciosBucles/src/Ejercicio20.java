/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int caracteres = -1;
        String caracter = "";

        System.out.println("Escribe la altura:");
        int altura = datos.nextInt();
        int espacios = altura;

        Scanner datos2 = new Scanner(System.in);
        do {
            System.out.println("Escribe el caracter de la piramide(Solo 1):");
            caracter = datos2.nextLine();
        } while (caracter.length() != 1);
        for (int i = 0; i < altura - 1; i++) {
            for (int f = 0; f < espacios; f++) {
                System.out.print(" ");
            }
            espacios--;
            System.out.print(caracter);
            for (int j = 0; j < caracteres; j++) {
                System.out.print(" ");
            }
            if (i != 0) {

                System.out.print(caracter);
            }
            System.out.println("");
            caracteres += 2;
        }
        for (int f = 0; f < espacios; f++) {
            System.out.print(" ");
        }
        espacios--;
        for (int j = 0; j < caracteres / 2 + 2; j++) {
            System.out.print(caracter + " ");
        }
        System.out.println("");
    }
}
