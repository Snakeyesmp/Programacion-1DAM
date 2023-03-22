/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int intento;
        int Pass;

        intento = 0;

        System.out.println("Introduce la contrasena");
        Pass = entrada.nextInt();

        do {
            if (Pass == 1942) {
                System.out.println("Contrasena correcta");
                break;
            } else {

                System.out.println("Introduce la contrasena , te quedan " + (5-intento) + " intentos");
                Pass = entrada.nextInt();
                intento = (intento + 1);
            }

        } while (Pass != 1942 && intento <= 4);

        if (Pass == 1942) {
            System.out.println("Contrasena correcta");
        } else {
            System.out.println("Contrasena incorrecta, te has quedado sin intentos");
        }
    }
}