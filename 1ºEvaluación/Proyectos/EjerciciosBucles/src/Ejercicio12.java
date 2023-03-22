/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio12 {
            public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i;
        int n;
        int acu1;
        acu1 = 0;
        int acu2;
        acu2 = 1;
        int acu3;
        acu3 = 1;
        System.out.println("Mete el numero tope");
        n = num.nextInt();
        for (i = 0; i <= n; i++) {
            System.out.println(acu3);
            acu3 = acu2 + acu1;
            acu1 = acu2;
            acu2 = acu3;
            
        }
    }
}
