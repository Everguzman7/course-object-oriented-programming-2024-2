//Clae foto tiene una relacion de composición con impresion.

public class Foto {
    private String resolucion;

    public Foto(String resolucion){
        this.resolucion = resolucion;
    }

    public void detalles(){
        System.out.println("Foto: Resolucion " + resolucion);
        
    }
    
}
