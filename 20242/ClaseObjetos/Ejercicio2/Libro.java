public class Libro {

    //atributos de la clase

    private String titulo;
    private String autor;
    private int isbn;
    private int numeroPaginas;
    private boolean disponible;

    //constructor de la clase

    public Libro(String titulo , String autor , int isbn , int numeroPaginas, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.disponible = disponible;

    }

    public void prestar(Libro objLibro){
        if(objLibro.disponible == true){
            objLibro.disponible = false;
            System.out.println( "Prestamo exitoso ");
        }else{
            System.out.println(" El libro no esta disponible ");
        }
    }

    public void devolver()




    
}
