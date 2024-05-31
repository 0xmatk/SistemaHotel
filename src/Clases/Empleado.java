package Clases;

public class Empleado extends Persona {
    private int nroLegajo;
    private String sector;

    public Empleado(String nombre, String apellido, int nroLegajo, String sector) {
        super(nombre, apellido);
        this.nroLegajo = nroLegajo;
        this.sector = sector;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Clases.Empleado{" +
                "nroLegajo=" + nroLegajo +
                ", sector='" + sector + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                "} " + super.toString(); //test
    }


}
