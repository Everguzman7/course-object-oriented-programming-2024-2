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

    // Método para solicitar el ascensor
    public void solicitarAscensor(String direccion) {
        if (direccion.equals("subida")) {
            botonSubida.presionar(); // Presiona el botón de subida
        } else if (direccion.equals("bajada")) {
            botonBajada.presionar(); // Presiona el botón de bajada
        } else {
            System.out.println("Dirección inválida");
        }
    }

    // Get devuelve el número del piso
    public int getNumero() {
        return numero;
    }
   
}
