/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosbucles;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        double numero;
        double mayor = 0;
        double suma = 0;
        double media = 0;
        int contadorImpar = 0;
        double resto;

        System.out.println("Introduce un numero cualquiera.");

        numero = enter.nextDouble();

        if (numero < 0) {
            System.out.println("Es un numero negativo, gracias por jugar.");
        } else {
            while (numero > 0) {
                resto = numero % 2;
                if (resto != 0) {
                    suma = suma + numero;
                    contadorImpar++;
                } else if (mayor < numero) {
                    mayor = numero;
                }
                System.out.println("Introduce otro numero");
                numero = enter.nextDouble();
            }

            media = suma / contadorImpar;
            System.out.println("La media es " + media + " el mayor de los pares es " + mayor);
        }

    }

}
