
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        double a;
        double b;
        double x;

        a = 0;
        b = 0;
        x = 0;

        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Introduzca el primer numero");
        a = entrada.nextDouble();

        System.out.println("Introduzca el segundo numero");
        b = entrada.nextDouble();

        System.out.println("Introduzca el tercer numero");
        x = entrada.nextDouble();

        x = (-b/a);

        System.out.println("Tu resultado es: " + x);
        
    }
}
