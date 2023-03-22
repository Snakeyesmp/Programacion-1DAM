/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        double numero, suma = 0, media = 0;
        int contador = 1;

        System.out.println("Introduce un numero.");
        numero = enter.nextDouble();
        if (numero < 10000) {
            while (suma < 10000) {
                suma = suma + numero;
                contador++;
                System.out.println("Introduce otro numero que no llegas.");
                numero = enter.nextDouble();
            }
            media = suma / contador;
            System.out.println("El total que has acumulado es " + suma + " y solo has tenido que meter " + contador + " numeros. La media es " + media);
        } else {
            System.out.println("Te has pasado nene");
        }
    }
}
