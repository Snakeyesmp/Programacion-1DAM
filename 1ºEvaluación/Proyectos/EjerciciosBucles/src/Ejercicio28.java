/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio28 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num, factorial = 1;

        System.out.println("Introdce un numero mayor o igual que cero y te dire su factorial");
        num = leer.nextInt();
        System.out.print("El factorial de " + num + " es:" + num + "!= ");

            for (int i = num; i >= 1; i--) {

                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + "x");
                }

                factorial = factorial * i;
            }
            System.out.print(" = " + factorial);
    }
}
