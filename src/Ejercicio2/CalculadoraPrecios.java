package Ejercicio2;

public class CalculadoraPrecios {
    public double calcularPrecioImpuesto(Producto producto, double impuesto){
        return producto.getPrecio() + (producto.getPrecio() * impuesto);
    }
}
