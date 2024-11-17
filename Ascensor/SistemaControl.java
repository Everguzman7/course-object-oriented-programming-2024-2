package Ascensor;
import java.util.*;
//gestiona el funcionamiento del ascensor y los pisos 
//se da la relacion de agregacion con la clase piso ya que contiene la lista de pisos pero estos pueden existir independientemente del sistemas 
public class SistemaControl {
    private Ascensor ascensor;
    private List<Piso> pisos;

    public SistemaControl(int numeroDePisos) {
        this.ascensor = new Ascensor();
        this.pisos = new ArrayList<>();
        for (int i = 0; i < numeroDePisos; i++) {
            pisos.add(new Piso(i));
        }
    }

    public void recibirSolicitud(int piso, String direccion) {
        pisos.get(piso).solicitarAscensor(direccion);
        gestionarMovimiento(piso);
    }

    private void gestionarMovimiento(int pisoDestino) {
        int pisoActual = ascensor.getPisoActual();
        if (pisoDestino > pisoActual) {
            ascensor.cambiarDireccion("subiendo");
        } else if (pisoDestino < pisoActual) {
            ascensor.cambiarDireccion("bajando");
        }
        ascensor.moverA(pisoDestino);
    }

    public void alertaFalla(String tipoFalla) {
        System.out.println("Alerta: Falla en el sistema - " + tipoFalla);
    }
}
