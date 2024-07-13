import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String nombres[] = {"Nicolas", "Maria Jose", "David", "Sebastian", "Alejandro"};

        System.out.println("Sr usuario, ingrese un nombre: ");
        String nombreBuscado = scanner.nextLine();



        String nombreBuscadoMinusculas = nombreBuscado.toLowerCase();

        boolean found = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().equals(nombreBuscadoMinusculas)) {
                System.out.println("Nombre encontrado en la posición: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("El nombre no se encuentra en el array.");
        

        scanner.close();

    }
    }
}
