package ClaseObjetos;
public class Marcador {

    //Atributos de la clase 
    private String nombre;
    private String color;
    private double diametro;
    private boolean esBorrable;

    //constructor de la clase
    public Marcador(String nombre, String color, double diametro, boolean esBorrable){
        this.nombre = nombre;
        this.color = color;
        this.diametro = diametro;
        this.esBorrable = esBorrable;
    }

    //métodos de la clase 
    /*
     * Firma del metodo
     * público
     * el nombre del metodo es "rayar"
     * no retorna valores
     * no iene parametros o argumentos
     */
    public void rayar(){
        System.out.println("marcador rayando...");
    }

    //métodos de la clase 
    /*
     * Firma del metodo
     * público
     * el nombre del metodo es "recargar"
     * retorna un valor tipo String
     * rcibe 1 parametro o argumento de tipo real (double)
     */

     public String recargar(double cantidad){
        return "El marcador se recargo con:" + cantidad + "ml";
     }

     public String toString(){
        return "{Marcador : nombre:" + nombre + "color:" + color + "diametro:" + diametro + "esBorrable:" + esBorrable + "}";
     }
}