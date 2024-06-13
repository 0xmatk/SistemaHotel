package Clases;

import Interfaces.IAdministrarReserva;
import Interfaces.IAutentificador;
import java.util.Date;


public class Visitante extends Persona implements IAdministrarReserva, IAutentificador {
    private int dni;
    private String origen;
    private String domicilioOrigen;
    private boolean presente;
    private float gastos;
    private int nroHabitacion;
    private String token;
    private boolean estado;



    public Visitante(String nombre, String apellido, int dni, String origen, String domicilioOrigen, boolean presente) {
        super(nombre, apellido);
        this.dni = dni;
        this.origen = origen;
        this.domicilioOrigen = domicilioOrigen;
        this.presente = presente;
        this.gastos = getGastos();
        this.nroHabitacion = getNroHabitacion();
        this.token = generateToken();

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

    public String getToken() {
        return token;
    }

    public void crearReserva(Visitante visitante, Habitacion habitacion, Date llegada, Date salida, boolean estado){

   }

    @Override
    public void editarReserva(int id) {

    }

    @Override
    public void listarReservas() {

    }

    @Override
    public void buscarReserva(int dni) {

    }

    @Override
    public String toString() {
        return "Visitante{" +
                "dni=" + dni +
                ", origen='" + origen + '\'' +
                ", domicilioOrigen='" + domicilioOrigen + '\'' +
                ", presente=" + presente +
                ", gastos=" + gastos +
                ", nroHabitacion=" + nroHabitacion +
                ", token='" + token + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
