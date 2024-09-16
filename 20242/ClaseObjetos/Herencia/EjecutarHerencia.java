public class EjecutarHerencia {

    public static void main(String[] args) {
        
        //creaccion de los objetos 
        Trabajador objT1 = new Vendedor( 1, "cristiano", "Textiles", 20.0 );
        Trabajador objT2 = new Vendedor( 2, "messi", "Electrodomesticos", 10.0 );


        Trabajador objT3 = new Operario( 3, "Byron", "Dulceria", 200.0 );
        Trabajador objT4 = new Operario( 4, "Harvin", "Comestible", 300 );

        System.out.println("salario Vendedor:" + objT1.salario());
        System.out.println("salario Vendedor:" + objT2.salario());

        System.out.println("salario Operario:" + objT3.salario());
        System.out.println("salario Operario:" + objT4.salario());

        System.out.println(objT1 instanceof Vendedor);
        System.out.println(objT1 instanceof Trabajador);

        Trabajador[] t = new Trabajador[4];
        t[0] = objT1;
        t[1] = objT3;
        t[2] = objT2;
        t[3] = objT4;

        for (int i = 0; i < t.length; i++){
            System.out.println(t[i].getArea() + " - " + t[i].getNombre() + " " + t[i].salario());
        }






    }
}