package Clases;


import java.io.Serializable;
import Enum.EstadoHabitacion;


public class Habitacion implements Serializable {
    private String tipo;
    private int numero;
    private int coste;
    private EstadoHabitacion estado;



    public Habitacion(){}

    public Habitacion(String tipo,int coste, int numero) {
        this.tipo = tipo;
        this.estado = EstadoHabitacion.DISPONIBLE;
        this.coste = coste;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
