public class EjecutarCuentaBancaria {

    public static void main(String[] args) {
        CuentaBancaria objCuenta1 = new CuentaBancaria(12345, 0.0, "Ever");
        System.out.println(objCuenta1);
        System.out.println(objCuenta1.depositar(100));
        System.out.println(objCuenta1);
        System.out.println(objCuenta1.retirar(50.0));
        System.out.println(objCuenta1);
        System.out.println(objCuenta1.consultarSaldo());
        
    }




}