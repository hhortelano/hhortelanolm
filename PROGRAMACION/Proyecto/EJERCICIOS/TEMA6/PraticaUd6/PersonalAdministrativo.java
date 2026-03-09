package TEMA6.PraticaUd6;

import java.time.LocalDate;

public abstract class PersonalAdministrativo extends Trabajador {
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

    public PersonalAdministrativo(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase, String departamento, int nivel) {
        super(nombre, apellidos, DNI, fechaIncorporacion, salarioBase);
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
