
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float x;
        float y;

        System.out.println("Introduzca el precio del articulo: ");

        Scanner entrada1 = new Scanner(System.in);
        x = entrada1.nextInt();

        System.out.println("Introduzca el precio de venta real: ");

        Scanner entrada2 = new Scanner(System.in);
        y = entrada2.nextInt();

        System.out.println("El porcentaje de descuento es de: " + ((100-(y / x) * 100) + "%"));

    }

}
