package Ascensor;

//representa la puerta del ascensor 
public class Puerta {
    private boolean abierta;// estado de la puerta true = abierta
    private boolean sensorObstaculo;// indica si hay algun obstaculo

    public Puerta() {
        this.abierta = false;
        this.sensorObstaculo = false;
    }

    // metodo para abrir la puerta
    public void abrir() {
        if (!sensorObstaculo) {
            abierta = true;
            System.out.println("Puerta abierta.");
        } else {
            System.out.println("Obstáculo detectado, no se puede abrir la puerta.");
        }
    }

    // metodo para cerrar la puerta
    public void cerrar() {
        if (!sensorObstaculo) {
            abierta = false;
            System.out.println("Puerta cerrada.");
        } else {
            System.out.println("Obstáculo detectado, no se puede cerrar la puerta.");
        }
    }

    // metodo que activa o desactiva el sensor de obstaculos
    public void detectarObstaculo(boolean estado) {
        sensorObstaculo = estado;
    }

    public boolean getAbierta() {
        return abierta;
    }

}
