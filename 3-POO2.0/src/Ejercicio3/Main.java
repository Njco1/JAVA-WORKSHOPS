package Ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del curso: ");
        String codigo = scanner.next();
        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.next();
        Curso curso = new Curso(codigo, nombreCurso);

        while (true) {
            System.out.println("Sistema de Gestión de Cursos:");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Eliminar Estudiante");
            System.out.println("3. Lista Estudiantes");
            System.out.println("4. Buscar Estudiante por Nombre");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del estudiante: ");
                    int id = scanner.nextInt();
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombreEstudiante = scanner.next();
                    System.out.print("Ingrese el email del estudiante: ");
                    String email = scanner.next();

                    Estudiante estudiante = new Estudiante(id, nombreEstudiante, email);
                    curso.agregarEstudiante(estudiante);
                    break;

                case 2:
                    System.out.print("Ingrese el ID del estudiante a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    curso.eliminarEstudiante(idEliminar);
                    break;

                case 3:
                    curso.listarEstudiantes();
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBuscar = scanner.next();
                    Estudiante estudianteEncontrado = curso.buscarPorNombre(nombreBuscar);
                    if (estudianteEncontrado != null) {
                        estudianteEncontrado.mostrarInformacion();
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 5:
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
