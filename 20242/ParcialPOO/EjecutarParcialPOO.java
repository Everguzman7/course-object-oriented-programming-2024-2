public class EjecutarParcialPOO {
    public static void main(String[] args) {
    
        Clientee objcliente = new Clientee( "Ever", "1134576522");

        //Crear el pedido
        Pedido objpedido1 = new Pedido();

        //Crear productos
        Foto foto1 = new Foto("1144p");
        Impresion objimpresion1 = new Impresion("Foto impresa", 5000.0, foto1);
        Camara objcamara1 = new Camara("Camara nikon", 5000.0, 24);

        //agregamos productos al pedido
        objpedido1.agregarProducto(objimpresion1);
        objpedido1.agregarProducto(objcamara1);

        //agregar pedido al cliente
        objcliente.agregarPedido(objpedido1);

        //mostar detalles 
        objcliente.mostrarPedidos();
    }
}
