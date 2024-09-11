package Ejercicio1.abstracto;

public abstract class Profesor extends Asalariado{

    private String fechaIngreso;

    public Profesor(String fechaIngreso, int id, String nombre, String apellidos, double sueldo) {
        super(id, nombre, apellidos, sueldo);
        this.fechaIngreso = fechaIngreso;
    }

    @Override

}
