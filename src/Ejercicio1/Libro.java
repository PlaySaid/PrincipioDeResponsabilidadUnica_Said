package Ejercicio1;

public class Libro {
    
    private String autor;
    private String titulo;
    private int añoPubli;
    
    public Libro(String autor, String titulo, int añoPubli) {
        this.autor = autor;
        this.titulo = titulo;
        this.añoPubli = añoPubli;
    }
    
    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAñoPubli(){
        return añoPubli;
    }
}
