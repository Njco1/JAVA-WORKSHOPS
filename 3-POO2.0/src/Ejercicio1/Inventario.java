package Ejercicio1;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id);
    }

    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }

    public Producto buscarPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public ArrayList<ProductoEspecifico> buscarPorCategoria(String categoria) {
        ArrayList<ProductoEspecifico> resultados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto instanceof ProductoEspecifico) {
                ProductoEspecifico prodEsp = (ProductoEspecifico) producto;
                if (prodEsp.getCategoria().equalsIgnoreCase(categoria)) {
                    resultados.add(prodEsp);
                }
            }
        }
        return resultados;
    }
}