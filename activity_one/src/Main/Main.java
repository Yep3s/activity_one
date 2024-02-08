package Main;

import Empleado.Empleado;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Empleado worker = new Empleado();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa El Nombre Del Empleado: ");
        worker.setNombre(teclado.nextLine());

        System.out.println("Ingresa El Estado Civil Del Empleado: ");
        worker.setEstadoCivil(teclado.nextLine().toLowerCase());

        System.out.println("Ingresa La Cedula Del Empleado: ");
        worker.setCedula(teclado.nextInt());

        System.out.println("Ingresa La Cantidad De Hijos Del Empleado: ");
        worker.setNumeroDeHijos(teclado.nextInt());

        System.out.println("Ingresa El Sueldo Base Del Empleado: ");
        worker.setSueldoBase(teclado.nextInt());

        System.out.println("Ingresa La Cantidad De Horas Extras Trabajadas En El Mes Por El Empleado: ");
        worker.setCantidadHorasExtras(teclado.nextInt());

        System.out.println("Ingresa El Valor Pagado Al Empleado Por Cada Hora Extra: ");
        worker.setValorHorasExtras(teclado.nextInt());

        worker.informacionCompleta();

    }

}
