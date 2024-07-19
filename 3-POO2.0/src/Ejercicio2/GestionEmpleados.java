package Ejercicio2;
import java.util.ArrayList;

public class GestionEmpleados {
    private ArrayList<Empleado> empleados;

    public GestionEmpleados() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(int idEmpleado) {
        empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
        }
    }
}