public class EjecutraComposicionAgregacion {

    public static void main(String[] args) {
        
        Cliente objCliente1 = new Cliente(1144074092, "Ever", "Rodriguez");
        
        Cuenta objCuenta1 = new Cuenta("702346", "ahorros", 0.0);

        Banco objBanco1 = new Banco("90247911", "Banco UCC", objCuenta1);

    }
    
}
