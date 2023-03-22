
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio15 {

    public static void main(String[] args) {

        String C;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el caracter con el que se llenara la piramide");
        C = entrada.nextLine();
        
        System.out.println("       *"+C);
        System.out.println("      "+C+C+C);
        System.out.println("     "+C+C+C+C+C);
        System.out.println("    "+C+C+C+C+C+C+C);
    }
}
