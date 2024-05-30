package Clases;

import java.util.Date;

public class Estadia {
    private Visitante visitante;
    private Habitacion habitacion;
    private Date checkIn;
    private Date checkOut;

    public Estadia(Visitante visitante, Date checkOut, Habitacion habitacion, Date checkIn) {
        this.visitante = visitante;
        this.checkOut = checkOut;
        this.habitacion = habitacion;
        this.checkIn = checkIn;
    }


    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Clases.Estadia{" +
                "visitante=" + visitante +
                ", habitacion=" + habitacion +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }
}
