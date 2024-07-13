import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner scaneer = new Scanner(System.in);

        String arrayConPalabrasRepetidas[] = {"Hola", "Adios", "Hola", "Buena", "Adios", "Hola"};

        Map<String, Integer> conteos = new HashMap<>();

        for (String nombres : arrayConPalabrasRepetidas) {
            conteos.put(nombres, conteos.getOrDefault(nombres, 0) + 1);
        }
        System.out.println();
        System.out.println(conteos);

        

        scaneer.close();
        
    }
}
