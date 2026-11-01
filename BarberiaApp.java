/**
 * CLASE DE EJECUCIÓN PRINCIPAL
 * Propósito: Instanciar objetos de las subclases y verificar el funcionamiento de la herencia.
 */
public class BarberiaApp {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE BARBERÍA CON HERENCIA E INCLUSIÓN ---\n");

        // INSTANCIACIÓN DE SUBCLASES (Objetos con herencia)
        // Creamos un ClienteEstudiante (Pasa nombre, corte, precio y su código único)
        ClienteEstudiante estudiante = new ClienteEstudiante("Luis Pérez", "Corte Clásico", 200.0, "EST-2026X");

        // Creamos un ClienteVIP (Pasa nombre, corte, precio y sus puntos acumulados)
        ClienteVIP vip = new ClienteVIP("Carlos Mendoza", "Corte con Barba Premium", 400.0, 50);

        // PRUEBA DE MÉTODOS Y VERIFICACIÓN DE HERENCIA
        
        // 1. Probando el objeto Estudiante
        estudiante.validarCredencial(); // Método exclusivo de la subclase
        estudiante.mostrarRecibo();     // Método sobrescrito que llama a super.mostrarRecibo()

        // 2. Probando el objeto VIP
        vip.entregarBebidaCortesia();   // Método exclusivo de la subclase
        vip.mostrarRecibo();            // Método sobrescrito
        
        System.out.println("--- FIN DE LAS PRUEBAS DE HERENCIA ---");
    }
}
