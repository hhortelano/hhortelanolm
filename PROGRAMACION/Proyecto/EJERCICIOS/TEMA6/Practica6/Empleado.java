package TEMA6.Practica6;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    //  ATRIBUTOS
    private String nombre;
    private String apellidos;
    private LocalDate fechaContratacion;
    private String DNI;
    private double salario;
    private String puesto;

    // GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }



    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }



    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    //  CONSTRUCTORES

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
    }

    public Empleado(String nombre, String apellidos, String puesto, double salario, LocalDate fechaContratacion, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
        this.DNI = DNI;

    }


    //  METODOS

    public String trabajar(){
        return "Estoy trabajando como " + puesto;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " " + apellidos +
                " contratado el " + fechaContratacion +
                " DNI: " + DNI +
                " Salario:  " + salario +
                " Puesto: " + puesto;
    }

    public int antiguedad() {

        // Guardamos en hoy la fecha de hoy
        LocalDate hoy = LocalDate.now();

        // Period.between compara año mes y dia automaticamente
        Period periodo = Period.between(this.fechaContratacion, hoy);

        return periodo.getYears();
    }
}
