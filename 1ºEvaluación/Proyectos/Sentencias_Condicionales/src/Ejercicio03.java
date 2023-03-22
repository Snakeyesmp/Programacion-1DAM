
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        int Dia;

        System.out.println("Introduzca el dia de la semana");
        Scanner entrada = new Scanner(System.in);
        Dia = entrada.nextInt();

        switch (Dia) {

            case 1:

                System.out.println("El dia de la semana es Lunes");

                break;

            case 2:

                System.out.println("El dia de la semana es Martes");

                break;

            case 3:

                System.out.println("El dia de la semana es Miercoles");

                break;

            case 4:

                System.out.println("El dia de la semana es Jueves");
                break;

            case 5:

                System.out.println("El dia de la semana es Viernes");
                break;

            case 6:

                System.out.println("El dia de la semana es Sabado");
                break;

            case 7:

                System.out.println("El dia de la semana es Domingo");
                break;

            default:
                System.out.println("Introduzca un numero del 1 al 7 porfavor");

        }

    }
}
