/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopista;

/**
 *
 * @author Mario
 */
public class Bicicleta extends Vehiculo{
    /**
     * Cantidad que paga una bicicleta (no incluye los gastos de gestión)
     */
    public static float PRECIO_BASE=0.5f;

    public Bicicleta(String referenciaTicket) {
        super(referenciaTicket);
    }
/**
     * Calcula lo que debe pagar el vehículo por el peaje (incluyendo los gastos
     * de gestión)
     * @return 
     */
    @Override
    float devolverImporte() {
       return PRECIO_BASE+GASTOS_GESTION;
    }
    
}
