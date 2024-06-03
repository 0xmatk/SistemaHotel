package Clases;

import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Estadia extends Reserva{
    private boolean checkIn;
    private boolean checkOut;
    private int costo;


    public Estadia(Visitante visitante, Habitacion habitacion, Date llegada, Date salida) {
        super(visitante, habitacion, llegada, salida);
        this.costo = calcularCosto();

    }

    public int calcularCosto(){
      int costoTotal = 0;

      long diferenciaMilisegundos = salida.getTime() - llegada.getTime();

      long diferenciaDias = TimeUnit.DAYS.convert(diferenciaMilisegundos, TimeUnit.MILLISECONDS);

        costoTotal = (int)diferenciaDias * habitacion.getCoste();

        return costoTotal;

    }
}
