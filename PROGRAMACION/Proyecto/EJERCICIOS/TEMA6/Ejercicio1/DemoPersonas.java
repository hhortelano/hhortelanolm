package TEMA6.Ejercicio1;
import java.time.LocalDate;

public class DemoPersonas {
    public static void main(String[] args) {

        // PERSONAS

        Persona persona1 = new Persona("Ana" , "Garcia", 'F', "19393847M", LocalDate.of(1980, 5, 20));

        Persona persona2 = new Persona("Manolo" , "Gimenez", 'M', "192873643M", LocalDate.of(1999, 4,4));

        Persona persona3 = new Persona("Pascual", "Garcia", 'M', "1919191923M", LocalDate.of(1975,3,7));

        //  GRUPOS

        Personas grupo1 = new Personas();

        grupo1.añadirPersona(persona1);
        grupo1.añadirPersona(persona2);
        grupo1.añadirPersona(persona3);


        // MAIN

        System.out.println("La edad media es: " + grupo1.calcularEdadMedia());

        Persona laMasVieja = grupo1.obtenerPersonaMasMayor();
        System.out.println("La persona con más edad es: " + laMasVieja.getNombre());


        // ALUMNOS


        Alumno alu1 = new Alumno("Marcos", "Reina", 'H', "99887766Z", LocalDate.of(2008, 3, 15), "1º Bachillerato", "A");


        alu1.matricularAsignatura("Programación");
        alu1.matricularAsignatura("Sistemas Informáticos");
        alu1.matricularAsignatura("Base de Datos");


        System.out.println("--- PRUEBA DE ALUMNO ---");


        System.out.println("Edad del alumno: " + alu1.calcularEdad() + " años.");


        System.out.println(alu1);
    }
}
