package Ascensor;
//clase que hereda de boton
public class BotonBajada extends Boton {
    //se llama al constructor de la clase padre con (bajada )
    public BotonBajada() {
        super("bajada");
    }

    @Override
    public void realizarAccion() {
        System.out.println("El boton de bajada esta activado. indicando bajada.");
    }
}
