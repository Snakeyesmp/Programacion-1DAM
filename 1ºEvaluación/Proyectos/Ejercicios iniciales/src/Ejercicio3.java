
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x;

        
        System.out.println("Introduzca el lado de su cuadrado");

        
        Scanner entrada1 = new Scanner(System.in);
        x = entrada1.nextInt();

        
        System.out.println("El area del cuadrado es: " + x * x);

    }

}
