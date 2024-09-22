package Ejercicio3.Clases;

public class GestorViajes extends Usuario{

    private String ubicacion;

    public GestorViajes() {

    }

    public GestorViajes(int id, String nombre, String apellido, String fechaNacimiento, String direccion, int telefono, String ubicacion) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Gestor de viajes: " + getNombre() + " " + getApellido());
        System.out.println("Ubicacion: " + getUbicacion());
    }
}
