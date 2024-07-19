package Ejercicio2;

public class EmpleadoTemporal extends Empleado {

    public EmpleadoTemporal(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);
    }

    public void mostrarInformacion() {
        System.out.println("Empleado Temporal -> ID: " + getIdEmpleado() + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Salario: " + getSalario());
    }
}