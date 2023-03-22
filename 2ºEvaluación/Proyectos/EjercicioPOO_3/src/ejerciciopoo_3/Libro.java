/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopoo_3;

import java.util.Locale;

/**
 *
 * @author Mario
 */
public class Libro {

    String titulo, autor;
    int nEjemplares, nEjePrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int nEjemplares, int nEjePrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.nEjePrestados = nEjePrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(int nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public int getnEjePrestados() {
        return nEjePrestados;
    }

    public void setnEjePrestados(int nEjePrestados) {
        this.nEjePrestados = nEjePrestados;
    }

    public boolean prestamo() {
        if (nEjemplares <= 0) {
            return false;
        } else {
            ++nEjePrestados;
            nEjemplares--;
            return true;
        }
    }

    public boolean devolucion() {

        if (nEjePrestados <= 0) {
            return false;
        } else {
            nEjemplares--;
            nEjePrestados++;
            return true;
        }

    }
    
    @Override
    public String toString (){
        
        return "\n Titulo: " + this.titulo + "\n autor: " + this.autor + "\n numero de ejemplares: " + this.nEjemplares + "\n numero ejemplares prestados: " + this.nEjePrestados ;
        
    }
    
    
    
    
    
    
}
