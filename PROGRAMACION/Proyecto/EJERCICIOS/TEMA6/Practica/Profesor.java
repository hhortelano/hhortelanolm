package TEMA6.Practica;

import java.time.LocalDate;

public class Profesor extends Trabajador{
     // ATRIBUTOS
    private String especialidad;
    private int horasLectivas;

    // GETTERS AND SETTES

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasLectivas() {
        return horasLectivas;
    }

    public void setHorasLectivas(int horasLectivas) {
        this.horasLectivas = horasLectivas;
    }


    //  CONTRUCTORES

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, LocalDate fechaIncorporacion, String DNI, double salarioBase, String especialidad, int horasLectivas) {
        super(nombre, apellidos, fechaIncorporacion, DNI, salarioBase);
        this.especialidad = especialidad;
        this.horasLectivas = horasLectivas;
    }

    // METODOS

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasLectivas * 10);
    }

    @Override
    public String trabajar() {
        return "Imparto clase como " + getEspecialidad();
    }

}
