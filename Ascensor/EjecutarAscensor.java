package Ascensor;


public class EjecutarAscensor {    
        public static void main(String[] args) {
                // Inicialización del sistema con 5 pisos
                SistemaControl sistemaControl = new SistemaControl(5);
        
                // Simulación de solicitud de ascensor desde varios pisos
                System.out.println("Simulación de solicitudes de ascensor");
                
                System.out.println("Solicitando ascensor desde el piso 0 para subir");
                sistemaControl.recibirSolicitud(0, "subida");
        
                System.out.println("Solicitando ascensor desde el piso 3 para bajar");
                sistemaControl.recibirSolicitud(3, "bajada");
        
                System.out.println("Solicitando ascensor desde el piso 4 para bajar");
                sistemaControl.recibirSolicitud(4, "bajada");
        
                // Simulación de llegada al piso 2
                System.out.println("Moviendo el ascensor al piso 2");
                sistemaControl.recibirSolicitud(2, "subida");
        
                // Simulación de falla en el sistema
                System.out.println("Simulación de falla en el sistema");
                sistemaControl.alertaFalla("puerta");
        
                // Mensaje de fin de simulación
                System.out.println("Fin de la simulación del sistema de ascensores");
            }

}

