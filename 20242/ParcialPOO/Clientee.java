import java.util.ArrayList;
import java.util.List;

//Clase cliente tiene una relacion de (Agregacion con pedido)
public class Clientee {
//Atrubutos de la clase 
    private String nombre;
    private String cedula;
    private List<Pedido> pedidos;

//metodo constructor
    public Clientee(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
        this.pedidos = new ArrayList<>();

    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void mostrarPedidos(){
        System.out.println("Pedidos del cliente:" + nombre + "(cedula: " + cedula + "):");
        for (Pedido pedido : pedidos){
            pedido.mostrarProductos();
        }
    }

    
}
