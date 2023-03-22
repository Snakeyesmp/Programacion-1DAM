
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x;

        System.out.println("Introduce tu edad: ");

        Scanner entrada1 = new Scanner(System.in);
        x = entrada1.nextInt();

        if (x > 17) {

            System.out.println("Eres mayor de edad");

        } else {

            System.out.println("No eres mayor de edad");

        }
    }
}
