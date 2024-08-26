//ejercicio1

import java.util.Scanner;

public class Ejerc1 {

    int lado ;
    int areaCuadrado;
    Scanner scanner = new Scanner (System.in);

    public void calcularareayleernumero(){
        System.out.println("ingresar valor:");

        lado = scanner.nextInt();
        
        areaCuadrado = (lado * lado);

        System.out.println("el area del cuadrado es:" + areaCuadrado);
    }

    public static void main(String[] args) {
        Ejerc1 area = new Ejerc1();
        area.calcularareayleernumero();
    }
}