public class Producto {
    // Atributos
    private String nombre;
    private int cantidad;

    // Métodos

    // Constructor con parámetros donde asignamos el valor dado a los atributos

    public Producto(String nom, int cant) {
        this.nombre = nom;
        this.cantidad = cant;
    }

    // Cosntructor sin parámetros donde inicializamos los atributos

    public Producto() {
        // La palabara reservada null se utiliza para inicializar los objetos,
        // indicando que el puntero del objeto no apunta a ninguna dirección
        // de memoria. No hay que olvidar que String es una clase.
        this.nombre = null;
        this.cantidad = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
