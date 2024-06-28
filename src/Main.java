import Clases.*;
import Genericos.SetGenerico;
import java.io.IOException;
import Datos.*;

public class Main {
    private static final String ARCHIVO_HABITACIONES = "habitaciones.json";
    private static final String ARCHIVO_EMPLEADOS = "empleados.json";
    private static final String ARCHIVO_ESTADIAS = "estadias.json";
    private static final String ARCHIVO_RESERVAS = "reservas.json";
    private static final String ARCHIVO_VISITANTES = "visitantes.json";

    public static void main(String[] args) {
        Datos datos = new Datos();
        try {

            System.out.println("Cargando datos desde archivos JSON...");
            SetGenerico<Habitacion> habitaciones = Datos.cargarHabitaciones(ARCHIVO_HABITACIONES);
            SetGenerico<Empleado> empleados = Datos.cargarEmpleados(ARCHIVO_EMPLEADOS);
            SetGenerico<Estadia> estadias = Datos.cargarEstadias(ARCHIVO_ESTADIAS);
            SetGenerico<Reserva> reservas = Datos.cargarReservas(ARCHIVO_RESERVAS);
            SetGenerico<Visitante> visitantes = Datos.cargarVisitantes(ARCHIVO_VISITANTES);



            System.out.println("Datos.Datos cargados correctamente:");
            System.out.println("Empleados: " + empleados);
            System.out.println("Habitaciones: " + habitaciones);



            Hotel hotel = new Hotel(habitaciones, reservas, estadias, empleados, visitantes);
            Sistema sistema = new Sistema(hotel);
            sistema.iniciarSesion();


            System.out.println("Datos.Datos después de realizar cambios:");
            System.out.println("Empleados: " + empleados);
            System.out.println("Habitaciones: " + habitaciones);



            System.out.println("Guardando datos actualizados en archivos JSON...");
            Datos.guardarHabitaciones(habitaciones, ARCHIVO_HABITACIONES);
            Datos.guardarEmpleados(empleados, ARCHIVO_EMPLEADOS);
            Datos.guardarEstadias(estadias, ARCHIVO_ESTADIAS);
            Datos.guardarReservas(reservas, ARCHIVO_RESERVAS);
            Datos.guardarVisitantes(visitantes, ARCHIVO_VISITANTES);

            System.out.println("Datos.Datos guardados correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
