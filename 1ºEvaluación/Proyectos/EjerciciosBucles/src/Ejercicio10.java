/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        double numeros;
        double suma = 0;
        double contador = 1;
        double media = 0;

        Scanner enter = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numeros = enter.nextDouble();

        while (numeros >= 0) {
            suma = numeros + suma;
            contador++;
            media = suma / contador;
            System.out.println("Introduce otro numero. Si deseas dejar de meter numeros introduce uno negativo");
            numeros = enter.nextDouble();
        }
        System.out.println("La media es " + media + " y has introducido un total de " +contador+ " numeros.");

    }

}
