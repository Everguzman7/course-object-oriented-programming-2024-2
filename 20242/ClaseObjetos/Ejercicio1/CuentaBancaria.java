//ejerciciocuentabancaria

import java.util.Scanner;

public class CuentaBancaria {

    //atributos de la clase 

    private int numeroCuenta;
    private double saldo;
    private String titular;

    //constructor de la clase
    public CuentaBancaria(int numeroCuenta, double saldo, String titular){

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;

    }

    //metodos de clase
    public String depositar(double cantidad){
        saldo = saldo + cantidad;
        return " Cuanto desea depositar: " + cantidad + " y el saldo es:" + saldo;
    }

    

    public String retirar(double cantidad){
        saldo = saldo - cantidad ;
        return " Cantidad a retirar : " + cantidad + " Su nuevo saldo es: " + saldo;

    }

    public String consultarSaldo(){
        return " Su saldo actual es: " + saldo;
    }

    public String toString(){
        return "{CuentaBancaria : numeroCuenta:" + numeroCuenta + " saldo: " + saldo + " titular: " + titular + "}";
    } 





}