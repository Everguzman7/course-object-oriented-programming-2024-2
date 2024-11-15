package Ascensor;

public class Puerta {
    private boolean abierta;  
	private boolean sensorObstaculo;

	public Puerta() {
		this.abierta = false;
		this.sensorObstaculo = false;
	}

	public void abrir() {    
		if (!sensorObstaculo) {
			if (!abierta) {
				abierta = true;
				System.out.println("Puerta abierta.");
			} else {
				System.out.println("La puerta ya está abierta.");
			}
		} else {
			System.out.println("Obstáculo detectado, la puerta no se puede abrir.");
		}
	}

	public void cerrar() {   
		if (!sensorObstaculo) {
			if (abierta) {
				abierta = false;
				System.out.println("Puerta cerrada.");
			} else {
				System.out.println("La puerta ya está cerrada.");
			}
		} else {
			System.out.println("Obstáculo detectado, la puerta no se puede cerrar.");
		}
	}
	
	public void detectarObstaculo(boolean estado) {
		sensorObstaculo = estado;
		if (estado) {
			System.out.println("Obstáculo detectado.");
		} else {
			System.out.println("Obstáculo despejado.");
		}
	}
	
	public boolean isAbierta() {
		return abierta;
	}
	
	public boolean hayObstaculo() {
		return sensorObstaculo;
	}
	
}
