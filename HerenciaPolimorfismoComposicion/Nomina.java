public class Nomina {

    private Trabajador[] Trabajador;

    public Nomina(Trabajador[] Trabajador){
        this.Trabajador = Trabajador;

    }

    public void generarPagos(){
        for (int i = 0; i < Trabajador.length; i++){
            System.out.println(" Pago generado: " + Trabajador[i].pagar());
        }
    }
    
}
