/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradorinterface;

/**
 *
 * @author admin
 */
public class Xor implements AlgoritmoCifrador {

    public int cifrar(int numero1, int numero2) {
        return numero1 ^ numero2;
    }

    public int descifrar(int numero1, int numero2) {
        return numero1 ^ numero2;
    }

}
