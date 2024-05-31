package Clases;

public class Habitacion {
    private String tipo;
    private int numero;
    private int coste;
    private boolean disponible;


    public Habitacion(String tipo, boolean disponible, int coste, int numero) {
        this.tipo = tipo;
        this.disponible = true;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Clases.Habitacion{" +
                "tipo='" + tipo + '\'' +
                ", numero=" + numero +
                ", coste=" + coste +
                ", disponible=" + disponible +
                '}';
    }
}
