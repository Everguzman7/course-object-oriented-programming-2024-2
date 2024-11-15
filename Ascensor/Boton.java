package Ascensor;

public class Boton {
    protected boolean presionado;
    protected String tipo;

    public Boton(String tipo) {
        this.tipo = tipo;
        this.presionado = false;
    }

    public void presionar() {
        presionado = true;
        System.out.println("Botón de " + tipo + " presionado.");
    }

    public void liberar() {
        presionado = false;
        System.out.println("Botón de " + tipo + " liberado.");
    }

    public boolean isPresionado() {
        return presionado;
    }
}
