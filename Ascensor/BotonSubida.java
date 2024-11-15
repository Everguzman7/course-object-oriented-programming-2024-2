package Ascensor;

public class BotonSubida extends Boton {
    public BotonSubida() {
        super("subida");
    }

    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Solicitando ascensor para subir.");
    }
}
