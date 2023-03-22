/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        int caracteres = 1;
        int fin = 0;
        System.out.println("Escribe la altura(maximo 10):");
        int altura = datos.nextInt();
        int espacios = altura;

        Scanner datos2 = new Scanner(System.in);

        for (int i = 0; i < altura; i++) {
            for (int f = 0; f < espacios; f++) {
                System.out.print(" ");
            }
            espacios--;
            for (int j = 1; j < caracteres; j++) {
                System.out.print(j);
                fin = j;
            }
            for (int j = fin - 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println("");
            caracteres += 1;
        }
    }
}
