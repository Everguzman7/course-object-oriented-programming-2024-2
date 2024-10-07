public class EjecutarTrabajador {

    public static void main(String[] args) {
        
        //Creacion de los objetos 

        Trabajador obj1 = new Consultor(0.25, 300000.0);
        Trabajador obj2 = new Operario(192);
        Trabajador obj3 = new Analista(1300000.0);

        Trabajador [] t = new Trabajador[3];

        t[0] = obj1;
        t[1] = obj2;
        t[2] = obj3;

        Nomina objNomina1 = new Nomina(t);

        objNomina1.generarPagos();
    }
    
}
