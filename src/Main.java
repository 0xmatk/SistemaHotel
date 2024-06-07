import Clases.*;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Habitacion habitacion = new Habitacion("tipo", true, 1, 1);
        Date llegada = new Date();
        Date salida = new Date();

        Reserva reserva = new Reserva(null, null, null, null);
        Empleado empleado = new Empleado("Matias", "Klingeman", 1, hotel);
        Visitante visitante = new Visitante("Jose", "Perez", 1213, "Mar del Plata", "Calle123", true);

        empleado.crearReserva(visitante, habitacion, llegada, salida, true);

        hotel.mostrarReservas();
       empleado.crearReserva(visitante, habitacion, llegada, salida, true);
        hotel.mostrarReservas();



    }

}