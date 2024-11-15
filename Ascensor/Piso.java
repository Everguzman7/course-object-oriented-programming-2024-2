package Ascensor;

public class Piso {
    private int numero;
    private BotonSubida botonSubida;
    private BotonBajada botonBajada;

    public Piso(int numero, boolean tieneSubida, boolean tieneBajada) {
        this.numero = numero;
        if (tieneSubida) {
            this.botonSubida = new BotonSubida();
        }
        if (tieneBajada) {
            this.botonBajada = new BotonBajada();
        }
    }

    public void solicitarAscensor(String direccion) {
        if (direccion.equals("subida") && botonSubida != null) {
            botonSubida.presionar();
        } else if (direccion.equals("bajada") && botonBajada != null) {
            botonBajada.presionar();
        } else {
            System.out.println("Dirección inválida o botón no disponible en este piso.");
        }
    }

    public int getNumero() {
        return numero;
    }

    public BotonSubida getBotonSubida() {
        return botonSubida;
    }

    public BotonBajada getBotonBajada() {
        return botonBajada;
    }
}
