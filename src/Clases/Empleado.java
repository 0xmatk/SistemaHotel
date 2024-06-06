package Clases;
import Interfaces.administrarReserva;

import java.util.Date;

public class Empleado extends Persona implements administrarReserva {
    private int nroLegajo;
    Hotel hotel;

    public Empleado(String nombre, String apellido, int nroLegajo) {
        super(nombre, apellido);
        this.nroLegajo = nroLegajo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }


    @Override
    public void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado) {
        if(visitante == null || habitacion == null || llegada == null || salida == null){
            System.out.println("Por favor, rellenar todos los datos. ");
        }
        Reserva reserva = new Reserva(visitante, habitacion, llegada, salida);
        try {
            hotel.agregarReserva(reserva);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void editarReserva(Reserva reserva) {

    }

    @Override
    public void listarReservas() {

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
