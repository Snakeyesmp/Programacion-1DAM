/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio14 {

    public static void main(String[] args) {



double base;
double exponente;
double resultado;

Scanner enter= new Scanner(System.in);
        System.out.println("Introduce la base.");
        base= enter.nextDouble();
         System.out.println("Introduce el exponente.");
         exponente= enter.nextDouble();
         resultado= Math.pow(base, exponente);
         System.out.println("El resultado es "+ resultado);
    }

}
