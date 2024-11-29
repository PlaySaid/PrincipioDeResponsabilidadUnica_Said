package Ejercicio1;

public class GenerarReporte {
    
    public void imprimirLibro(Libro libro){
        
        System.out.println("El autor del libro es: "+libro.getAutor());
        System.out.println("El titulo del libro es: "+libro.getTitulo());
        System.out.println("El año de publicacion del libro es: "+libro.getAñoPubli());
    }
}
