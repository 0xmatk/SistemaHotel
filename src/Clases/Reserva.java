package Clases;

import java.util.Date;

public class Reserva {
    private Visitante visitante;
    private Habitacion habitacion;
    private Date llegada;
    private Date salida;

    public Reserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida) {
        this.visitante = visitante;
        this.habitacion = habitacion;
        this.llegada = llegada;
        this.salida = salida;
    }


}
