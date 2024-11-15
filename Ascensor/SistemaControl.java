package Ascensor;
import java.util.*;

public class SistemaControl {
    private Ascensor ascensor;
	private List<Piso> pisos;

	public SistemaControl(int numeroDePisos) {

		this.ascensor = new Ascensor();
		this.pisos = new ArrayList<>();

		for (int i = 0; i < numeroDePisos; i++) {
			boolean tieneSubida = i < numeroDePisos - 1; // Último piso no necesita botón de subida
			boolean tieneBajada = i > 0; // Primer piso no necesita botón de bajada
			pisos.add(new Piso(i, tieneSubida, tieneBajada));
		}
	}

	public void recibirSolicitud(int piso, String direccion) {
		pisos.get(piso).solicitarAscensor(direccion);
		gestionarMovimiento(piso);
		liberarBoton(piso, direccion);
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

	private void liberarBoton(int piso, String direccion) {
		if (direccion.equals("subida")) {
			pisos.get(piso).getBotonSubida().liberar();
		} else if (direccion.equals("bajada")) {
			pisos.get(piso).getBotonBajada().liberar();
		}
	}

	public void alertaFalla(String tipoFalla) {
		System.out.println("Alerta: posible falla detectada en " + tipoFalla);
	}
}
