/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cifradorinterface;

/**
 *
 * @author admin
 */
public class CifradorInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AlgoritmoCifrador multi = new Multiplicacion();
        AlgoritmoCifrador dif = new Diferencia();
        AlgoritmoCifrador xor = new Xor();
        System.out.println("Cifrado multiplicador: " + multi.cifrar(1, 2));
        System.out.println("Descifrado multiplicador: " + multi.descifrar(1, 2));
        System.out.println("Cifrado Diferencia: " + dif.cifrar(1, 2));
        System.out.println("Descifrado Diferencia: " + dif.descifrar(1, 2));

    }

}
