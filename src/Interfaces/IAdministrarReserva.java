package Interfaces;
import Clases.*;

import java.util.Date;

public interface IAdministrarReserva {


    void crearReserva(Hotel hotel);
    void editarReserva(int id);
    void listarReservas();
    void buscarReserva(int id);




}
