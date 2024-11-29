package Ejercicio3;

public class Autenticacion {
    public boolean autenticarUsuario(Usuario usuario, String contraseña) {
        return usuario.getNombre().equals("Jose") && usuario.getContraseña().equals(contraseña);
    }
}
