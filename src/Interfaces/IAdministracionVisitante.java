package Interfaces;

import Clases.Hotel;
import Clases.Visitante;

public interface IAdministracionVisitante {

    default void darAlta(Hotel hotel, Visitante visitante){
        hotel.agregarVisitante(visitante);

    }

    default void darBaja(Hotel hotel, int dni){
        Visitante v = hotel.buscarVisitante(dni);
        if(v != null){
            hotel.eliminarVisitante(v);
        }
    }

    default void crearVisitante(Hotel hotel, String nombre, String apellido, String origen, String domicilioOrigen, int dni) {
        Visitante v = hotel.buscarVisitante(dni);

        if(v == null) {
            if(nombre != null && apellido != null && origen != null && domicilioOrigen != null) {
                Visitante nuevoVisitante = new Visitante(nombre, apellido, dni, origen, domicilioOrigen);
            }
        }
    }

}
