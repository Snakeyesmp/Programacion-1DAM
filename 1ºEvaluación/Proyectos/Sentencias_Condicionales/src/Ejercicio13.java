
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;

        n1 = 0;
        n2 = 0;
        n3 = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        n1 = entrada.nextInt();

        System.out.println("Introduzca el primer numero");
        n2 = entrada.nextInt();

        System.out.println("Introduzca el primer numero");
        n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {

            if (n2 > n3) {

                System.out.println("El orden de los numeros es: " + n1 + ">" +n2 + ">" + n3);

            } else {

                System.out.println("El orden de los numeros es: " + n1 + ">"  + n3 + ">"  + n2);
            }

        }
        if (n2 > n1 && n2 > n3) {

            if (n1 > n3) {

                System.out.println("El orden de los numeros es: " + n2 + ">" + n1 + ">" +n3);

            } else {

                System.out.println("El orden de los numeros es: " + n2 + ">" + n3 + ">" + n1);
            }
        }

        if (n3 > n1 && n3 > n2) {

            if (n1 > n2) {

                System.out.println("El orden de los numeros es: " + + n3 + ">" +  n1 + ">" + n2);

            } else {

                System.out.println("El orden de los numeros es: " + n3 + ">" + n2 + ">" + n1);

            }
        }

    }
}