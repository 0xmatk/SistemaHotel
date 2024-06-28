package Datos;

import Clases.*;
import Genericos.SetGenerico;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Datos {


    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void guardarHabitaciones(SetGenerico<Habitacion> habitaciones, String archivo) throws IOException {
        objectMapper.writeValue(new File(archivo), habitaciones);
    }

    public static SetGenerico<Habitacion> cargarHabitaciones(String archivo) throws IOException {
        File file = new File(archivo);
        if (file.exists()) {
            return objectMapper.readValue(file, new TypeReference<SetGenerico<Habitacion>>() {});
        } else {
            return new SetGenerico<>();
        }
    }

    public static void guardarEmpleados(SetGenerico<Empleado> empleados, String archivo) throws IOException {
        objectMapper.writeValue(new File(archivo), empleados);
    }

    public static SetGenerico<Empleado> cargarEmpleados(String archivo) throws IOException {
        File file = new File(archivo);
        if (file.exists()) {
            return objectMapper.readValue(file, new TypeReference<SetGenerico<Empleado>>() {});
        } else {
            return new SetGenerico<>();
        }
    }

    public static void guardarEstadias(SetGenerico<Estadia> estadias, String archivo) throws IOException {
        objectMapper.writeValue(new File(archivo), estadias);
    }

    public static SetGenerico<Estadia> cargarEstadias(String archivo) throws IOException {
        File file = new File(archivo);
        if (file.exists()) {
            return objectMapper.readValue(file, new TypeReference<SetGenerico<Estadia>>() {});
        } else {
            return new SetGenerico<>();
        }
    }

    public static void guardarReservas(SetGenerico<Reserva> reservas, String archivo) throws IOException {
        objectMapper.writeValue(new File(archivo), reservas);
    }

    public static SetGenerico<Reserva> cargarReservas(String archivo) throws IOException {
        File file = new File(archivo);
        if (file.exists()) {
            return objectMapper.readValue(file, new TypeReference<SetGenerico<Reserva>>() {});
        } else {
            return new SetGenerico<>();
        }
    }

    public static void guardarVisitantes(SetGenerico<Visitante> visitantes, String archivo) throws IOException {
        objectMapper.writeValue(new File(archivo), visitantes);
    }

    public static SetGenerico<Visitante> cargarVisitantes(String archivo) throws IOException {
        File file = new File(archivo);
        if (file.exists()) {
            return objectMapper.readValue(file, new TypeReference<SetGenerico<Visitante>>() {});
        } else {
            return new SetGenerico<>();
        }
    }

    public void crearUsuariosResumidos(String visitantesJsonFile, String empleadosJsonFile, String nuevoJsonFile) {
        try {
            List<ObjectNode> usuariosResumidos = new ArrayList<>();

            // Leer y procesar visitantes.json
            List<ObjectNode> visitantesResumidos = extraerUsuariosClaveTipo(visitantesJsonFile, "Visitante");
            usuariosResumidos.addAll(visitantesResumidos);

            // Leer y procesar empleados.json
            List<ObjectNode> empleadosResumidos = extraerUsuariosClaveTipo(empleadosJsonFile, "Empleado");
            usuariosResumidos.addAll(empleadosResumidos);

            // Escribir a nuevoJsonFile
            objectMapper.writeValue(new File(nuevoJsonFile), usuariosResumidos);

            System.out.println("Nuevo archivo JSON creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<ObjectNode> extraerUsuariosClaveTipo(String archivoJson, String tipoUsuario) throws IOException {
        byte[] contenidoBytes = Files.readAllBytes(Paths.get(archivoJson));
        JsonNode rootNode = objectMapper.readTree(contenidoBytes);

        List<ObjectNode> usuariosResumidos = new ArrayList<>();
        for (JsonNode usuarioNode : rootNode) {
            String usuario = usuarioNode.path("usuario").asText();
            String clave = usuarioNode.path("clave").asText();

            ObjectNode usuarioResumido = objectMapper.createObjectNode();
            usuarioResumido.put("usuario", usuario);
            usuarioResumido.put("clave", clave);
            usuarioResumido.put("tipo", tipoUsuario);

            usuariosResumidos.add(usuarioResumido);
        }

        return usuariosResumidos;
    }
}