package Ejercicio2;

public class EmpleadoPermanente extends Empleado {

    public EmpleadoPermanente(String nombre, int edad, int idEmpleado, double salario) {
        super(nombre, edad, idEmpleado, salario);
    }


    public void mostrarInformacion() {
        System.out.println("Empleado Permanente -> ID: " + getIdEmpleado() + ", Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Salario: " + getSalario());
    }
}