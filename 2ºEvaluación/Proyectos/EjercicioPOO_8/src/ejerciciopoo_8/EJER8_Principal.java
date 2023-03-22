/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo_8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class EJER8_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduce el numero de tu DNI");
        NIF NIF1 = new NIF();
        Scanner sc = new Scanner(System.in);
        NIF1.setNumDNI(sc.nextInt());
        System.out.println(NIF1);
        
    }
    
}
