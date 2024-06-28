package Clases;

import Interfaces.IAdministrarEstadia;
import Interfaces.IAdministrarReserva;
import Interfaces.IAutentificador;

import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Visitante extends Usuario implements IAdministrarReserva {
    private int dni;
    private String origen;
    private String domicilioOrigen;
    private float gastos;
    private int nroHabitacion;
    private boolean estado;


    public Visitante(){

        super();
    }

    public Visitante(String nombre, String apellido, String usuario, String clave, int dni,String domicilioOrigen, String origen) {
        super(nombre, apellido, usuario, clave);
        this.dni = dni;
        this.estado = true;
        this.nroHabitacion = getNroHabitacion();
        this.gastos = getGastos();
        this.domicilioOrigen = domicilioOrigen;
        this.origen = origen;
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

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    ///==============================================================================================================




    public void visitanteSwitch(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {


        System.out.println("1- Visualizar informacion del visitante, sus reservas o su estadia \n" +
                "2- Editar de sus reservas o informacion personal\n" +
                "3-Eliminar sus reservas \n" +
                "4-Crear una reserva \n");

            opcion = scanner.nextInt();
            scanner.nextLine();


        switch (opcion) {
            case 1:
                this.visitanteSwitchVisualizar(hotel);
                break;

            case 2:
                this.visitanteSwitchEditar(hotel);
                break;

            case 3:
                System.out.print("Ingrese el id de su reserva: ");
                int idreserv = scanner.nextInt();
                for(Reserva aux : hotel.getReservas()){
                    if(aux.getID() == idreserv ){
                        aux.setEstado(false);
                    }
                }
                break;
            case 4:
                crearReserva(hotel);

            case 0:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        } while (opcion != 0);

        scanner.close();
    }


    protected void visitanteSwitchVisualizar(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println(
                "1- Visualizar su informacion \n" +
                "2-visualizar su Estadias\n" +
                "3-Visualizar sus  Reservas\n" );

        opcion = scanner.nextInt();
        scanner.nextLine();


        switch (opcion) {
            case 1:
                this.visualizarInfoVisit();
                break;
            case 2:
                this.visualizarEstadias(hotel);
                break;
            case 3:
                this.visualizarReservas(hotel);
                break;
            case 0:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

    } while (opcion != 0);

        scanner.close();
    }


    protected void visitanteSwitchEditar(Hotel hotel) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(
                    "1-Editar Visitante\n" +
                            "2- Editar Reservas ");

            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    this.editSwitchVisitantes(hotel);
                    break;
                case 2:
                    this.editSwitchReservas(hotel);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        }while (opcion != 0);
    }



    protected void   editSwitchReservas(Hotel hotel){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el ID de la reserva");
        int idreserva = scanner.nextInt();
        scanner.nextLine();
        Reserva aux = null;
        for(Reserva aux1 : hotel.getReservas()){
            if(aux1.getID() == idreserva){
                aux=aux1;
            }

        }

        do {
            System.out.println("1. Editar Dia de llegada");
            System.out.println("2. Editar Dia de salida");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    aux.setLlegada(pedirFecha("llegada", scanner));

                    break;
                case 2:
                    aux.setSalida(pedirFecha("Salida ", scanner));
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();

    }

    protected void  editSwitchVisitantes(Hotel hotel){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Editar nombre");
            System.out.println("2. Editar apellido");
            System.out.println("3. Editar usuario");
            System.out.println("4. Editar clave");
            System.out.println("5. Editar DNI");
            System.out.println("6. Editar domicilio de origen");
            System.out.println("7. Editar país de origen");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    this.setNombre(nuevoNombre);
                    System.out.println("Nombre actualizado.");
                    break;
                case 2:
                    System.out.print("Nuevo apellido: ");
                    String nuevoApellido = scanner.nextLine();
                    this.setApellido(nuevoApellido);
                    System.out.println("Apellido actualizado.");
                    break;
                case 3:
                    System.out.print("Nuevo usuario: ");
                    String nuevoUsuario = scanner.nextLine();
                    this.setUsuario(nuevoUsuario);
                    System.out.println("Usuario actualizado.");
                    break;
                case 4:
                    System.out.print("Nueva clave: ");
                    String nuevaClave = scanner.nextLine();
                    this.setClave(nuevaClave);
                    System.out.println("Clave actualizada.");
                    break;
                case 5:
                    System.out.print("Nuevo DNI: ");
                    int nuevoDni = scanner.nextInt();
                    this.setDni(nuevoDni);
                    scanner.nextLine();
                    System.out.println("DNI actualizado.");
                    break;
                case 6:
                    System.out.print("Nuevo domicilio de origen: ");
                    String nuevoDomicilio = scanner.nextLine();
                    this.setDomicilioOrigen(nuevoDomicilio);
                    System.out.println("Domicilio de origen actualizado.");
                    break;
                case 7:
                    System.out.print("Nuevo país de origen: ");
                    String nuevoOrigen = scanner.nextLine();
                    this.setOrigen(nuevoOrigen);
                    System.out.println("País de origen actualizado.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();

    }

public void visualizarInfoVisit(){
        System.out.println(this.toString());
}

public void visualizarReservas(Hotel hotel){
    for(Reserva aux: hotel.getReservas()){
        if(aux.getVisitante().getDni() == this.getDni()){
            System.out.println(aux.toString());
        }
    }
}
    public void visualizarEstadias(Hotel hotel) {
        for (Estadia aux : hotel.getEstadias()) {
            if (aux.getVisitante().getDni() == this.getDni()) {
                System.out.println(aux.toString());
            }
        }
    }

    private  Date pedirFecha(String tipoFecha, Scanner scanner) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            try {
                System.out.print("Ingrese la fecha de " + tipoFecha + " (yyyy-MM-dd): ");
                String fechaString = scanner.nextLine();
                Date fecha = dateFormat.parse(fechaString);
                return fecha;
            } catch (Exception e) {
                System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
            }
        }

    }



    ///============================================================================================================


@Override
    public String toString() {
        return "Visitante{" +
                "dni=" + dni +
                ", origen='" + origen + '\'' +
                ", domicilioOrigen='" + domicilioOrigen + '\'' +
                ", gastos=" + gastos +
                ", nroHabitacion=" + nroHabitacion +
                ", estado=" + estado +
                "} ";
    }
///==============================================================================================================


    @Override
    public void crearReserva(Hotel hotel){
        Scanner scanner = new Scanner(System.in);

        Date llegada = pedirFecha("llegada", scanner);
        Date salida = pedirFecha("salida", scanner);
        Reserva Aux= new Reserva(this,null,llegada,salida);

        for(Habitacion aux: hotel.getHabitaciones()){
            if(aux.getFechaLejana().before(Aux.llegada)){
                hotel.agregarReserva(Aux);
                aux.setFechaLejana(Aux.salida);
            }else{
                if(aux.getFechaProxima().after(Aux.salida)){
                    hotel.agregarReserva(Aux);
                    aux.setFechaProxima(Aux.llegada);
                }
            }

        }

        scanner.close();
    }

    @Override
    public void editarReserva(int id) {

    }

    @Override
    public void listarReservas() {

    }

    @Override
    public void buscarReserva(int id) {

    }
}
