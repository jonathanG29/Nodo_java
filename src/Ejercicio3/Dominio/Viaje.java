package Ejercicio3.Dominio;

public class Viaje {

    private String id;
    private String NombreCiudad;

    public Viaje() {
    }

    public Viaje(String id, String nombreCiudad) {
        this.id = id;
        NombreCiudad = nombreCiudad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        NombreCiudad = nombreCiudad;
    }
}
