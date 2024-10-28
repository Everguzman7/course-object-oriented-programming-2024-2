import java.util.Scanner;

public class EjecutarJuegoLucha {

    // Metodo principal que ejecuta el juego
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("introduce el nombre del jugador 1");
        String nombre1 = Leer.nextLine();

        System.out.println("introduce el nombre del jugador 2");
        String nombre2 = Leer.nextLine();

        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();

        Leer.close();

    }

}
