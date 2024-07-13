import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Consultas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        /*ARRAYLIST */

        /*Un ArrayList es una clase en Java que proporciona una implementación redimensionable de la interfaz 
        List. A diferencia de los arrays normales en Java,que tienen un tamaño fijo, los ArrayList pueden 
        cambiar de tamaño dinámicamente, permitiendo agregar y eliminar elementos de manera flexible. 
        Los ArrayList son parte del paquete java.util. */

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        System.out.println("ArrayList de enteros: " + numeros);

        // Obtener un elemento en una posición específica
        int num = numeros.get(2);
        System.out.println("Elemento en la posición 2: " + num);

        // Modificar un elemento en una posición específica
        numeros.set(1, 25);
        System.out.println("ArrayList después de modificar: " + numeros);

        // Eliminar un elemento en una posición específica
        numeros.remove(3); 
        System.out.println("ArrayList después de eliminar: " + numeros);

        // Tamaño del ArrayList
        int size = numeros.size();
        System.out.println("Tamaño del ArrayList: " + size);

        // Comprobar si un elemento está en el ArrayList
        boolean contains = numeros.contains(20);
        System.out.println("¿Contiene el número 20? " + contains);


        /*MAP */

        /*Un Map es una colección en Java que mapea claves únicas a valores. A diferencia de las listas 
        (List) y conjuntos (Set), que solo almacenan elementos individuales, los Map almacenan pares de claves 
        y valores. Algunas implementaciones comunes de Map son HashMap, TreeMap, y LinkedHashMap.*/

        Map<Integer, String> estudiantes = new HashMap<>();

        // Agregar elementos al Map
        estudiantes.put(1, "Juan");
        estudiantes.put(2, "María");
        estudiantes.put(3, "Pedro");
        estudiantes.put(4, "Ana");

        // Imprimir el Map
        System.out.println("Map de estudiantes: " + estudiantes);

        // Obtener un valor en función de su clave
        String nombre = estudiantes.get(2); 
        System.out.println("Estudiante con clave 2: " + nombre);

        // Modificar un valor en función de su clave
        estudiantes.put(3, "Carlos"); 
        System.out.println("Map después de modificar: " + estudiantes);

        // Eliminar un valor en función de su clave
        estudiantes.remove(4); 
        System.out.println("Map después de eliminar: " + estudiantes);

        // Tamaño del Map
        int size1 = estudiantes.size();
        System.out.println("Tamaño del Map: " + size1);

        // Comprobar si una clave está en el Map
        boolean contieneClave = estudiantes.containsKey(1);
        System.out.println("¿Contiene la clave 1? " + contieneClave);

        // Comprobar si un valor está en el Map
        boolean contieneValor = estudiantes.containsValue("María");
        System.out.println("¿Contiene el valor 'María'? " + contieneValor);


        /*POO*/

        

        scanner.close();


    }
}
