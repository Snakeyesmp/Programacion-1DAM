/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio27 {

    public static void main(String[] args) {

        int fin;
        int cont = 0;
        int suma = 0;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un numero");
        fin = datos.nextInt();

        for (int i = 1; i <= fin; i++) {

            if (i % 3 == 0) {
                cont++;
                System.out.println(i);
                suma += i;
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Contador: " + cont);
    }
}
