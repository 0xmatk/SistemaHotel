package Clases;


import java.util.*;
import Datos.Datos;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Sistema  {
    private Scanner teclado ;
    private List<Usuario> usuarios;
    private Hotel hotel;
    private JsonNode usuariosJSON;





    public Sistema(Hotel hotel) {
        this.teclado = new Scanner(System.in);
        this.hotel = hotel;
        this.usuarios= new LinkedList<>();
    }
///=====================================================================================================================
///<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<SWITCHS/ TAREAS A REALIZAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>







    public void actividadUsuario(Usuario usuario){
        if(usuario instanceof Administrador){
            Administrador adm= (Administrador) usuario;
           adm.adminSwitch(this.hotel);
        }else{
            if(usuario instanceof Empleado){
                Empleado emp= (Empleado) usuario;
               emp.empSwitch(this.hotel);
            }else{
                if(usuario instanceof Visitante){
                    Visitante visit= (Visitante) usuario;
                    visit.visitanteSwitch(this.hotel);
                }
            }
        }
    }

  public void iniciarSesion() {
        int flag = 0;
        Usuario aux = null;

        System.out.println("===========================================================================================================");
        System.out.println("====================================Bienvenido a nuestro sistema Hotelero================================");
        System.out.println("===========================================================================================================");

        while (flag == 0) {
            System.out.print("Ingrese su usuario: ");
            String usuario = this.teclado.next();
            System.out.print("Ingrese su contraseña: ");
            String clave = this.teclado.next();

            if (usuario.isEmpty() || clave.isEmpty()) {
                System.out.println("Por favor ingrese ambos parámetros.");
            } else {
                try {
                    Datos datos = new Datos();
                    // Cargar usuarios resumidos desde el archivo generado
                    List<ObjectNode> usuariosResumidos = datos.extraerUsuariosClaveTipo("usuarios.json", "Usuario");

                    // Comparar usuario y clave con los usuarios cargados
                    boolean encontrado = false;
                    for (ObjectNode usuarioResumido : usuariosResumidos) {
                        String usuarioRes = usuarioResumido.get("usuario").asText();
                        String claveRes = usuarioResumido.get("clave").asText();


                        if (usuario.equals(usuarioRes) && clave.equals(claveRes)) {
                            encontrado = true;
                            String tipoUsuario = usuarioResumido.get("tipo").asText();
                            System.out.println("Inicio de sesión exitoso para tipo: " + tipoUsuario);
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Usuario o contraseña incorrectos. Inténtelo nuevamente.");
                    } else {
                        flag = 1;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

///=====================================================================================================================




}
