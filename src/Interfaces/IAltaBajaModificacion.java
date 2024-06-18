package Interfaces;

import Clases.Empleado;
import Clases.Hotel;
import Clases.Persona;

import java.util.Set;

public interface IAltaBajaModificacion {

    public default void darAlta(Hotel hotel, Empleado empleado){
        hotel.agregarEmpleado(empleado);
    }

    public default void darBaja(){

    }

    public default void modificar(){
    }

    public default Empleado buscarEmpleado(Hotel hotel, int nroLegajo){
        for(Empleado e : hotel.getEmpleados()){
            if(e.getNroLegajo() == nroLegajo){
                return e;
            }
        }

        return null;
    }

    public default Empleado crearEmpleado(Hotel hotel, String nombre, String apellido, int nroLegajo){
        Empleado e = buscarEmpleado(hotel, nroLegajo);

        if(e == null){
            if(nombre != null && apellido != null && nroLegajo < 0){
                Empleado empleado = new Empleado(nombre, apellido, nroLegajo);
                darAlta(hotel, empleado);

            }else{
                System.out.println("Rellene todos los datos correctamente.");
            }

        }else{
            System.out.println("El nro legajo ya existe.");
        }

        return e;
    }
}
