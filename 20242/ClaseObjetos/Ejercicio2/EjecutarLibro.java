public class EjecutarLibro {
    public static void main(String[] args) {

        Libro objLibro1 = new Libro(" Fisica 1 ", " javier ", 2, 295, true);
        Libro objLibro2 = new Libro(" Ingles 3 ", " libardo ", 4, 250, false);
        Libro objLibro3 = new Libro(" Calculo 2 ", " castro ", 6, 327, true);
        Libro objLibro4 = new Libro(" POO 3 ", " cano ", 8, 149, false);
        Libro objLibro5 = new Libro(" humanidades 1 ", " marta ", 10, 444, false);

        objLibro1.prestar(objLibro1);
        objLibro1.prestar(objLibro1);

        objLibro3.devolver(objLibro3);
        objLibro3.devolver(objLibro3);

        objLibro2.estaDisponible(objLibro2);
        objLibro2.estaDisponible(objLibro2);

    }
}
