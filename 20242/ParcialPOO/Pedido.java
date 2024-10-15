//Clase pedido tiene una  relacion de (composicion) con producto
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Producto> productos;

    public Pedido(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void mostrarProductos(){
        System.out.println("Los productos del pedido son:");
        for (Producto producto : productos){
            producto.detalles();
        }
    }


    
}
