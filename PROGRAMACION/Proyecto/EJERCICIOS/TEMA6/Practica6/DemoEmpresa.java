package TEMA6.Practica6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  EMPLEADOS
        Empleado empleado1 = new Empleado("Manolo", "Gimenez", "Jefe", 2545.34, LocalDate.of(2010, 5,24), "18434523M");

        Empleado empleado2 = new Empleado("Pascual", "Perez", "Encargado", 2134.21, LocalDate.of(2015,8,12), "18181818K");

        Empleado empleado3 = new Empleado("Daniel", "Remon", "Becario", 1683.65, LocalDate.of(2025,12,1), "18466912M");

        //  EMPRESA
        Empresa empresa1 = new Empresa();
        empresa1.getEmpleados().add(empleado1);
        empresa1.getEmpleados().add(empleado2);
        empresa1.getEmpleados().add(empleado3);


        //  MOSTRAR EMPLEADO

        empresa1.mostrarEmpleados();
        System.out.println("El salario promedio es: " + empresa1.mediaSalario());
        System.out.println("El empleado mas antiguo es: " + empresa1.masAntiguedad());


        //  BUSQUEDA EMPLEADOS
        System.out.print("Dime el nombre del empleado o el puesto en el que esta: ");
        String eNombrePuesto = sc.nextLine();
        empresa1.buscarEmpleado(eNombrePuesto);
    }
}
