package Interfaces;
import Clases.*;

import java.util.Date;

public interface IAdministrarReserva {


    void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado);
    void editarReserva(int id);
    void listarReservas();
    void buscarReserva(int id);

}
