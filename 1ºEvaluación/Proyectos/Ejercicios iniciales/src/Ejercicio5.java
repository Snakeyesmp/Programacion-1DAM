
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x;

        
        System.out.println("Introduzca la longitud de su radio: ");

        
        Scanner entrada1 = new Scanner(System.in);
        x = entrada1.nextInt();

        
        System.out.println("La lontigud de la circumferencia es: " + (2 * x * Math.PI));
        System.out.println("El area del circulo es: " + (x * x * Math.PI));
        System.out.println("El volumen de la esfera es: " + (4 / 3 * x * x * x * Math.PI));

    }

}
