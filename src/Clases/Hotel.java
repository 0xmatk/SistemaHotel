package Clases;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Hotel {
    private Set<Habitacion> habitaciones;
    private Set<Empleado> empleados;
    private Set<Estadia> estadias;
    private Set<Reserva> reservas;

    public Hotel(List<Habitacion> habitaciones, List<Reserva> reservas, List<Estadia> estadias, List<Empleado> empleados) {
        this.habitaciones = new LinkedHashSet<>(habitaciones);
        this.reservas = new LinkedHashSet<>(reservas);
        this.estadias = new LinkedHashSet<>(estadias);
        this.empleados = new LinkedHashSet<>(empleados);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void agregarEstadia(Estadia estadia) {
        reservas.add(estadia);
    }

}
