package Clases;
import Interfaces.administrarReserva;

import java.util.Date;

public class Empleado extends Persona implements administrarReserva {
    private int nroLegajo;

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
    public void crearReserva(int dni, Habitacion habitacion, Date llegada, Date salida, boolean estado) {

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
