
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        int Numero;
        int RestoPar;
        int RestoCinco;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu numero");
        Numero = entrada.nextInt();

        RestoPar = (Numero % 2);
        RestoCinco = (Numero % 5);

        if (RestoPar == 0) {

            System.out.println("Tu numero introducido es par");

        } else {

            System.out.println("Tu numero es impar");

        }

        if (RestoCinco == 0) {

            System.out.println("y divisible entre 5");

        } else {

            System.out.println("y no es divisible entre 5");

        }
    }
}