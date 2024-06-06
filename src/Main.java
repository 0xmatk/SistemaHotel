import Clases.Habitacion;
import Clases.Hotel;
import Clases.Reserva;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Habitacion habitacion = new Habitacion("tipo", true, 1, 1);

        Reserva reserva = new Reserva(null, habitacion, null, null);
        hotel.agregarReserva(reserva);



  }

}