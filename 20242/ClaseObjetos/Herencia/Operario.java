public class Operario extends Trabajador{

    public final double VALOR_HORA = 12000.0;
    private double horas;

    public Operario(int id, String nombre, String area, double horas){
        super(ide, nombre, area);
        this.horas = horas;
    }

    public  double gethoras(){
        return horas;
    }

    public double salario(){
        return VALOR_HORA * horas;
    }

    
}