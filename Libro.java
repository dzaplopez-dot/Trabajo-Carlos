public class Libro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean prestado;


    public Libro (String titulo, String autor, int numeroPaginas, boolean prestado){

        this.titulo= titulo;
        this. autor= autor;
        this. numeroPaginas = numeroPaginas;
        this.prestado= prestado;

        }
        public void mostrarDatos(){
            System.out.println("El titulo del libro es: " + titulo);
            System.out.println("El autor del libro es: " + autor);
            System.out.println("El numero de paginas que tiene el libro es: " + numeroPaginas);
            System.out.println("El libro se encuentra en prestamo" + prestado);
             }
        

    }
    
}
