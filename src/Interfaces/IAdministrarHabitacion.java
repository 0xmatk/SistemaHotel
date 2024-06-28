package Interfaces;

import Clases.Habitacion;
import Clases.Hotel;
import Enum.EstadoHabitacion;
import Enum.TipoHabitacion;

import java.util.Scanner;

public interface IAdministrarHabitacion {


    public default void mostrarHabitaciones(Hotel hotel){
        for(Habitacion h : hotel.getHabitaciones().getElementos()){
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
                        int tipoSeleccionado =  teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                habitacion.setTipo(TipoHabitacion.ESTANDAR);
                                break;
                            case 2:
                                habitacion.setTipo(TipoHabitacion.SUITE);
                                break;
                            case 3:
                                habitacion.setTipo(TipoHabitacion.FAMILIAR);
                                break;
                            case 4:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("Introduce el coste de la habitación: ");
                        int coste =  teclado.nextInt();
                        habitacion.setCoste(coste);
                        break;
                    case 3:
                        mostrarMenuEstados();
                        int opcionEstado = teclado.nextInt();
                        teclado.nextLine();

                        switch (opcionEstado) {
                            case 1:
                                habitacion.setEstado(EstadoHabitacion.DISPONIBLE);
                                break;
                            case 2:
                                habitacion.setEstado(EstadoHabitacion.NO_DISPONIBLE);
                                break;
                            case 3:
                                habitacion.setEstado(EstadoHabitacion.EN_MANTENIMIENTO);
                                break;
                            case 4:
                                habitacion.setEstado(EstadoHabitacion.EN_LIMPIEZA);
                                break;
                            default:
                                System.out.println("Opción no válida. Se mantendrá el estado actual.");
                        }

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
            habitacion.setEstado(EstadoHabitacion.NO_DISPONIBLE);

        }else{
            System.out.println("El numero de habitacion no existe.");
        }
    }

   public default Habitacion buscarNumeroHabitacion(Hotel hotel, int numero){
        for(Habitacion habitacion : hotel.getHabitaciones().getElementos()){
            if(habitacion.getNumero() == numero){
                return habitacion;
            }
        }
        return null;
    }

    public default void crearHabitacion(Hotel hotel) {
        Scanner teclado = new Scanner(System.in);
        Habitacion nuevaHabitacion = new Habitacion();

        while (true) {
            System.out.println("Creando una nueva habitación");
            System.out.println("Menú:");
            System.out.println("1. Establecer Número de Habitación");
            System.out.println("2. Establecer Tipo");
            System.out.println("3. Establecer Coste");
            System.out.println("4. Establecer Disponibilidad");
            System.out.println("5. Mostrar Información de la Habitación");
            System.out.println("6. Guardar Habitación y Salir");
            System.out.print("Elige una opción: ");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el número de habitación: ");
                    int numero = teclado.nextInt();
                    nuevaHabitacion.setNumero(numero);
                    break;
                case 2:
                     mostrarOpciones();
                     int opcionTipo = teclado.nextInt();


                    break;
                case 3:
                    System.out.print("Introduce el coste de la habitación: ");
                    int coste = teclado.nextInt();
                    nuevaHabitacion.setCoste(coste);
                    break;
                case 4:
                    mostrarMenuEstados();
                    int opcionEstado = teclado.nextInt();
                    teclado.nextLine();

                    switch (opcionEstado) {
                        case 1:
                            nuevaHabitacion.setEstado(EstadoHabitacion.DISPONIBLE);
                            break;
                        case 2:
                            nuevaHabitacion.setEstado(EstadoHabitacion.NO_DISPONIBLE);
                            break;
                        case 3:
                            nuevaHabitacion.setEstado(EstadoHabitacion.EN_MANTENIMIENTO);
                            break;
                        case 4:
                            nuevaHabitacion.setEstado(EstadoHabitacion.EN_LIMPIEZA);
                            break;
                        default:
                            System.out.println("Opción no válida. Se mantendrá el estado actual.");
                    }

                    break;
                case 5:
                    System.out.println("Información de la Habitación:");
                    System.out.println(nuevaHabitacion);
                    break;
                case 6:
                    hotel.agregarHabitacion(nuevaHabitacion);
                    System.out.println("Habitación guardada y saliendo del menú de creación...");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    public default void mostrarMenuEstados() {
        System.out.println("\nSelecciona el estado de la habitación:");
        System.out.println("1. DISPONIBLE");
        System.out.println("2. NO DISPONIBLE");
        System.out.println("3. EN MANTENIMIENTO");
        System.out.println("4. EN LIMPIEZA");
        System.out.print("Elige una opción: ");


    }

    public default void mostrarOpciones() {
        System.out.println("Seleccione el tipo de habitación:");
        System.out.println("1. ESTANDAR");
        System.out.println("2. SUITE");
        System.out.println("3. FAMILIAR");
        System.out.println("4. Salir");
        System.out.print("Ingrese su opción: ");
    }

}
