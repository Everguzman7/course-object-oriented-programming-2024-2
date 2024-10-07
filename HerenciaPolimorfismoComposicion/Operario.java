public class Operario extends Trabajador {
    //Atributos
    private final double VALOR_HORA = 10000.0;//Constante
    private int horasTrabajadas;

    //Constructor
    public Operario(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;

    }

    public double pagar(){
        return horasTrabajadas * VALOR_HORA;
    }

    
}
