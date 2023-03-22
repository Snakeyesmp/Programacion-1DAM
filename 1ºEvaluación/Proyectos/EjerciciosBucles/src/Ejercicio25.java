/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio25 {
      public static void main(String[] args) {

        int num;
        String a;
        a="";

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = datos.nextInt();
        String numStr= num+"";
             
        
        for (int i = 1; i <= numStr.length(); i++) {
           a += numStr.charAt(numStr.length()-i);
        }
        
        System.out.println(a);
        
        
    }
        
        
    }
    

