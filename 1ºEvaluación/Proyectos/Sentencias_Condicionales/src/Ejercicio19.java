/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mario Muñoz
 */
public class Ejercicio19 {
    //Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
    //positivo o negativo. Se permiten números de hasta 5 dígitos.

    public static void main(String[] args) {

        java.util.Scanner enter = new java.util.Scanner(System.in);

        System.out.println("Escribe un numero entero con una longitud maxima de 5 cifras");

        String str = enter.nextLine();
        int longitud = str.length();
        int num = Integer.valueOf(str);
        //char primer = str.charAt(0);
        if (longitud > 5) {
            System.out.println("Introduce un numero de MAXIMO cinco cifras, gracias");
        } else if (num < 0) {
            longitud--;
        }
        System.out.println(longitud);

    }
}
