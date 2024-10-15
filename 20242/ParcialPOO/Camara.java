//Clase camara que hereda de la clase producto

public class Camara extends Producto {

    private int megapixeles;

    public Camara(String nombre, double precio, int megapixeles){
        super(nombre, precio);
        this.megapixeles = megapixeles;
    }

    @Override
    public void detalles() {
        System.out.println("Camara: " + nombre + " Precio " + precio + " Megapixeles " + megapixeles);
        
    }

    
    
}
