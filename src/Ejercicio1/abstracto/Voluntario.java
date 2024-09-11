package Ejercicio1.abstracto;

public abstract class Voluntario extends Persona{

    private String area;

    public Voluntario() {
    }

    public Voluntario(int id, String nombre, String apellidos, double sueldo, String area) {
        super(id, nombre, apellidos, sueldo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void calculateBono() {
    }

    public abstract void mostrarArea(String area);
}
