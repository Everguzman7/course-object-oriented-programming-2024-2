package Ascensor;

public class BotonAlumbrando extends Boton {
    
    public BotonAlumbrando(String tipo) {
        super(tipo);
    }

    @Override
    public void realizarAccion() {
        System.out.println("El botón está alumbrando.");
    }
}
