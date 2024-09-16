public class ReservaDeHotel {

    private String NombreDelCliente;
    private String FechaDeIngreso;
    private String FechaDeSalida;
    private int NumeroDeHabitacion;

    public ReservaDeHotel(String NombreDelCliente, String FechaDeIngreso, String FechaDeSalida,
            int NumeroDeHabitacion) {
        this.NombreDelCliente = NombreDelCliente;
        this.FechaDeIngreso = FechaDeIngreso;
        this.FechaDeSalida = FechaDeSalida;
        this.NumeroDeHabitacion = NumeroDeHabitacion;

    }

    public String reserva() {
        return "El cliente " + this.NombreDelCliente + " ha reservado la habitacion " + this.NumeroDeHabitacion
                + " desde el " + this.FechaDeIngreso + " hasta el " + this.FechaDeSalida;
    }
    public String CancelarReserva() {
        return "La reserva de la habitacion " + this.NumeroDeHabitacion + " ha sido cancelada";
    }
    public String ConsultarReserva() {
        return "El cliente " + this.NombreDelCliente + " ha reservado la habitacion " + this.NumeroDeHabitacion
                + " desde el " + this.FechaDeIngreso + " hasta el " + this.FechaDeSalida;
    }
    


}