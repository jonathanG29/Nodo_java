package Ejercicio3.Clases;

public class Adminstrador extends Usuario{

    private String cargo;

    public Adminstrador() {
    }

    public Adminstrador(int id, String nombre, String apellido, String fechaNacimiento, String direccion, int telefono, String cargo) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Administrador: " + getNombre() + " " + getApellido());
    }
}
