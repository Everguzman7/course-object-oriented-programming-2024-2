package Ascensor;
//representa la puerta del ascensor 
public class Puerta {
    private boolean abierta;
    private boolean sensorObstaculo;

    public Puerta() {
        this.abierta = false;
        this.sensorObstaculo = false;
    }

    public void abrir() {
        if (!sensorObstaculo) {
            abierta = true;
            System.out.println("Puerta abierta.");
        } else {
            System.out.println("Obstáculo detectado, no se puede abrir la puerta.");
        }
    }

    public void cerrar() {
        if (!sensorObstaculo) {
            abierta = false;
            System.out.println("Puerta cerrada.");
        } else {
            System.out.println("Obstáculo detectado, no se puede cerrar la puerta.");
        }
    }

    public void detectarObstaculo(boolean estado) {
        sensorObstaculo = estado;
    }

    public boolean getAbierta() {
        return abierta;
    }
	
}
