package Interfaces;

import Clases.Habitacion;
import Clases.Hotel;

import java.util.Scanner;

public interface IAdministrarHabitacion {


    public default void mostrarHabitaciones(Hotel hotel){
        for(Habitacion h : hotel.getHabitaciones()){
            System.out.println(h);
        }
    }

    public default void editarHabitacion(Hotel hotel, int numero){
        Habitacion habitacion = buscarNumeroHabitacion(hotel, numero);

        if(habitacion != null){
            while (true) {
                System.out.println("Editando la habitación " + numero);
                System.out.println("Menú:");
                System.out.println("1. Establecer Tipo");
                System.out.println("2. Establecer Coste");
                System.out.println("3. Establecer Disponibilidad");
                System.out.println("4. Mostrar Información de la Habitación");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");

                Scanner teclado = new Scanner(System.in);
                int opcion =  teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el tipo de habitación: ");
                        String tipo =  teclado.nextLine();
                        habitacion.setTipo(tipo);
                        break;
                    case 2:
                        System.out.print("Introduce el coste de la habitación: ");
                        int coste =  teclado.nextInt();
                        habitacion.setCoste(coste);
                        break;
                    case 3:
                        System.out.print("¿Está disponible la habitación? (true/false): ");
                        boolean disponible =  teclado.nextBoolean();
                        habitacion.setDisponible(disponible);
                        break;
                    case 4:
                        System.out.println("Información de la Habitación:");
                        System.out.println(habitacion);
                        break;
                    case 5:
                        System.out.println("Saliendo de la edición de la habitación...");
                        return;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            }
        }
    }

    public default void eliminarHabitacion(Hotel hotel){
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el numero de habitacion a eliminar: ");
        numero = teclado.nextInt();

        Habitacion habitacion = hotel.buscarNumeroHabitacion(numero);

        if(habitacion != null){
            hotel.eliminarHabitacion(numero);

        }else{
            System.out.println("El numero de habitacion no existe.");
        }
    }

    public default Habitacion buscarNumeroHabitacion(Hotel hotel, int numero){
        for(Habitacion habitacion : hotel.getHabitaciones()){
            if(habitacion.getNumero() == numero){
                return habitacion;
            }
        }
        return null;
    }

}
