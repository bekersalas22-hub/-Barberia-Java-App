/**
 * CLASE BASE (SUPERCLASE): Cliente
 * Propósito: Define los atributos y métodos comunes para todos los clientes de la barbería.
 * Sirve como plantilla para las clases derivadas mediante el concepto de HERENCIA.
 */
public class Cliente {
    // Atributos protegidos (protected) para que las subclases puedan acceder a ellos directamente
    protected String nombre;
    protected String tipoCorte;
    protected double precioCorte;

    /**
     * Constructor de la Clase Base
     */
    public Cliente(String nombre, String tipoCorte, double precioCorte) {
        this.nombre = nombre;
        this.tipoCorte = tipoCorte;
        this.precioCorte = precioCorte;
    }

    /**
     * Método Base para calcular el total. 
     * Las subclases lo van a sobrescribir (Polimorfismo) para aplicar sus propias reglas.
     */
    public double calcularTotal() {
        return this.precioCorte; // Tarifa normal sin descuentos
    }

    /**
     * Método Base para mostrar los datos generales en el recibo.
     */
    public void mostrarRecibo() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Servicio: " + tipoCorte);
        System.out.println("Precio Base: $" + precioCorte);
    }
}
