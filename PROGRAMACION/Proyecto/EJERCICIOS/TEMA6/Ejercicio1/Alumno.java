package TEMA6.Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {
    private String curso;
    private String grupo;
    private ArrayList<String> asignaturas;




    //  CONSTRUCTORES

    public Alumno(String nombre, String apellidos, char sexo, String DNI, LocalDate fechaNacimiento, String curso, String grupo) {
        super(nombre, apellidos, sexo, DNI, fechaNacimiento);

        this.curso = curso;
        this.grupo = grupo;
        this.asignaturas = new ArrayList<>();
    }


    //  METODOS

    public void matricularAsignatura(String asignatura) {
        this.asignaturas.add(asignatura);
    }


    @Override
    public String toString() {

        return super.toString() + " | Curso: " + curso + " | Grupo: " + grupo + " | Asignaturas: " + asignaturas;

    }

}
