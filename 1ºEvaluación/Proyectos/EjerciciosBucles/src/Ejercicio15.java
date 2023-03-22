/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        
        double base;
        double exponente;
        double resultado;
        double i=0;
        
        Scanner enter= new Scanner(System.in);
        System.out.println("Introduce la base.");
        base= enter.nextDouble();
        System.out.println("Introduce el exponenten al que quieres llegar.");
        exponente= enter.nextDouble();
        while ( i!=exponente){
            resultado= Math.pow(base, i);
            i++;
        }
        
    }
}
