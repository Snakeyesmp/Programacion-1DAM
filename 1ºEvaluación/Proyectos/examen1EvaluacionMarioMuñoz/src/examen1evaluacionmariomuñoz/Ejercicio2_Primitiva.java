/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1evaluacionmariomuñoz;

import java.util.Scanner;

/**
 *
 * @author Mario Muñoz Pequeño
 */
public class Ejercicio2_Primitiva {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Se declaran las variables a utilizar
        int numGenerado = 0;
        int numUsuario = 0;
        int contAciertos = 0;
        boolean repetido = false;
        //se crean dos arrays, uno para los numeros generados aleatoriamente y otro para los numeros introducidos por el usuario
        int arrayNum[] = new int[6];
        int arrayUsuario[] = new int[6];

        /*  NO HE CONSEGUIDO QUE NO SE REPITAN ASI QUE COMENTO TODA ESTA PARTE Y HAGO UN ARRAY NORMAL CON REPETICION
        
         //Se generan los 6 numeros aleatorios, y si no están repetidos se añaden al array
        for (int contador1 = 0; contador1 <= 5; contador1++) {

            //se comprueba con un Do...while todas las posiciones por si hubiese un repetido cambiarlo
            do {
                repetido = false;
                arrayNum[contador1] = (int) (Math.random() * (49 + 1) + 1);
                for (int contador2 = 0; contador2 <= 5; contador2++) {
                    if (contador1 == contador2) {
                        repetido = false;
                        break;
                    } else if (arrayNum[contador1] == arrayNum[contador2]) {
                        repetido = true;
                        break;
                    }
                }
                if (repetido == true) {
                    break;
                }
                System.out.println("num" + contador1 + " " + numGenerado);
            } while (repetido);
        }
         */
        //se generan los 6 numeros aleatorios, se añaden al array de la primitiva y se muestran en pantalla
        for (int i = 0; i <= 5; i++) {
            arrayNum[i] = (int) (Math.random() * (49 + 1) + 1);
            System.out.println(arrayNum[i]);
        }
        System.out.println("Introduce 6 numeros, Suerte!");
        //Se leen los intentos del usuario

        for (int n = 0; n <= 5; n++) {
            numUsuario = entrada.nextInt();
            arrayUsuario[n] = numUsuario;
        }
        //Se imprimen los intentos del usuario
        System.out.print("Sus numeros introducidos son:");

        for (int i = 0; i <= 5; i++) {
            System.out.print(" " + arrayUsuario[i]);
        }
        //Se deja un espacio en blanco por ayudar a leer mejor
        System.out.println("");
        //Se pone un mensaje al usuario para que lo entienda
        System.out.println("los numeros que has acertado son:");
        //Se comparan si los numeros del usuario y de la primitiva coinciden  
        for (int contador1 = 0; contador1 <= 5; contador1++) {
            for (int contador2 = 0; contador2 <= 5; contador2++) {
                if (arrayNum[contador1] == arrayUsuario[contador2]) {
                    //Contador para cada numero correcto que tengas
                    ++contAciertos;
                    System.out.print(arrayNum[contador1] + " ");
                }
            }
        }
        //Se deja un  espacio en blanco para claridad visual
        System.out.println("");
        //Se muestra el numero total de aciertos al usuario
        System.out.println("Lo cual suma un total de " + contAciertos + " numeros acertados");
    }
}
