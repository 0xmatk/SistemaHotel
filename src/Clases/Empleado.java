package Clases;
import Interfaces.IAdministrarReserva;

import java.util.Date;

public class Empleado extends Persona implements IAdministrarReserva {
    private int nroLegajo;
    Hotel hotel;

    public Empleado(String nombre, String apellido, int nroLegajo, Hotel hotel) {
        super(nombre, apellido);
        this.nroLegajo = nroLegajo;
        this.hotel = hotel;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }


    @Override
    public void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado) {
        if (visitante == null || habitacion == null || llegada == null || salida == null) {
            System.out.println("Por favor, rellenar todos los datos. ");
        } else {
            Reserva reserva = new Reserva(visitante, habitacion, llegada, salida);

            hotel.agregarReserva(reserva);

        }
    }
    @Override
    public void editarReserva(int id) {
        Reserva reserva = hotel.encontrarReserva(id);

    }

    @Override
    public void listarReservas() {

    }

    @Override
    public void buscarReserva(int dni) {

    }


    @Override
    public String toString() {
        return "Clases.Empleado{" +
                "nroLegajo=" + nroLegajo +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                "} " + super.toString(); //test
    }



}
