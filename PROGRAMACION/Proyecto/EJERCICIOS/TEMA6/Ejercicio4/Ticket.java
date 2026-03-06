package TEMA6.Ejercicio4;

public class Ticket  {
    //  ATRIBUTOS

    private String nombre;
    private int unidades;
    private double precio;
    private static final double IVA = 0.21;

    //  GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getPrecio() {
        return precio;
    }

    //  SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // CONTRUCTORES


    public Ticket() {
    }



    public Ticket(String nombre, int unidades, double precio) {
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }



    //  METODOS


    @Override
    public String toString() {
        return "Ticket{" +
                "nombre='" + nombre + '\'' +
                ", unidades='" + unidades + '\'' +
                ", precio=" + precio +
                '}';
    }

    public double calcularMedia() {

        return (this.unidades * this.precio);


    }

}
