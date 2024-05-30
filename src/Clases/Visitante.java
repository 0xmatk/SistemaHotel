package Clases;

public class Visitante extends Persona {
    private int dni;
    private boolean presente;
    private int nroHabitacion;
    private float gastos;

    public Visitante(String nombre, String apellido, int dni, float gastos, int nroHabitacion, boolean presente) {
        super(nombre, apellido);
        this.dni = dni;
        this.gastos = gastos;
        this.nroHabitacion = nroHabitacion;
        this.presente = presente;
    }

    public int getDni() {
        return dni;
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

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "Clases.Visitante{" +
                "dni=" + dni +
                ", presente=" + presente +
                ", nroHabitacion=" + nroHabitacion +
                ", gastos=" + gastos +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                "} " + super.toString();
    }
}
