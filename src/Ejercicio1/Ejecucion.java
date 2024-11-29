/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author saidm
 */
public class Ejecucion {
    public static void main(String[] args) {
        Libro libro = new Libro("George Orwell", "1984", 1949);
        GenerarReporte reporte = new GenerarReporte();
        
        reporte.imprimirLibro(libro);
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        
        Persistencia guardar = new Persistencia();
        guardar.guardar(libro);
    }
}
