package Ejercicio3;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public void eliminarEstudiante(int id) {
        listaEstudiantes.removeIf(estudiante -> estudiante.getId() == id);
    }

    public void listarEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            estudiante.mostrarInformacion();
        }
    }

    public Estudiante buscarPorNombre(String nombre) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }
        return null;
    }
}
