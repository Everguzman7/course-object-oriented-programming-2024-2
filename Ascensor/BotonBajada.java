package Ascensor;
//clase que hereda de boton
public class BotonBajada extends Boton {
    
    public BotonBajada() {
        super("bajada");
    }

    @Override
    public void realizarAccion() {
        System.out.println("El boton de bajada esta activado. indicando bajada.");
    }
}
