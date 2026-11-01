/**
 * CLASE DERIVADA (SUBCLASE): ClienteVIP
 * Propósito: Hereda de Cliente. Modifica las reglas de negocio para clientes frecuentes.
 */
public class ClienteVIP extends Cliente {
    // ATRIBUTO ÚNICO de esta subclase
    private int puntosAcumulados;

    /**
     * Constructor de la Subclase VIP
     */
    public ClienteVIP(String nombre, String tipoCorte, double precioCorte, int puntosIniciales) {
        super(nombre, tipoCorte, precioCorte); // Reutiliza el constructor base
        this.puntosAcumulados = puntosIniciales;
    }

    /**
     * SOBRESCRITURA DE MÉTODO (@Override)
     * Aplica un 10% de descuento fijo por lealtad VIP.
     */
    @Override
    public double calcularTotal() {
        double descuento = this.precioCorte * 0.10;
        return this.precioCorte - descuento;
    }

    /**
     * MÉTODO EXCLUSIVO de la subclase VIP
     * Simula la entrega de un beneficio de cortesía exclusivo.
     */
    public void entregarBebidaCortesia() {
        System.out.println("[VIP BENEFICIO] Se ha entregado una bebida de cortesía a: " + nombre);
        this.puntosAcumulados += 10; // Suma puntos por su visita
    }

    @Override
    public void mostrarRecibo() {
        System.out.println("========================================");
        System.out.println("            RECIBO: CLIENTE VIP         ");
        System.out.println("========================================");
        super.mostrarRecibo(); // LLAMADA AL MÉTODO DE LA CLASE BASE
        System.out.println("Puntos del Club VIP: " + puntosAcumulados);
        System.out.println("Descuento Aplicado: 10% Elegibilidad VIP");
        System.out.println("----------------------------------------");
        System.out.println("TOTAL NETO A PAGAR: $" + calcularTotal());
        System.out.println("========================================\n");
    }
}
