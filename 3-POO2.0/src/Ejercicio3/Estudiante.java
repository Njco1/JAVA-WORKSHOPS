package Ejercicio3;

public class Estudiante {
    private int id;
    private String nombre;
    private String email;

    public Estudiante(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
    }
}