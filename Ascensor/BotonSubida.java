package Ascensor;
// clase que hereda de boton 
public class BotonSubida extends Boton {
    //se llama al construcyot de la clase padre com (subida)
    public BotonSubida() {
        super("subida");
    }

    @Override
    public void realizarAccion() {
        System.out.println("El botón de subida está activado. Indicando subida.");
    }
}
