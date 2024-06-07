package Interfaces;


public interface IAutentificacionUsuario {
    boolean iniciarSesion(String nombreUsuario, String contrasena);
    void cerrarSesion();

    static String RUTA_JSON = "usuarios.json";

    default boolean verificarCredenciales(String nombreUsuario, String contrasena) {

        return false; // FALTA CREAR LOGICA
    }
}
