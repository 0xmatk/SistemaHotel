import Clases.*;

import java.util.Date;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Sistema sistema = new Sistema();
      Habitacion habitacion = new Habitacion("tipo", true, 1, 1);
        Date llegada = new Date();
        Date salida = new Date();
        Date llegada2 = new Date();
        llegada2.setTime(20);


        Empleado empleado = new Empleado("Matias", "Klingeman", 1, hotel);
        Visitante visitante = new Visitante("Jose", "Perez", 1213, "Mar del Plata", "Calle123", true);
        Reserva reserva = new Reserva(visitante, habitacion, null, null);

        System.out.println(visitante);






    }

}