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
public class Coche_Moto extends Vehiculo{
     /**
     * Cantidad base que paga un coche o una moto (no incluye los gastos de gestión, 
     * ni el pago por los kms recorridos)
     */
    public static float PRECIO_BASE=1.0f;
     /**
     * lo que se le cobra al coche o moto por cada km recorrido
     */
    public static float PRECIO_POR_KM=0.05f;
    /**
     * los kms recorridos por el camión
     */
    private final float kms;

    public Coche_Moto(float kms, String referenciaTicket) {
        super(referenciaTicket);
        this.kms = kms;
    }
/**
     * Calcula lo que debe pagar el vehículo por el peaje (incluyendo los gastos
     * de gestión)
     * @return 
     */
    @Override
    float devolverImporte() {
        return PRECIO_BASE+(PRECIO_POR_KM*kms)+GASTOS_GESTION;
    }
    
}
