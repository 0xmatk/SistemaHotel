package Interfaces;
import Clases.*;

import java.util.Date;

public interface administrarReserva {


    void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado);
    void editarReserva(Reserva reserva);
    void listarReservas();

}
