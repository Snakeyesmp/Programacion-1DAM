/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopista;

import javax.swing.JTextField;

/**
 *
 * @author Mario
 */
public class MyException extends Exception{
    private JTextField entrada;

    public MyException(JTextField entrada, String string) {
        super(string);
        this.entrada = entrada;
    }

    public JTextField getEntrada() {
        return entrada;
    }
    
}
