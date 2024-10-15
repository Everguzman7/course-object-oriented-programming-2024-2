//La clase impresión heredade de la clase producto y tiene una relacion de composion con foto.

public class Impresion extends Producto {
    private Foto foto;

    public Impresion(String nombre, double precio, Foto foto){
        super(nombre, precio);
        this.foto = foto;
    }

    @Override
    public void detalles() {
        System.out.println("Impresion: " + nombre + " Precio: " + precio);
        foto.detalles();
        
    }


    
}
