/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooarrayobjetos;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class POOArrayObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Gato[] gato = new Gato[4];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 3; i++) {
            gato[i] = new Gato();
            System.out.println("Introduzca el nombre del gato");
            gato[i].setNombre(sc.nextLine());
            System.out.println("Introduzca el color del gato");
            gato[i].setColor(sc.nextLine());
            System.out.println("Introduzca la raza del gato");
            gato[i].setRaza(sc.nextLine());
            System.out.println("Introduzca la edad del gato");
            gato[i].setEdad(sc.nextInt());
            sc.nextLine();
        }

        for (int i = 0; i <= 3; i++) {
            System.out.println();
            System.out.println("Gato" + i + ": ");
            System.out.println(gato[i]);
            
        }
        
    }

}
