package TEMA6.Practica;

import java.time.LocalDate;
import java.time.Period;

public abstract class Trabajador {
    //  ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String DNI;
    private LocalDate fechaIncorporacion;
    private double salarioBase;

    //  GETTER AND SETTER

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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    // CONSTRUCTOR


    public Trabajador() {
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador(String nombre, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Trabajador(String nombre, String apellidos, LocalDate fechaIncorporacion, String DNI, double salarioBase) {
        this.nombre = nombre;
        apellidos = apellidos;
        this.fechaIncorporacion = fechaIncorporacion;
        this.DNI = DNI;
        this.salarioBase = salarioBase;
    }

    // METODOS

    public abstract double calcularSalario();

    public String trabajar(){
        return "Estoy trabajando en el centro educativo";
    }

    public int antiguedad(){
        Period aniosAntiguedad = Period.between(this.fechaIncorporacion, LocalDate.now());
        return aniosAntiguedad.getYears();
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos +
                ", DNI:" + DNI +
                ", FechaIncorporacion: " + fechaIncorporacion +
                ", Salario:" + salarioBase;
    }
}
