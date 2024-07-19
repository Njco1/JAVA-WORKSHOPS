package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestion = new GestionEmpleados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema de Registro de Empleados:");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Eliminar Empleado");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el ID de empleado: ");
                    int idEmpleado = scanner.nextInt();
                    System.out.print("Ingrese el salario: ");
                    double salario = scanner.nextDouble();
                    System.out.print("Tipo de empleado (1 - Temporal, 2 - Permanente): ");
                    int tipo = scanner.nextInt();

                    if (tipo == 1) {
                        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(nombre, edad, idEmpleado, salario);
                        gestion.agregarEmpleado(empleadoTemporal);
                    } else {
                        EmpleadoPermanente empleadoPermanente = new EmpleadoPermanente(nombre, edad, idEmpleado, salario);
                        gestion.agregarEmpleado(empleadoPermanente);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el ID del empleado a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    gestion.eliminarEmpleado(idEliminar);
                    break;

                case 3:
                    gestion.mostrarEmpleados();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}