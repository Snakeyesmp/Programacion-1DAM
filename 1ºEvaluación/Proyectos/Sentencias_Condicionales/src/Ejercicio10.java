
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        int Dia;
        int Mes;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el numero de dia de nacimiento");
        Dia = entrada.nextInt();

        if (Dia < 1 || Dia > 31) {
            
            System.out.println("Introduzca un numero del mes valido porfavor");
        } else {

            System.out.println("Introduzca mes de nacimiento con numeros");
            Mes = entrada.nextInt();

            if ((Dia >= 21 & Mes == 3) || Dia <= 19 & Mes == 4) {

                System.out.println("Tu signo es Aries");
            }

            if ((Dia >= 20 & Mes == 4) || Dia <= 20 & Mes == 5) {

                System.out.println("Tu signo es Tauro");
            }

            if ((Dia >= 21 & Mes == 5) || Dia <= 20 & Mes == 6) {

                System.out.println("Tu signo es Geminis");
            }

            if ((Dia >= 21 & Mes == 6) || Dia <= 22 & Mes == 7) {

                System.out.println("Tu signo es Cancer");
            }

            if ((Dia >= 23 & Mes == 7) || Dia <= 22 & Mes == 8) {

                System.out.println("Tu signo es Leo");
            }

            if ((Dia >= 23 & Mes == 8) || Dia <= 22 & Mes == 9) {

                System.out.println("Tu signo es Virgo");
            }

            if ((Dia >= 23 & Mes == 9) || Dia <= 22 & Mes == 10) {

                System.out.println("Tu signo es Libra");
            }

            if ((Dia >= 23 & Mes == 10) || Dia <= 21 & Mes == 11) {

                System.out.println("Tu signo es Escorpio");
            }

            if ((Dia >= 22 & Mes == 11) || Dia <= 21 & Mes == 12) {

                System.out.println("Tu signo es Sagitario");
            }

            if ((Dia >= 22 & Mes == 12) || Dia <= 19 & Mes == 1) {

                System.out.println("Tu signo es Capricornio");
            }

            if ((Dia >= 20 & Mes == 1) || Dia <= 18 & Mes == 2) {

                System.out.println("Tu signo es Acuario");
            }

            if ((Dia >= 19 & Mes == 2) || Dia <= 20 & Mes == 3) {

                System.out.println("Tu signo es Piscis");

            }
        }
    }
}
