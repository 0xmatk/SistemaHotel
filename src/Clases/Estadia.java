package Clases;

import java.util.Date;

public class Estadia extends Reserva{
    private boolean checkIn;
    private boolean checkOut;


    public Estadia(Visitante visitante, Habitacion habitacion, Date llegada, Date salida) {
        super(visitante, habitacion, llegada, salida);

    }
}
