import java.util.Scanner;

public class TallerDeMotosYCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la capacidad máxima del taller: ");
        int maxEmployees = scanner.nextInt();

        String[][][] trabajos = new String[maxEmployees][2][4];

        System.out.print("Ingrese el número de trabajos a registrar: ");
        int numTrabajos = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (numTrabajos > maxEmployees) {
            System.out.println("El número de trabajos supera la capacidad máxima del taller.");
            return;            
        }

        for (int i = 0; i < numTrabajos; i++) {
            System.out.print("Ingrese el nombre del empleado: ");
            String empleado = scanner.nextLine();

            System.out.print("Ingrese el tipo de vehículo (Moto/Carro): ");
            String tipoVehiculo = scanner.nextLine();
            int tipoIndex = tipoVehiculo.equalsIgnoreCase("Moto") ? 0 : 1;

            System.out.print("Ingrese la marca: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Ingrese el año: ");
            String año = scanner.nextLine();

            System.out.print("Ingrese el estado (Pendiente, En reparación, Reparado): ");
            String estado = scanner.nextLine();

            trabajos[i][tipoIndex][0] = marca;
            trabajos[i][tipoIndex][1] = modelo;
            trabajos[i][tipoIndex][2] = año;
            trabajos[i][tipoIndex][3] = estado;
        }

     /*La expresion "%-6s %-10s %-10s %-5s %-15s\n" no la entiendo bien, se que es para dar margenes y 
    imprimir la informacion en una especie de lista pero la consulte para que se vea organizada la informacion */


        System.out.println("Vehiculos en el taller:");
        System.out.printf("%-6s %-10s %-10s %-5s %-15s\n", "Tipo", "Marca", "Modelo", "Año", "Estado");
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null) {
                    String tipo = (j == 0) ? "Moto" : "Carro";
                    System.out.printf("%-6s %-10s %-10s %-5s %-15s\n", tipo, trabajos[i][j][0], trabajos[i][j][1], trabajos[i][j][2], trabajos[i][j][3]);
                }
            }
        }
    
        int pendientes = 0, enReparacion = 0, reparados = 0;
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][3] != null) {
                    switch (trabajos[i][j][3].toLowerCase()) {
                        case "pendiente":
                            pendientes++;
                            break;
                        case "en reparación":
                            enReparacion++;
                            break;
                        case "reparado":
                            reparados++;
                            break;
                    }
                }
            }
        }
        System.out.println("Vehículos pendientes: " + pendientes);
        System.out.println("Vehículos en reparación: " + enReparacion);
        System.out.println("Vehículos reparados: " + reparados);

        System.out.print("Ingrese la marca del vehículo a buscar: ");
        String marcaBuscar = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo a buscar: ");
        String modeloBuscar = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null && trabajos[i][j][0].equalsIgnoreCase(marcaBuscar) && trabajos[i][j][1].equalsIgnoreCase(modeloBuscar)) {
                    String tipo = (j == 0) ? "Moto" : "Carro";
                    System.out.printf("Vehículo encontrado: Tipo: %s, Marca: %s, Modelo: %s, Año: %s, Estado: %s\n", tipo, trabajos[i][j][0], trabajos[i][j][1], trabajos[i][j][2], trabajos[i][j][3]);
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }


        System.out.print("Ingrese la marca del vehículo a actualizar: ");
        String marcaActualizar = scanner.nextLine();
        System.out.print("Ingrese el modelo del vehículo a actualizar: ");
        String modeloActualizar = scanner.nextLine();
        System.out.print("Ingrese el nuevo estado: ");
        String nuevoEstado = scanner.nextLine();

        encontrado = false;
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null && trabajos[i][j][0].equalsIgnoreCase(marcaActualizar) && trabajos[i][j][1].equalsIgnoreCase(modeloActualizar)) {
                    trabajos[i][j][3] = nuevoEstado;
                    System.out.println("Estado actualizado correctamente.");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }

        
        System.out.println("Vehiculos en el taller:");
        System.out.printf("%-6s %-10s %-10s %-5s %-15s\n", "Tipo", "Marca", "Modelo", "Año", "Estado");
        for (int i = 0; i < maxEmployees; i++) {
            for (int j = 0; j < 2; j++) {
                if (trabajos[i][j][0] != null) {
                    String tipo = (j == 0) ? "Moto" : "Carro";
                    System.out.printf("%-6s %-10s %-10s %-5s %-15s\n", tipo, trabajos[i][j][0], trabajos[i][j][1], trabajos[i][j][2], trabajos[i][j][3]);
                }
            }
        }

        scanner.close();
    }
}