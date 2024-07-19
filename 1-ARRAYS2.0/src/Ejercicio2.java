import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String productos[] = {"Arroz", "Leche", "Carne", "Pollo"};
        int precios[] = {5600, 5000, 12000, 7600};

        System.out.println("Sr cliente, que articulo desea comprar?: ");
        String articulo = scanner.nextLine();

        if (articulo == productos[0]) {
            System.out.println("Quieres comprar " + articulo + " cuanta cantidad deseas?: ");
            int cantidad = scanner.nextInt();
            System.out.println("Compraste " + cantidad + "de " + articulo + " , cada uno cuesta: " + precios[0] + " el total de tu compra es: " + precios[0] * cantidad);
        }

        scanner.close();

    }
}
