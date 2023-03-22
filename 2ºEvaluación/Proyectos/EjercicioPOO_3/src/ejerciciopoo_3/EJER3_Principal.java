/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopoo_3;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class EJER3_Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Libro libro1 = new Libro();
        System.out.println("Introduce el titulo del libro");
        libro1.setTitulo(sc.nextLine());
        System.out.println("Introduce el nombre del autor");
        libro1.setAutor(sc.nextLine());
        System.out.println("Introduce el numero de ejemplares ");
        libro1.setnEjemplares(sc.nextInt());

        System.out.println(libro1);
        
        
        
    }
}
