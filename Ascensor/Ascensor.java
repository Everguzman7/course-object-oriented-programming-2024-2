package Ascensor;

public class Ascensor {
    private int pisoActual; // piso actual
	private String direccion; // "sube - baja - detenido"
	private boolean enMovimiento;
	private Puerta puerta;

	public Ascensor() {
		this.pisoActual = 0; // donde inicia el ascensor
		this.direccion = "detenido";
		this.enMovimiento = false;
		this.puerta = new Puerta();
	}

	public void moverA(int pisoDestino) {

		if (pisoDestino != pisoActual && !enMovimiento) {
			puerta.cerrar(); // cierra la puerta antes de moverse
			enMovimiento = true;
			direccion = (pisoDestino > pisoActual) ? "subiendo" : "bajando";
			pisoActual = pisoDestino;
			enMovimiento = false;
			direccion = "detenido";
			puerta.abrir(); // abre la puerta al llegar al piso
		}
	}

	public void cambiarDireccion(String nuevaDireccion) {

		if (!enMovimiento) {
			direccion = nuevaDireccion;
		}
	}

	public void detener() {

		if (enMovimiento) {
			enMovimiento = false;
			direccion = "detenido";
			puerta.abrir(); // abre la puerta cuando se detenga
		}
	}

	public int getPisoActual() {
		return pisoActual;
	}

	public String getDireccion() {
		return direccion;
	}
}

class Puerta {

	private boolean abierta;

	public Puerta() {
		this.abierta = true; // inicializa abierta para permitir entrada
	}

	public void abrir() {
		abierta = true;
		System.out.println("Puerta abierta.");
	}

	public void cerrar() {
		abierta = false;
		System.out.println("Puerta cerrada.");
	}

	public boolean isAbierta() {
		return abierta;
	}
}
