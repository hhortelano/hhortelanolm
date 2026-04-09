package TEMA6.Practica;

import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador{
    //  ATRIBUTOS
    private String departamento;
    private int nivel;
    //  GETTERS AND SETTERS
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }



    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //  CONSTRUCTORES

    public PersonalAdministrativo() {
    }

    public PersonalAdministrativo(String nombre, String apellidos, LocalDate fechaIncorporacion, String DNI, double salarioBase, String departamento, int nivel) {
        super(nombre, apellidos, fechaIncorporacion, DNI, salarioBase);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    //  METODOS
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (nivel * 15);
    }

    @Override
    public String trabajar() {
        return "Realizo tareas administrativas en " + departamento;
    }
}
