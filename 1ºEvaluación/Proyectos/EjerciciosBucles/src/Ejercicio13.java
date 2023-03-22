/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Ejercicio13 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int negativos=0;
        int positivos=0;
        int n = 0;
        for (int i = 0; i <= 10; i++) {
            n = sc.nextInt();
            if(n>0){
                positivos =positivos+1;
            }else{
                negativos=negativos+1;
            }
        }
        System.out.println("hay "+positivos+" numeros positivos"+" y hay "+negativos+" numeros negativos");
    }
}
