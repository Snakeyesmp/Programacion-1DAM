
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        // Se considerará que el fin de semana comienza el viernes a las 15:00h.

        System.out.println("Vamos a calcular cuanto falta para el fin de semana. Introduce el dia de la semana");
        Scanner entrada = new Scanner(System.in);

        String dia = entrada.nextLine();
        int dian = 0;

        switch (dia) {
            case "lunes":
                dian = 0;
                break;
            case "martes":
                dian = 1;
                break;
            case "miercoles":
                dian = 2;
                break;
            case "jueves":
                dian = 3;
                break;
            case "viernes":
                dian = 4;
                break;
            default:
                System.out.print("El día introducido no es correcto");
        }

        System.out.println("introduce la hora, sin los minutos");
        int h = entrada.nextInt();
        System.out.println("introduce los minutos");
        int min = entrada.nextInt();

        int minutosTotales = (4 * 24 * 60) + (15 * 60);
        int minutosActuales = (dian * 24 * 60) + (h * 60) + min;

        System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");

    }
}
