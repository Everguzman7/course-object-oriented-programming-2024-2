//ejercicio 4

import java.util.Scanner;

public class Ejer {

     int salariobruto;
     int deducciones;
     int comision;
     int salarioNeto;
     Scanner scanner = new Scanner (System.in);

     public void  leernumeroYcalcularsalrio(){

        System.out.println("ingrese valores:");
      
        salariobruto=scanner.nextInt();
        deducciones=scanner.nextInt();
        comision=scanner.nextInt();
          
        salarioNeto=(salariobruto-deducciones)+ comision;
         
        System.out.println("el salario neto de empleado es:"+ salarioNeto);



     }

     public static void main(String[] args) {
       Ejer area = new Ejer();
       area.leernumeroYcalcularsalrio();
     }

}