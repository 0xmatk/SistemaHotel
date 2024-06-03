package Interfaces;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public interface autentificacionUsuario {
    boolean iniciarSesion(String nombreUsuario, String contrasena);
    void cerrarSesion();

    static String RUTA_JSON = "usuarios.json";

    default boolean verificarCredenciales(String nombreUsuario, String contrasena) {

        return false; // FALTA CREAR LOGICA
    }
}
