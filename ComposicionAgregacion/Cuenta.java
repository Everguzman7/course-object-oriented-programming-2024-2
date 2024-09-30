public class Cuenta {

    private String nroCuenta;
    private String tipoCuenta;
    private double saldo;
    
    public Cuenta(String nroCuenta, String tipoCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [nroCuenta=" + nroCuenta + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + "]";
    }

    public String consignarMsg(String nroCuenta, double monto){
        String msg = "";
        if (nroCuenta.equals("702346")){
            saldo += monto;
            msg = "Transacion exitosa...saldo actual = "+ saldo;
        }else{
            msg = "error en la transaccion";
        }

        return msg;
    }

    public boolean consignar(String nroCuenta, double monto){
        boolean flag = false;
        if (nroCuenta.equals("702346")){
            saldo += monto;
            flag = true;
      

        
        }
        return flag;
   }
}
