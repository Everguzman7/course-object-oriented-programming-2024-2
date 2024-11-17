package Ascensor;

//representa el funcionamiento del ascensor 
//aqui se da la relacion de composicion ya que el ascensor tiene a (puerta)
public class Ascensor {

	private int pisoActual; // El piso donde se encuentra el ascensor actualmente
    private String direccion; // La dirección del movimiento: "subiendo", "bajando", o "detenido"
    private boolean enMovimiento; // Indica si el ascensor está en movimiento
    private Puerta puerta; // Composición: el ascensor tiene una puerta asociada

    // Constructor: inicializa los atributos del ascensor
    public Ascensor() {
        this.pisoActual = 0; // El ascensor empieza en el piso 0
        this.direccion = "detenido"; // Comienza sin moverse
        this.enMovimiento = false; // Inicialmente no está en movimiento
        this.puerta = new Puerta(); // Crea una nueva instancia de la clase Puerta
    }

    // Método para mover el ascensor a un piso específico
    public void moverA(int pisoDestino) {
        if (pisoDestino != pisoActual) { // Solo se mueve si el destino es diferente del piso actual
            puerta.cerrar(); // Cierra la puerta antes de moverse
            enMovimiento = true; // Marca que el ascensor está en movimiento
            direccion = (pisoDestino > pisoActual) ? "subiendo" : "bajando"; // Determina la dirección
            System.out.println("Ascensor " + direccion + " al piso " + pisoDestino);
            pisoActual = pisoDestino; // Actualiza el piso actual
            enMovimiento = false; // Detiene el ascensor
            direccion = "detenido"; // Actualiza la dirección a detenido
            puerta.abrir(); // Abre la puerta al llegar al destino
        } else {
            System.out.println("El ascensor ya está en el piso " + pisoDestino);
        }
    }

    // Cambia la dirección del ascensor (si no está en movimiento)
    public void cambiarDireccion(String nuevaDireccion) {
        if (!enMovimiento) {
            direccion = nuevaDireccion;
        }
    }

    // Detiene el ascensor y abre la puerta
    public void detener() {
        enMovimiento = false; // El ascensor ya no está en movimiento
        direccion = "detenido"; // Actualiza la dirección a "detenido"
        puerta.abrir(); // Abre la puerta
        System.out.println("Ascensor detenido en el piso " + pisoActual);
    }

    // Get devuelve el piso actual del ascensor
    public int getPisoActual() {
        return pisoActual;
    }

    // Get devuelve la dirección actual del ascensor
    public String getDireccion() {
        return direccion;
    }

    // Get devuelve si el ascensor está en movimiento
    public boolean isEnMovimiento() {
        return enMovimiento;
    }

    // Get devuelve la puerta asociada al ascensor
    public Puerta getPuerta() {
        return puerta;
    }
}
