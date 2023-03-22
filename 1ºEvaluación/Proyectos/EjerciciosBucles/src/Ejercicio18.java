/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio18 {
    public static void main(String[] args) {

Scanner enter= new Scanner(System.in);

double numero1;
double numero2;
double numero3=0;

        System.out.println("Introduce dos numeros.");
        numero1= enter.nextDouble();
        numero2=enter.nextDouble();
        if (numero1==numero2){
            System.out.println("Esos numero son iguales.");
        } else if (numero1<numero2){
            numero3=numero1;
            while (numero3<=numero2){
                System.out.println(numero3);
                numero3=numero3 +7;
            }
        }else {
            numero3= numero2;
            while (numero3<=numero1){
                System.out.println(numero3);
                numero3=numero3 +7;
            }
        enter.close();
    }
        
        
        
        
    }
    
}
