package Clases;


import java.io.Serializable;
import Enum.EstadoHabitacion;
import Enum.TipoHabitacion;
import Genericos.SetGenerico;
import java.util.Date;


public class Habitacion implements Serializable {
    private TipoHabitacion tipo;
    private int numero;
    private int coste;
    private EstadoHabitacion estado;
    private Date fechaProxima;
    private Date fechaLejana;





    public Habitacion(){}

    public Habitacion(int coste, int numero) {
        this.tipo = TipoHabitacion.ESTANDAR;
        this.estado = EstadoHabitacion.DISPONIBLE;
        this.coste = coste;
        this.numero = numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }
   public Date getFechaProxima() {
        return fechaProxima;
   }
   public Date getFechaLejana() {
        return fechaLejana;
   }
   public void setFechaProxima(Date fechaProxima) {
        this.fechaProxima = fechaProxima;
   }

   public void setFechaLejana(Date fechaLejana) {
        this.fechaLejana = fechaLejana;
   }


    @Override
    public String toString() {
        return "Habitacion{" +
                "tipo='" + tipo + '\'' +
                ", numero=" + numero +
                ", coste=" + coste +
                ", estado=" + estado +
                '}';
    }
}
