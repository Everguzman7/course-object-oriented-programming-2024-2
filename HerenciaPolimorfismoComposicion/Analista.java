public class Analista extends Trabajador {
    //Atributos
    private double sueldoIntegral;

    //Constructor
    public Analista(double sueldoIntegral){
        this.sueldoIntegral = sueldoIntegral;
    }
    
    public double pagar(){
        return sueldoIntegral;

    }
}
