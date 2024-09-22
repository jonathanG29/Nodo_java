package Ejercicio3.Clases;

import lombok.Getter;
import lombok.Setter;

public abstract class Usuario {

    @Getter @Setter
    private int id;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;

    @Getter
    private String fechaNacimiento;
    @Getter @Setter
    private String direccion;
    @Getter @Setter
    private int telefono;


    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String fechaNacimiento, String direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void mostrarDatos(){

    }

}
