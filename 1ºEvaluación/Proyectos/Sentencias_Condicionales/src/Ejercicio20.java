/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        java.util.Scanner enter = new java.util.Scanner(System.in);

        System.out.println("Escribe un numero entero con una longitud maxima de 5 cifras.");

        String str = enter.nextLine();
        int longitud = str.length();
        String text = " no es capicua.";

        if (longitud == 1) {

            text = " no tiene suficientes digitos como para ser capicua.";

        } else if (longitud <= 3) {

            if (str.charAt(0) == str.charAt(longitud - 1)) {

                text = " es capicua.";
            }

        } else if (longitud <= 5) {
            if (str.charAt(0) == str.charAt(longitud - 1)) {
                if (str.charAt(1) == str.charAt(longitud - 2)) {
                    text = " es capicua.";
                }
            }

        } else {
            text = " tiene mas de cinco cifras.";
        }
        System.out.println("El numero " + str + "" + text);
    }
}
