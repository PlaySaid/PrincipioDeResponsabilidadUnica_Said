package Ejercicio2;

public class Ejecucion {

    public static void main(String[] args) {
        
        Producto producto = new Producto(24178234, "Camiseta", 30000.0);
        
        Etiqueta etiqueta = new Etiqueta();
        
        System.out.println(etiqueta.generarEtiqueta(producto));
        
        CalculadoraPrecios calculadora = new CalculadoraPrecios();
        double precioConImpuesto = calculadora.calcularPrecioImpuesto(producto, 0.19);
        System.out.println("Con el impuesto del 19% el precio del producto seria "+precioConImpuesto);
    }
}
