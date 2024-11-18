package Ascensor;
//clase abstracta que da el comportamiento
public abstract class Boton {
    
    private boolean presionado;//indica si el boton esta presionado
    private boolean alumbrando; // Indica si el botón está alumbrando
    private String tipo; //tipo de boton(subiba, bajada)

    //constructor  donde se inicializa 
    public Boton(String tipo) {
        this.tipo = tipo;
        this.presionado = false;
        this.alumbrando = false;
    }
//metodo para presionar el boton, tambien cambia el estado a presionado y activa el alumbrado.
    public void presionar() {
        presionado = true;
        alumbrando = true; // Al presionar, el botón comienza a alumbrar
        System.out.println("Botón de " + tipo + " presionado y alumbrando.");
        realizarAccion();
    }
//metodo para liberar el boton, tambien cambia el estado a no presionado y desactiva el presionado.
    public void liberar() {
        presionado = false;
        alumbrando = false; // Deja de alumbrar al liberar
        System.out.println("Botón de " + tipo + " liberado y apagado.");
    }

    //get retorna presionado y se pone (is)por que es booleano 
    public boolean isPresionado() {
        return presionado;
    }

    //get retorna alumbrando y se pone (is)por que es booleano 
    public boolean isAlumbrando() {
        return alumbrando;
    }

    // Método abstracto para acciones específicas de las subclases
    public abstract void realizarAccion();
    
}
