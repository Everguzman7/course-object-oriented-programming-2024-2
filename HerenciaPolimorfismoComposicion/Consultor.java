public class Consultor extends Trabajador{

    //Atributos
    private double basico;
    private double comision;

    //Constructor
    public Consultor(double basico, double comision){
        this.basico = basico;
        this.comision = comision;
    }

    public double pagar(){
        return basico + comision;
    }


    
}
