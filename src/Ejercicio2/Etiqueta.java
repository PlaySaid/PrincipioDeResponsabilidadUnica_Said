package Ejercicio2;

public class Etiqueta {
    
    public String generarEtiqueta(Producto producto){
        return "ID: "+producto.getId()+"\nNombre: "+producto.getNombre()+"\nPrecio: "+producto.getPrecio();
    }
}
