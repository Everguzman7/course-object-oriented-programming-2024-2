public class EjecutraComposicionAgregacion {

    public static void main(String[] args) {
        
        Cliente objCliente1 = new Cliente(1144074092, "Ever", "Rodriguez");
        
        Cuenta objCuenta1 = new Cuenta("702346", "ahorros", 0.0);

        Banco objBanco1 = new Banco("90247911", "Banco UCC", objCuenta1);

        System.out.println(objBanco1);

        System.out.println(objBanco1.esCliente(objCliente1));

        //System.out.println(objCuenta1.consignarMsg(objCuenta1.getNroCuenta(), 150000.0));

        System.out.println("Transaccion:" + objCuenta1.consignar(objCuenta1.getNroCuenta(), 150000.0));

        System.out.println(objCuenta1);



    }
    
}
