import java.util.Scanner;

public class Ejecutos {
    public static void main(String[] args) {
        ReservaDeHotel objres1 = new ReservaDeHotel("Juan", "12/12/2021", "15/12/2021", 101);
        ReservaDeHotel objres2 = new ReservaDeHotel("Pedro", "12/12/2021", "15/12/2021", 102);
        ReservaDeHotel objres3 = new ReservaDeHotel("Maria", "12/12/2021", "15/12/2021", 103);
        ReservaDeHotel objres4 = new ReservaDeHotel("Jose", "12/12/2021", "15/12/2021", 104);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("1. Reservar habitacion");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Consultar reserva");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el numero de la habitacion que desea reservar");
                    int NumDeHabitacion = sn.nextInt();
                    switch (NumDeHabitacion) {
                        case 101:
                            System.out.println(objres1.reserva());
                            break;
                        case 102:
                            System.out.println(objres2.reserva());
                            break;
                        case 103:
                            System.out.println(objres3.reserva());
                            break;
                        case 104:
                            System.out.println(objres4.reserva());
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                    break;

                case 2:
                    System.out.println("ingrese el numero de la habitacion que desea cancelar la reserva");
                    int NumDeHabitacion2 = sn.nextInt();
                    switch (NumDeHabitacion2) {
                        case 101:
                            System.out.println(objres1.CancelarReserva());
                            break;
                        case 102:
                            System.out.println(objres2.CancelarReserva());
                            break;
                        case 103:
                            System.out.println(objres3.CancelarReserva());
                            break;
                        case 104:
                            System.out.println(objres4.CancelarReserva());
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");

                    }
                    break;
                case 3:
                    System.out.println("ingrese el numero de la habitacion que desea consultar");
                    int NumDeHabitacion3 = sn.nextInt();
                    switch (NumDeHabitacion3) {
                        case 101:
                            System.out.println(objres1.ConsultarReserva());
                            break;
                        case 102:
                            System.out.println(objres2.ConsultarReserva());
                            break;
                        case 103:
                            System.out.println(objres3.ConsultarReserva());
                            break;
                        case 104:
                            System.out.println(objres4.ConsultarReserva());
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 4");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
                    break;

            }
        }
        sn.close();
    }

}