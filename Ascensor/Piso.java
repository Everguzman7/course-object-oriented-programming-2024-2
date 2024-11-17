package Ascensor;
//clase piso donde se representa el piso del edificio con botones de subida y bajada 
public class Piso {
    private int numero; // Número del piso
    private BotonSubida botonSubida;
    private BotonBajada botonBajada;

    public Piso(int numero) {
        this.numero = numero;
        this.botonSubida = new BotonSubida();
        this.botonBajada = new BotonBajada();
    }

    //se solicita el ascensor a la dirreccion dada 
    public void solicitarAscensor(String direccion) {
        if (direccion.equals("subida")) {
            botonSubida.presionar();
        } else if (direccion.equals("bajada")) {
            botonBajada.presionar();
        }
    }

    public int getNumero() {
        return numero;
    }
   
}
