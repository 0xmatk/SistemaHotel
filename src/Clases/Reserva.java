package Clases;

import java.util.Date;

public class Reserva {
    protected Visitante visitante;
    protected Habitacion habitacion;
    protected Date llegada;
    protected Date salida;

    public Reserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida) {
            this.visitante = visitante;
            this.habitacion = habitacion;
            this.llegada = llegada;
            this.salida = salida;
    }


    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public Date getLlegada() {
        return llegada;
    }

    public void setLlegada(Date llegada) {
        this.llegada = llegada;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "visitante=" + visitante +
                ", habitacion=" + habitacion +
                ", llegada=" + llegada +
                ", salida=" + salida +
                '}';
    }
}
