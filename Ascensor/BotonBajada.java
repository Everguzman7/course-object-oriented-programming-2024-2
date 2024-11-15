package Ascensor;

public class BotonBajada extends Boton {
    public BotonBajada() {
        super("bajada");
    }

    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Solicitando ascensor para bajar.");
    }
}
