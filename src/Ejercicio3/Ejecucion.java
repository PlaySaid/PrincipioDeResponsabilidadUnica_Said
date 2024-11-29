package Ejercicio3;

public class Ejecucion {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Jose", "chipi");
        
        Autenticacion autenticacion = new Autenticacion();

        if (autenticacion.autenticarUsuario(usuario, "chipi")) {
            System.out.println("Autenticacion exitosa.");
        } else {
            System.out.println("Autenticacion fallida.");
        }
        
    }
}
