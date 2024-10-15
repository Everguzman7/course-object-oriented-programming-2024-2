//Clase abstracta Producto
abstract class Producto {
    //Atributos de la clase 
    protected String nombre;
    protected double precio;

    //Constructor de la clase 
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;

    }

    //Metodo abstracto para implementar el polimorfismo
    public abstract void detalles();

    
}
