package Clases;

import Interfaces.IAdministrarEstadia;
import Interfaces.IAdministrarReserva;
import Interfaces.IAutentificador;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;


public class Visitante extends Usuario implements IAdministrarEstadia {
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
        Scanner teclado;
        teclado = new Scanner(System.in);


        System.out.println("1- Visualizar informacion del visitante, sus reservas o su estadia \n" +
                "2- Editar de sus reservas o informacion personal\n" +
                "3-Eliminar sus reservas o informacion personal\n" +
                "4-Crear una reserva o un usuario\n");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                this.visitanteSwitchVisualizar(hotel);
                break;

            case 2:
                this.visitanteSwitchEditar(hotel);
                break;

            case 3:
                this.visitanteSwitchEliminar(hotel);
                break;
            case 4:
                this.visitanteSwitchCrear(hotel);


        }
    }


    protected void visitanteSwitchVisualizar(Hotel hotel) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(
                "1- Visualizar su informacion \n" +
                "2-visualizar su Estadias\n" +
                "3-Visualizar sus  Reservas\n" );

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Metodo de llamado a lista de habitaciones y mostrar
                break;
            case 2:
                /// Metodo de llamado a lista de empleados y mostrar
                break;
            case 3:
                /// Metodo de llamado a lista de Estadias y mostrar
                break;

        }
    }


    protected void visitanteSwitchEditar(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(
                "1-Editar Reservas\n" +
                "2- Editar Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                this.editSwitchVisitantes(hotel);
                break;
            case 2:
                this.editSwitchReservas(hotel);
                break;
        }
    }

    protected void visitanteSwitchEliminar(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                        "1-Eliminar Reservas\n" +
                        "2- Eliminar Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Metodo de llamado a lista de habitaciones y luego poder Eliminar
                break;
            case 2:
                /// Metodo de llamado a lista de empleados y luego poder Eliminar
                break;
        }
    }

    protected void visitanteSwitchCrear(Hotel hotel) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(
                        "1-Crear Reservas\n" +
                        "2- Crear Visitantes ");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Metodo de llamado a lista de habitaciones y luego poder Crear
                break;
            case 2:
                /// Metodo de llamado a lista de empleados y luego poder Crear
                break;
            case 3:
                /// Metodo de llamado a lista de Estadias y luego poder Crear
                break;
        }
    }



    protected void   editSwitchReservas(Hotel hotel){

        Scanner teclado = new Scanner(System.in);
        ///Pedir El empleado por nroLegajo
        /// Mostrar mostrar Empleado

        System.out.println("1- Editar el visitante de la  Reserva \n" +
                "2- Editar la llegada a la  Reserva\n" +
                "3-Editar la salida de la  Reserva\n" +
                "4-Editar estado de la  Reserva");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Solicitar y asignar
                break;
            case 2:
                ///Solicitar  y asignar
                break;
            case 3:
                ///Solicitar  y asignar
                break;
            case 4:
                ///Solicitar  y asignar
                break;
        }

    }

    protected void  editSwitchVisitantes(Hotel hotel){
        Scanner teclado = new Scanner(System.in);
        ///Pedir El empleado por nroLegajo
        /// Mostrar mostrar Empleado

        System.out.println("1- Editar el DNI del  visitante  \n" +
                "2- Editar el Origen del visitante \n" +
                "3-Editar el domicilio de origen del visitante \n" +
                "4-Editar nombre del  visitante \n" +
                "5- Editar apellido del visitante");

        int opcion = teclado.nextInt();


        switch (opcion) {
            case 1:
                ///Solicitar y asignar
                break;
            case 2:
                ///Solicitar  y asignar
                break;
            case 3:
                ///Solicitar  y asignar
                break;
            case 4:
                ///Solicitar  y asignar
                break;
            case 5:
                /// Solicitar y asignar
                break;

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

    @Override
    public void crearEstadia(Hotel hotel) {

    }

    @Override
    public void editarEstadia(Hotel hotel, int id) {

    }

    @Override
    public void listarEstadias(Hotel hotel) {
        hotel.mostrarEstadiasPorDNI(getDni());
    }

    @Override
    public void buscarEstadia(Hotel hotel, int id) {

    }
}
