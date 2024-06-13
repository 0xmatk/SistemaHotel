package Clases;

import java.util.Date;
import java.util.Objects;

public class Reserva {
    protected Visitante visitante;
    protected Habitacion habitacion;
    protected Date llegada;
    protected Date salida;
    protected boolean estado;
    private  int ID;
    private static int contador  = 0;

    public Reserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida) {
            this.visitante = visitante;
            this.habitacion = habitacion;
            this.llegada = llegada;
            this.salida = salida;
            this.estado = true;
            this.ID = contador++;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return llegada.equals(reserva.llegada) &&
                salida.equals(reserva.salida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(llegada, salida);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "visitante=" + visitante +
                ", habitacion=" + habitacion +
                ", llegada=" + llegada +
                ", salida=" + salida +
                ", estado=" + estado +
                ", ID=" + ID +
                '}';
    }
}
