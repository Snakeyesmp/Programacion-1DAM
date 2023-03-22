
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio08 {

    public static void main(String[] args) {

        int Num1;
        int Num2;
        int Num3;
        int media;

        Num1 = 0;
        Num2 = 0;
        Num3 = 0;
        media = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        Num1 = entrada.nextInt();

        System.out.println("Introduzca el segundo numero");
        Num2 = entrada.nextInt();

        System.out.println("Introduzca el tercer numero");
        Num3 = entrada.nextInt();

        media = ((Num1 + Num2 + Num3) / 3);

        System.out.println("Tu nota media es: " + media);

        switch (media) {

            case 0,1,2,3,4:

                System.out.println("Insuficiente");

                break;

            case 5:

                System.out.println("Suficiente");

                break;

            case 6:

                System.out.println("Bien");

                break;

            case 7,8:

                System.out.println("Notable");

                break;

            case 9,10:

                System.out.println("Sobresaliente");

                break;

            default:

                System.out.println("Introduzca valores dentro de los parametros porfavor");

        }

    }
}
