package ClaseObjetos.Ejercicios;
public class AreaCirculo {
    public static void main(String[] args) {
        double radio = 5.0; // Puedes cambiar este valor según el radio deseado
        double area = calcularAreaCirculo(radio);
        System.out.println("El área del círculo es: " + area);
    }

    public static double calcularAreaCirculo(double radio) {
        double pi = Math.PI;
        return pi * Math.pow(radio, 2);
        

    }
}    