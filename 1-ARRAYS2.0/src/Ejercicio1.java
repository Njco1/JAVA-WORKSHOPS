import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sr usuario, ¿que desea sea realizar? 1:suma 2:resta, 3: multiplicacion, 4: division: ");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
            System.out.println("Ingrese el primer numero");
            int numeroUno = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numeroDos = scanner.nextInt();

            int Suma = numeroUno + numeroDos;
            System.out.println("La suma de " + numeroUno + " y " + numeroDos + " Es igual a: " + Suma);
                break;
        
            case "2":
            System.out.println("Ingrese el primer numero");
            int numeroUnoResta = scanner.nextInt();
            System.out.println("Ingrese el segundo numero");
            int numeroDosResta = scanner.nextInt();
    
            int Resta = numeroUnoResta - numeroDosResta;
            System.out.println("La Resta de " + numeroUnoResta + " y " + numeroDosResta + " Es igual a: " + Resta);
                break;

            case "3":
                System.out.println("Ingrese el primer numero");
                int numeroUnoMutiplicacion = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                int numeroDosMultiplicacion = scanner.nextInt();

                int Multiplicacion = numeroUnoMutiplicacion * numeroDosMultiplicacion;
                System.out.println("La Multiplicacion de " + numeroUnoMutiplicacion + " y " + numeroDosMultiplicacion + " Es igual a: " + Multiplicacion);
                    break;

            case "4":
                System.out.println("Ingrese el primer numero");
                int numeroUnoDivision = scanner.nextInt();
                System.out.println("Ingrese el segundo numero");
                int numeroDosDivison = scanner.nextInt();

                int Division = numeroUnoDivision / numeroDosDivison;
                System.out.println("La division de " + numeroUnoDivision + " y " + numeroDosDivison + " Es igual a: " + Division);
                    break;

            default:
                System.out.println("Valor incorrecto");
                break;
        }

        scanner.close();
    }
}
