package TEMA6.Practica;

import java.time.LocalDate;

public class DemoCentroEducativo {
    public static void main(String[] args) {
        // PROFESORES
        Profesor profesor1 = new Profesor("Manolo", "Manolez", LocalDate.of(2010,5,24), "18464637M", 1634.23, "Matematicas", 10);

        Profesor profesor2 = new Profesor("Angel", "Perez", LocalDate.of(2015,2,14), "23423437M", 1503.13, "Lengua", 20);

        // PERSONAL ADMINISTRATIVO

        PersonalAdministrativo personal1 = new PersonalAdministrativo("JUan", "Juanez", LocalDate.of(2011, 3,12), "12121212L", 1832.32, "Informatica", 2);

        PersonalAdministrativo personal2 = new PersonalAdministrativo("maria", "martinez", LocalDate.of(2021, 11,21), "113131313L", 1632.89, "mates", 1);

        // CENTRO EDUCATIVO
        CentroEducativo centro1 = new CentroEducativo();
        centro1.getListaTrabajadores().add(profesor1);
        centro1.getListaTrabajadores().add(profesor2);
        centro1.getListaTrabajadores().add(personal1);
        centro1.getListaTrabajadores().add(personal2);

        // MOSTRAR TRABAJADOREs
        centro1.mostrarTrabajadores();

        System.out.println("El salario medio es: " + centro1.medaSalario());

        System.out.println("El trabajador mas antiguo es " + centro1.masAntiguo());




    }
}
