
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        String Primera, Segunda, Tercera, Cuarta, Quinta, Sexta, Septima, Octava, Novena, Decima;

        int Nota, NotaTotal;

        Nota = 0;

        NotaTotal = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("1...  Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");

        Primera = entrada.nextLine();

        switch (Primera) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("2... Ha aumentado sus gastos de vestuario");

        Segunda = entrada.nextLine();
        switch (Segunda) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("3... Ha perdido el interés que mostraba anteriormente por ti");

        Tercera = entrada.nextLine();
        switch (Tercera) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("4... Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer");

        Cuarta = entrada.nextLine();
        switch (Cuarta) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("5... No te deja que mires la agenda de su teléfono móvil");

        Quinta = entrada.nextLine();
        switch (Quinta) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("6... A veces tiene llamadas que dice no querer contestar cuando estás tú delante");

        Sexta = entrada.nextLine();
        switch (Sexta) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("7... Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");

        Septima = entrada.nextLine();
        switch (Septima) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("8... Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");

        Octava = entrada.nextLine();
        switch (Octava) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("9... Has notado que últimamente se perfuma más");

        Novena = entrada.nextLine();
        switch (Novena) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("10... Se confunde y te dice que ha estado en sitios donde no ha ido contigo");

        Decima = entrada.nextLine();
        switch (Decima) {
            case "V":
                NotaTotal = NotaTotal + 3;
            case "F":
        }

        System.out.println("Tu nota es: " + NotaTotal);

        if (NotaTotal < 11) {
            System.out.println("Enhorabuena! tu pareja parece ser totalmente fiel.");

        } else {

            if (NotaTotal < 23 && NotaTotal > 11) {
                System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente. No bajes la guardia");

            } else {
                System.out.println("Tu pareja tienes todos los ingredientes para estar viviendo un romance con otra persona.");
            }
        }
    }
}