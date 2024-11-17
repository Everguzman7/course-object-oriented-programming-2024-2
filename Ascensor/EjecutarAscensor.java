package Ascensor;


public class EjecutarAscensor {    
   public static void main(String[] args) {
    // Creamos el sistema de control con 5 pisos
    SistemaControl sistemaControl = new SistemaControl(5);

    // Simulación de solicitudes al ascensor
    System.out.println("Solicitando ascensor desde el piso 0 para subir");
    sistemaControl.recibirSolicitud(0, "subida");

    System.out.println("\nSolicitando ascensor desde el piso 3 para bajar");
    sistemaControl.recibirSolicitud(3, "bajada");

    System.out.println("\nSolicitando ascensor desde el piso 4 para bajar");
    sistemaControl.recibirSolicitud(4, "bajada");

    
    // Simulación de fallas en el sistema
    System.out.println("\nSimulación de falla en el sistema:");
    sistemaControl.alertaFalla("puerta");

    // Finalización del programa
    System.out.println("\nFin de la simulación.");
 }

}
