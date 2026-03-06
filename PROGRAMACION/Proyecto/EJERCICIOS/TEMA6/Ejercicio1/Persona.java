package TEMA6.Ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Persona {

    //  ATRIBUTOS
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String DNI;
    private char sexo;




    //  GETTERS
    public String getNombre() {return this.nombre;}

    public String getApellidos() {return this.apellidos;}

    public LocalDate getFechaNacimiento() {return this.fechaNacimiento;}

    public String getDNI() {return this.DNI;}

    public char getSexo() {return this.sexo;}


    //  SETTERS
    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public void setDNI(String DNI) {this.DNI = DNI;}

    public void setSexo(char sexo) {this.sexo = sexo;}


    //  CONSTRUCTORES


    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellidos, char sexo, String DNI, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
    }



    //  METODOS

    public String saludar() {
        return "Hola, soy " + this.nombre;
    }

    @Override
    public String toString() {
      return "Persona [Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + DNI + "]";
    }

    public int calcularEdad() {

        // Guardamos en hoy la fecha de hoy
        LocalDate hoy = LocalDate.now();

        // Period.between compara año mes y dia automaticamente
        Period periodo = Period.between(this.fechaNacimiento, hoy);

        return periodo.getYears();
    }




}
