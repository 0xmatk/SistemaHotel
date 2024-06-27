package Interfaces;

import Clases.Estadia;
import Clases.Habitacion;
import Clases.Hotel;
import Clases.Visitante;
import java.util.Date;

public interface IAdministrarEstadia {
    void crearEstadia(Hotel hotel);
    void editarEstadia(Hotel hotel, int id);
    void listarEstadias(Hotel hotel);
    void buscarEstadia(Hotel hotel, int id);


}
