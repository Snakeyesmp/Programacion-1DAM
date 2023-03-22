
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String Dia;

        System.out.println("Introduzca el dia de la semana");
        Scanner entrada = new Scanner(System.in);
        Dia = entrada.nextLine();

        switch (Dia) {
            case "lunes":

                System.out.println("La asignatura es Sistemas Informaticos");

                break;

            case "martes":

                System.out.println("La asignatura es Programacion");

                break;

            case "miercoles":

                System.out.println("La asignatura es Lenguaje de Marca");

                break;

            case "jueves":

                System.out.println("La asignatura es Sistemas informaticos");

                break;

            case "viernes":

                System.out.println("La asignatura es Sistemas informaticos");

                break;

            default:

                System.out.println("Introduzca un dia de la semana porfavor");

        }

    }

}
