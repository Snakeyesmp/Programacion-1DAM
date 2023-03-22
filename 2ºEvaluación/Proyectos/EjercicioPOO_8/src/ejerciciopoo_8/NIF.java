/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo_8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class NIF {
    int numDNI;
    char letra;

    public NIF() {
    }

    public NIF(int numDNI) {
        this.numDNI = numDNI;
    }

    public void setNumDNI(int numDNI) {
        this.numDNI = numDNI;
    }
    
    
    public String leer(){

        int calculoLetra;
        String arrayLetra[] = new String[23];

        arrayLetra[0] = "T";
        arrayLetra[1] = "R";
        arrayLetra[2] = "W";
        arrayLetra[3] = "A";
        arrayLetra[4] = "G";
        arrayLetra[5] = "M";
        arrayLetra[6] = "Y";
        arrayLetra[7] = "F";
        arrayLetra[8] = "P";
        arrayLetra[9] = "D";
        arrayLetra[10] = "X";
        arrayLetra[11] = "B";
        arrayLetra[12] = "N";
        arrayLetra[13] = "J";
        arrayLetra[14] = "Z";
        arrayLetra[15] = "S";
        arrayLetra[16] = "Q";
        arrayLetra[17] = "V";
        arrayLetra[18] = "H";
        arrayLetra[19] = "L";
        arrayLetra[20] = "C";
        arrayLetra[21] = "K";
        arrayLetra[22] = "E";

        calculoLetra = (this.numDNI % 23);
        return arrayLetra[calculoLetra];
        
    }

    @Override
    public String toString() {
        return numDNI + "-"  + leer() ;
    }
    
    
    
    
}
