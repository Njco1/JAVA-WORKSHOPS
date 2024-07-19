package Ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema de Control de Inventarios:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Listar Productos");
            System.out.println("4. Buscar Producto por Nombre");
            System.out.println("5. Buscar Productos por Categoria");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Tipo de producto (1 - General, 2 - Especifico): ");
                    int tipo = scanner.nextInt();

                    if (tipo == 1) {
                        Producto producto = new Producto(id, nombre, precio);
                        inventario.agregarProducto(producto);
                    } else {
                        System.out.print("Ingrese la categoria del producto: ");
                        String categoria = scanner.next();
                        System.out.print("Ingrese la marca del producto: ");
                        String marca = scanner.next();
                        ProductoEspecifico productoEspecifico = new ProductoEspecifico(id, nombre, precio, categoria, marca);
                        inventario.agregarProducto(productoEspecifico);
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    inventario.eliminarProducto(idEliminar);
                    break;

                case 3:
                    inventario.listarProductos();
                    break;

                case 4:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.next();
                    Producto productoEncontrado = inventario.buscarPorNombre(nombreBuscar);
                    if (productoEncontrado != null) {
                        productoEncontrado.mostrarInformacion();
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese la categoria del producto a buscar: ");
                    String categoriaBuscar = scanner.next();
                    ArrayList<ProductoEspecifico> productosEncontrados = inventario.buscarPorCategoria(categoriaBuscar);
                    if (!productosEncontrados.isEmpty()) {
                        for (ProductoEspecifico prod : productosEncontrados) {
                            prod.mostrarInformacion();
                        }
                    } else {
                        System.out.println("No se encontraron productos en esa categoria.");
                    }
                    break;

                case 6:
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