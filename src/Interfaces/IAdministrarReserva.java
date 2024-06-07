package Interfaces;
import Clases.*;

import java.util.Date;

public interface IAdministrarReserva {


    void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado);
    void editarReserva(Reserva reserva);
    void listarReservas();
    void buscarReserva(int dni);

}