/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio29 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int max, div;

        System.out.println("Escribe un numero para fijar el maximo");
        max = leer.nextInt();
        System.out.println("Introduce un numero para que no sea divisible por ese numero");
        div = leer.nextInt();

        for (int i = max; i >= 0; i--) {
            if (i % div != 0) {
                System.out.println(i);
            }
        }

    }
}
