package Ascensor;
// clase que hereda de boton 
public class BotonSubida extends Boton {
    
    public BotonSubida() {
        super("subida");
    }

    @Override
    public void realizarAccion() {
        System.out.println("El botón de subida está activado. Indicando subida.");
    }
}
