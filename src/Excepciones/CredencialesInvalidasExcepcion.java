package Excepciones;

public class CredencialesInvalidasExcepcion extends Exception{
    public CredencialesInvalidasExcepcion() {
        super("Usuario y/o contraseña invalidos");
    }
}
