public class EjecutarParcialPOO {
    public static void main(String[] args) {
    
        Clientee cliente = new Clientee( "Ever", "1134576522");

        //Crear el pedido
        Pedido pedido1 = new Pedido();

        //Crear productos
        Foto foto1 = new Foto("1144p");
        Impresion impresion1 = new Impresion("Foto impresa", 5000.0, foto1);
        Camara camara1 = new Camara("Camara nikon", 5000.0, 24);

        //agregamos productos al pedido
        pedido1.agregarProducto(impresion1);
        pedido1.agregarProducto(camara1);

        //agregar pedido al cliente
        cliente.agregarPedido(pedido1);

        //mostar detalles 
        cliente.mostrarPedidos();
    }
}
