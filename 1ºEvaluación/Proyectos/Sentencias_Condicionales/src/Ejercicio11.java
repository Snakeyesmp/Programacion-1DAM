
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mario
 */
public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Horas;
        int Minutos;
        final int HoraMidNight;
        final int MinutoMidNight;
        int HoraRestante;
        int MinutoRestante;
        int SegundosRestantes;
        

        Horas = 0;
        Minutos = 0;
        HoraMidNight = 24;
        MinutoMidNight = 60;
        HoraRestante = 0;
        MinutoRestante = 0;

        System.out.println("Escriba la hora porfavor");
        Horas = entrada.nextInt();

        System.out.println("Escriba los minutos");
        Minutos = entrada.nextInt();

        HoraRestante = (HoraMidNight - Horas);
        MinutoRestante = (MinutoMidNight - Minutos);
        
        SegundosRestantes= ((HoraRestante*3600)+(MinutoRestante*60))  ;
        
        
        

        System.out.println("Faltan: " + SegundosRestantes + " para medianoche");

    }
}
