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
public abstract class Vehiculo {
    /**
     * A todos los vehículos se les cobra la misma cantidad en concepto de gastos
     * de gestión
     */
    public static float GASTOS_GESTION=0.1f;
     /**
     * La referencia del ticket de peaje es una cadena compuesta por 6 dígitos
     * numéricos separados mediante un - de un grupo de 3 letras del espa?ol sin acentuar
     * seguido de 2 dígitos numéricos 
     * Por ejemplo: 
     * 432132-agX23 
     * 300212-Gz?45
     * 001234-Bje33
     */
    private String referenciaTicket;

    public Vehiculo(String referenciaTicket) {
        this.referenciaTicket = referenciaTicket;
    }
    /**
     * Calcula lo que debe pagar el vehículo por el peaje (incluyendo los gastos
     * de gestión)
     * @return 
     */
    abstract float devolverImporte();    
}
