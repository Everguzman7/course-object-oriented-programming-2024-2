package Ascensor;

public class EjecutarAscensor {
   public static void main(String[] args) {
      // Creamos el sistema de control con 5 pisos
      SistemaControl objsistemaControl = new SistemaControl(5);

      // Simulación de solicitudes al ascensor
      System.out.println("Solicitando ascensor desde el piso 0 para subir");
      objsistemaControl.recibirSolicitud(0, "subida");

      System.out.println("\nSolicitando ascensor desde el piso 3 para bajar");
      objsistemaControl.recibirSolicitud(3, "bajada");

      System.out.println("\nSolicitando ascensor desde el piso 4 para bajar");
      objsistemaControl.recibirSolicitud(4, "bajada");

      Ascensor ascensor = new Ascensor();
      Puerta puerta = ascensor.getPuerta();

      System.out.println("Intentando abrir la puerta sin obstáculo:");
      puerta.abrir(); // Puerta se abre normalmente

      System.out.println("\nDetectando un obstáculo...");
      puerta.detectarObstaculo(true);

      System.out.println("Intentando cerrar la puerta con obstáculo:");
      puerta.cerrar(); // No debería cerrar por el obstáculo

      System.out.println("\nRemoviendo el obstáculo...");
      puerta.detectarObstaculo(false);

      System.out.println("Intentando cerrar la puerta nuevamente:");
      puerta.cerrar(); // Ahora debería cerrarse correctamente

      // Simulación de fallas en el sistema
      System.out.println("\nSimulación de falla en el sistema:");
      objsistemaControl.alertaFalla("puerta");

      // Finalización del programa
      System.out.println("\nFin de la simulación.");

   }

}
