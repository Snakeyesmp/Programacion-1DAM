/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner enter=new Scanner(System.in);
        
        double numero;
        int contador=0;
        double suma=0;
        
        System.out.println("Introduce un numero positivo.");
        
        numero= enter.nextDouble();
        
        if (numero>0){
            suma=numero;
            while (contador!=100){
                numero++;
                suma= suma + numero;
                contador++;
                
            }
            System.out.println("El resultado es " +  suma);
        } else{
            System.out.println("Ese numero no es positivo.");
        }
        
        enter.close();
    }
    
}
