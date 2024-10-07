public class Operario extends Trabajador {
    //Atributos
    private final double VALOR_HORA = 10000.0;//Constante
    private double horasTrabajadas;

    //Constructor
    public Operario(double horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;

    }

    public double pagar(){
        return horasTrabajadas * VALOR_HORA;
    }

    
}
