
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float x;
        float y;

        System.out.println("Introduzca dos numeros a operar: ");
        
        
        Scanner entrada1 = new Scanner(System.in);
        x = entrada1.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        y = entrada2.nextInt();

        System.out.println("La suma de ambos numeros es: " + (x + y));
        System.out.println("La resta de ambos numeros es: " + (x - y));
        System.out.println("El producto de ambos numeros es: " + (x * y));
        System.out.println("La division de ambos numeros es: " + (x / y));

    }

}