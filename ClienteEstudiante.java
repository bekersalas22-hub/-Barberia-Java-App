/**
 * CLASE DERIVADA (SUBCLASE): ClienteEstudiante
 * Propósito: Hereda de Cliente usando la palabra clave 'extends'.
 * Incluye atributos y comportamientos exclusivos para la comunidad estudiantil.
 */
public class ClienteEstudiante extends Cliente {
    // ATRIBUTO ÚNICO de esta subclase
    private String codigoEstudiante;

    /**
     * Constructor de la Subclase
     * Utiliza 'super' para invocar al constructor de la clase base y heredar sus atributos.
     */
    public ClienteEstudiante(String nombre, String tipoCorte, double precioCorte, String codigoEstudiante) {
        super(nombre, tipoCorte, precioCorte); // Llama al constructor de Cliente
        this.codigoEstudiante = codigoEstudiante; // Inicializa el atributo exclusivo
    }

    /**
     * SOBRESCRITURA DE MÉTODO (@Override)
     * Modifica el comportamiento del método original de la clase base.
     * Aplica el 20% de descuento exclusivo para estudiantes.
     */
    @Override
    public double calcularTotal() {
        double descuento = this.precioCorte * 0.20;
        return this.precioCorte - descuento;
    }

    /**
     * MÉTODO EXCLUSIVO de la subclase
     * Permite validar la credencial del estudiante.
     */
    public void validarCredencial() {
        System.out.println("[INFO] Credencial escolar #" + codigoEstudiante + " validada correctamente.");
    }

    /**
     * SOBRESCRITURA DE MÉTODO (@Override)
     * Llama al recibo base y le añade los detalles específicos de estudiante.
     */
    @Override
    public void mostrarRecibo() {
        System.out.println("========================================");
        System.out.println("      RECIBO: CLIENTE ESTUDIANTE        ");
        System.out.println("========================================");
        super.mostrarRecibo(); // LLAMADA AL MÉTODO DE LA CLASE BASE
        System.out.println("Código Estudiante: " + codigoEstudiante);
        System.out.println("Descuento Aplicado: 20%");
        System.out.println("----------------------------------------");
        System.out.println("TOTAL NETO A PAGAR: $" + calcularTotal());
        System.out.println("========================================\n");
    }
}
