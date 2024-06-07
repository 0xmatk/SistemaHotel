package Interfaces;

import Clases.Estadia;
import Clases.Habitacion;
import Clases.Visitante;
import java.util.Date;

public interface IAdministrarEstadias {
    void crearEstadia(Visitante visitante, Habitacion habitacion, boolean checkIn, boolean checkOut, int costo);
    void editarEstadia(int ID);
    void listarEstadias();
    void buscarEstadia(int dni);
}
