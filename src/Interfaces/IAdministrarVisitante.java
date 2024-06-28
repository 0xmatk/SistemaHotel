package Interfaces;

import Clases.Hotel;
import Clases.Visitante;
import Excepciones.VisitanteNoEncontradoExcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface IAdministrarVisitante {

    default void darAlta(Hotel hotel, Visitante visitante) {
        Visitante v = hotel.buscarVisitante(visitante.getDni());

        if (v == null) {
            hotel.getVisitantes().add(visitante);
            System.out.println("Visitante dado de alta correctamente.");
        } else {
            System.out.println("El visitante no existe en el hotel.");
        }
    }

    default void darBaja(Hotel hotel, int dni) {
        Visitante v = hotel.buscarVisitante(dni);
        if (v != null) {
            v.setEstado(false);
            System.out.println("Visitante dado de baja correctamente.");
        } else {
            System.out.println("No se encontró al visitante con DNI: " + dni);
        }
    }


    default Visitante crearVisitante(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de nuevo visitante:");

        try {

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Clave: ");
            String clave = scanner.nextLine();

            System.out.print("DNI: ");
            int dni = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Domicilio de origen: ");
            String domicilioOrigen = scanner.nextLine();

            System.out.print("Origen: ");
            String origen = scanner.nextLine();


            Visitante v = hotel.buscarVisitante(dni);
            if (v == null) {
                if (nombre != null && !nombre.isEmpty() && apellido != null && !apellido.isEmpty()
                        && origen != null && !origen.isEmpty() && domicilioOrigen != null && !domicilioOrigen.isEmpty()) {
                    Visitante nuevoVisitante = new Visitante(nombre, apellido, usuario, clave, dni, domicilioOrigen, origen);
                    return nuevoVisitante;
                } else {
                    throw new IllegalArgumentException("Datos.Datos incompletos para crear el visitante.");
                }
            } else {
                throw new VisitanteNoEncontradoExcepcion("No se puede crear el visitante. Ya existe.");
            }

        } catch (InputMismatchException | VisitanteNoEncontradoExcepcion e) {
            System.out.println("Error: Debes ingresar un valor válido para el DNI.");
            scanner.nextLine();
        }finally {
            scanner.close();
        }

        return null;
    }

    public default void mostrarVisitantes(Hotel hotel){
        for(Visitante v : hotel.getVisitantes()){
            System.out.println(v);
        }
    }
}
