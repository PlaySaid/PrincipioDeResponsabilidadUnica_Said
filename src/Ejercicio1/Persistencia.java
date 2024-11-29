/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Persistencia {
    public void guardar(Libro libro) {
        System.out.println("Guardar en archivo...");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de Publicación: " + libro.getAñoPubli());
        System.out.println("El libro ha sido guardado.");
    }
}
