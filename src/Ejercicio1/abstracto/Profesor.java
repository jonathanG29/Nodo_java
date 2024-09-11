package Ejercicio1.abstracto;

public abstract class Profesor extends Asalariado{

    public Profesor() {
    }

    public Profesor(int id, String nombre, String apellidos, double sueldo, String departamento, int fechaIngreso, float porcBono) {
        super(id, nombre, apellidos, sueldo, departamento, fechaIngreso, porcBono);
    }


}
