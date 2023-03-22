/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo_2;

/**
 *
 * @author Mario
 */
public class Contador {

    private int cont;
    
    public Contador() {
    }
    /**
     * 
     * @param contador 
     */
    public Contador(int cont) {

        if (cont <= 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }
    /**
     * 
     * @param contador
     */
    public Contador(final Contador a) { //Constructor copia, se hace poniendo un constructor vacío con el tipo de datos del objeto
        this.cont = a.cont;
    }
    /**
     * 
     * @return contador
     */
    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont <= 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public void incrementar() {
        this.cont++;
    }

    public void decrementar() {
        if (this.cont <= 0) {
            this.cont = 0;
        } else {
            this.cont--;
        }
    }
}