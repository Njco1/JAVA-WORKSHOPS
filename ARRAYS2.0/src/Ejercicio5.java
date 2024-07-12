import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sr usuario, ingrese un texto cualquiera: ");
        String texto = scanner.nextLine();

        System.out.println("Sr usuario, ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();


        String textoMinusculas = texto.toLowerCase();
        String palabraMinusculas = palabra.toLowerCase();

        int index = 0;
        boolean encontrado = false;

        while ((index = textoMinusculas.indexOf(palabraMinusculas, index)) != -1) {
            encontrado = true;
            System.out.println("Palabra encontrada en el rango de posiciones: " + index + " - " + (index + palabraMinusculas.length() - 1));
            index += palabraMinusculas.length();
        }

        if (!encontrado) {
            System.out.println("La palabra no se encontró en el texto.");
        }


        scanner.close();

    }
}
