package Clases;

import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Estadia extends Reserva implements Serializable {
    private boolean checkIn;
    private boolean checkOut;
    private int costo;
    private int ID;
    private static int contador  = 0;


    public Estadia(){
        super();
    }

    public Estadia(Visitante visitante, Habitacion habitacion, Date llegada, Date salida) {
        super(visitante, habitacion, llegada, salida);
        this.checkIn = false;
        this.checkOut = false;
        this.costo = 0;
        this.costo = calcularCosto();
        this.ID = contador;

    }


    public int calcularCosto(){
      int costoTotal = 0;

      long diferenciaMilisegundos = salida.getTime() - llegada.getTime();

      long diferenciaDias = TimeUnit.DAYS.convert(diferenciaMilisegundos, TimeUnit.MILLISECONDS);

        costoTotal = (int)diferenciaDias * habitacion.getCoste();

        return costoTotal;

    }
    ///===================================================================


    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Estadia.contador = contador;
    }

    @Override
    public int getID() {
        return ID;
    }



    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}



