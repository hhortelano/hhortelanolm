package TEMA6.PraticaUd6;

import java.time.LocalDate;

public  class Profesor extends Trabajador{
    //  ATRIBUTOS
    private String Especialidad;
    private int horasLectivas;

    //  GETTERS AND SETTERS

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }



    public int getHorasLectivas() {
        return horasLectivas;
    }

    public void setHorasLectivas(int horasLectivas) {
        this.horasLectivas = horasLectivas;
    }

    //  CONSTRUCTORES

    public Profesor() {
    }

    public Profesor(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase, String especialidad, int horasLectivas) {
        super(nombre, apellidos, DNI, fechaIncorporacion, salarioBase);
        Especialidad = especialidad;
        this.horasLectivas = horasLectivas;
    }

    //  METODOS


    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasLectivas * 10);
    }

    @Override
    public String trabajar() {
        return "Imparto clase como " + getEspecialidad();
    }


}
