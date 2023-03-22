
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        int Horas;
        int Salario;
        int Salario2;
        int SalarioFinal;

        Horas = 0;
        Salario = 0;
        Salario2 = 0;

        System.out.println("Introduzca las horas trabajadas");
        Scanner entrada = new Scanner(System.in);
        Horas = entrada.nextInt();

        //***********
        //OPERACIONES
        //***********
        Salario = (Horas * 12);

        Salario2 = (Salario + ((Horas - 40 ) * 16));


        //*************
        //COMPARACIONES
        //*************
        if (Horas <= 40) {

            System.out.println("El salario es de: " + Salario);

        } else {

            System.out.println("El salario es de: " + (Salario2 - 12));

        }
    }
}
