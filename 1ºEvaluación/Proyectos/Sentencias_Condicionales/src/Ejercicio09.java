
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        double resultado;
        double resultado1;
        
        
        a = 0;
        b = 0; 
        c = 0;
        resultado = 0;
        resultado1 = 0;
        
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Introduzca el primer numero");
        a = entrada.nextDouble();

        System.out.println("Introduzca el segundo numero");
        b = entrada.nextDouble();
        
        System.out.println("Introduzca el segundo numero");
        c = entrada.nextDouble();

        resultado = (double)((-b+Math.sqrt((b*b)-4*a*c))/2*a);
        
        resultado1 = (double)((-b-Math.sqrt((b*b)-4*a*c))/2*a);

        System.out.println("El resultado de la x es: " + resultado);
        System.out.println("El resultado de la x es: " + resultado1);
        
    }
}
