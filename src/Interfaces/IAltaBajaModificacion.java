package Interfaces;

import Clases.Empleado;
import Clases.Hotel;
import Clases.Persona;

import java.util.Scanner;
import java.util.Set;

public interface IAltaBajaModificacion {

    public default void darAlta(Hotel hotel, Empleado empleado){
        hotel.agregarEmpleado(empleado);
    }

    public default void darBaja(Hotel hotel, int nroLegajo){
        Empleado empleado = buscarEmpleado(hotel, nroLegajo);

        if(empleado != null){
            hotel.getEmpleados().remove(empleado);
        }
    }

    public default void modificar(Hotel hotel, int nroLegajo){
        Empleado empleado = buscarEmpleado(hotel, nroLegajo);
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Editando el empleado " + empleado.getNombre() + " " + empleado.getApellido());
            System.out.println("Menú:");
            System.out.println("1. Establecer Número de Legajo");
            System.out.println("2. Establecer Estado");
            System.out.println("3. Mostrar Información del Empleado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nuevo número de legajo: ");
                    int _nroLegajo = teclado.nextInt();
                    teclado.nextLine();
                    empleado.setNroLegajo(_nroLegajo);
                    System.out.println("Número de legajo modificado exitosamente.");
                    break;
                case 2:
                    System.out.print("Introduce el nuevo estado (true/false): ");
                    boolean estado = teclado.nextBoolean();
                    teclado.nextLine();
                    empleado.setEstado(estado);
                    System.out.println("Estado modificado exitosamente.");
                    break;
                case 3:
                    System.out.println("Información del Empleado:");
                    empleado.toString();
                    break;
                case 4:
                    System.out.println("Saliendo de la edición del empleado...");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
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
