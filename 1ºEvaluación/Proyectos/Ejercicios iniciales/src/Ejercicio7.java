
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x;

        
        System.out.println("Introduzca la distancia en millas marinas: ");

        
        Scanner entrada1 = new Scanner(System.in);
        x = entrada1.nextInt();

        
        System.out.println("Su distancia en metros es: " + (x * 1.852));
     
    }

}
