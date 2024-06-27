import Clases.*;

import java.util.Date;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        Habitacion habitacion = new Habitacion("Tipo", 100, 1);
        Date llegada = new Date();
        Date salida = new Date();
        Date llegada2 = new Date();
        llegada2.setTime(20);


        //Admin admin = new Admin("Admin", "Admin");
        Empleado empleado = new Empleado("Matias", "Klingeman", "mklingeman", "123", 1);

        sistema.actividadUsuario(empleado);










    }

}