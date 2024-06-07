package Clases;

import Interfaces.IAdministrarReserva;

import java.util.Date;
import java.util.List;

public class Visitante extends Persona implements IAdministrarReserva {
    private int dni;
    private String origen;
    private String domicilioOrigen;
    private boolean presente;
    private float gastos;
    private int nroHabitacion;
    List<Reserva> reservasUsuario;
    List<Estadia> estadiasUsuario;


    public Visitante(String nombre, String apellido, int dni, String origen, String domicilioOrigen, boolean presente) {
        super(nombre, apellido);
        this.dni = dni;
        this.origen = origen;
        this.domicilioOrigen = domicilioOrigen;
        this.presente = presente;
        this.gastos = getGastos();
        this.nroHabitacion = getNroHabitacion();

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getOrigen() {
        return origen; //test
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDomicilioOrigen() {
        return domicilioOrigen;
    }

    public void setDomicilioOrigen(String domicilioOrigen) {
        this.domicilioOrigen = domicilioOrigen;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public float getGastos() {
        return gastos;
    }

    public void setGastos(float gastos) {
        this.gastos = gastos;
    }

    public int getNroHabitacion() {
        return nroHabitacion;
    }

    public void setNroHabitacion(int nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }

   public void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado){

   }

    @Override
    public void editarReserva(Reserva reserva) {

    }

    @Override
    public void listarReservas() {

    }

    @Override
    public void buscarReserva(int dni) {

    }
}
