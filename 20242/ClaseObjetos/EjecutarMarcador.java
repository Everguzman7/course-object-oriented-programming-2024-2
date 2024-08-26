package ClaseObjetos;
public class EjecutarMarcador {

    public static void main(String[] args) {
        //cración del objeto
        Marcador objMarcador1 = new Marcador("eddign", "rojo", 1.2, true);
        objMarcador1.rayar();

        System.out.println(objMarcador1.recargar(10.0));
    }
}