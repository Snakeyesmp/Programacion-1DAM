
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        int Primera, Segunda, Tercera, Cuarta, Quinta, Sexta, Septima, Octava, Novena, Decima, Nota;

        Primera = 0;
        Segunda = 0;
        Tercera = 0;
        Cuarta = 0;
        Quinta = 0;
        Sexta = 0;
        Septima = 0;
        Octava = 0;
        Novena = 0;
        Decima = 0;
        Nota = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("1...  Cual es la funcion para imprimir un texto por pantalla en Java?");
        System.out.println("1. System.out.println");
        System.out.println("2. System.Out.Println");
        System.out.println("3. System.Imprimir");

        Primera = entrada.nextInt();

        switch (Primera) {

            case 1:
                System.out.println("Correcto");
                ++Nota;

            case 2:
                System.out.println("Has fallado");

            case 3:
                System.out.println("Has fallado");
        }

        System.out.println("2... Cual es la estructura de un comentario para una sola línea?");
        System.out.println("1. /* */");
        System.out.println("2. //");
        System.out.println("3. /** */");

        Segunda = entrada.nextInt();
        switch (Segunda) {

            case 1:
                System.out.println("Has fallado");

            case 2:
                System.out.println("Correcto");
                ++Nota;

            case 3:
                System.out.println("Has fallado");
        }

        System.out.println("3... Cual es la estructura de un comentario para una o varias lineas?");
        System.out.println("1. /* */");
        System.out.println("2. //");
        System.out.println("3. /** */");

        Tercera = entrada.nextInt();
        switch (Tercera) {

            case 1:
                System.out.println("Correcto");
                ++Nota;

            case 2:
                System.out.println("Has fallado");

            case 3:
                System.out.println("Has fallado");
        }

        System.out.println("4... Pasa 1001 a decimal");
        System.out.println("1. 9");
        System.out.println("2. 1001");
        System.out.println("3. 256");

        Cuarta = entrada.nextInt();
        switch (Cuarta) {

            case 1:
                System.out.println("Correcto");
                ++Nota;

            case 2:
                System.out.println("Has fallado");

            case 3:
                System.out.println("Has fallado");
        }

        System.out.println("5... Que es eclipse?");
        System.out.println("1. Un lenguaje de programación");
        System.out.println("2. un IDE");
        System.out.println("3. Una version de java exclusiva para servidores");

        Quinta = entrada.nextInt();
        switch (Quinta) {

            case 1:
                System.out.println("Has fallado");

            case 2:
                System.out.println("Correcto");
                ++Nota;

            case 3:
                System.out.println("Has fallado");
        }

        System.out.println("6... Java distingue entre Mayusculas y minusculas");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");

        Sexta = entrada.nextInt();
        switch (Sexta) {

            case 1:
                System.out.println("Has fallado");
                ++Nota;

            case 2:
                System.out.println("Correcto");

        }

        System.out.println("7... Como se escribe un comentario en HTML?");
        System.out.println("1. !//  //!");
        System.out.println("2. /*    */");
        System.out.println("3. <!––   ––>");

        Septima = entrada.nextInt();
        switch (Septima) {

            case 1:
                System.out.println("Has fallado");

            case 2:
                System.out.println("Has fallado");

            case 3:
                System.out.println("Correcto");
                ++Nota;

        }

        System.out.println("8... Como tiene que empezar un documento HTML?");
        System.out.println("1. !DOCTYPE");
        System.out.println("2. <HTML>");
        System.out.println("3. HTTP:");

        Octava = entrada.nextInt();
        switch (Octava) {

            case 1:
                System.out.println("Correcto");
                ++Nota;

            case 2:
                System.out.println("Has fallado");

            case 3:
                System.out.println("Has fallado");

        }

        System.out.println("9... Cual es el lenguaje estandar para dar estilos a una pagina web?");
        System.out.println("1. HTML");
        System.out.println("2. JavaScript");
        System.out.println("3. CSS");

        Novena = entrada.nextInt();
        switch (Novena) {

            case 1:
                System.out.println("Has fallado");

            case 2:
                System.out.println("Has fallado");

            case 3:
                System.out.println("Correcto");
                ++Nota;

        }

        System.out.println("10... HTML distingue entre mayusculas y minusculas?");
        System.out.println("1. Verdadero");
        System.out.println("2. Falso");

        Decima = entrada.nextInt();
        switch (Decima) {

            case 1:
                System.out.println("Has fallado");

            case 2:
                System.out.println("Correcto");
                ++Nota;

        }

        System.out.println("Tu nota es: " + Nota);

    }
}
