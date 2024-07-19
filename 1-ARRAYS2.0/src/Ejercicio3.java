import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int [7];

        System.out.println("Ingrese las notas que lleva hasta el momento: ");

        notas[0] = scanner.nextInt();
        notas[1] = scanner.nextInt();
        notas[2] = scanner.nextInt();
        notas[3] = scanner.nextInt();
        notas[4] = scanner.nextInt();
        notas[5] = scanner.nextInt();
        notas[6] = scanner.nextInt();


        if (notas[1] != 0) {
            int Suma = notas[0] + notas[1];
            if (notas[2] != 0) {
                int suma1 = Suma + notas[2];
                if (notas[3] != 0) {
                    int suma2 = suma1 + notas[3];
                    if (notas[4] != 0) {
                        int suma3 = suma2 + notas[4];
                        if (notas[5] != 0) {
                            int suma4 = suma3 + notas[5];
                            if (notas[6] != 0) {
                            }else{
                                System.out.println("El promedio de notas que llevas hasta el momento es: " + suma4/8);
                                int restante = 608 - suma4;
                                System.out.println("La calificacion promedio que debes sacar en el resto de tus notas es: " + restante/3);
                            }
                            
                        }else{
                            System.out.println("El promedio de notas que llevas hasta el momento es: " + suma3/8 );
                            int restante1 = 608 - suma3;
                            System.out.println("La calificacion promedio que debes sacar en el resto de tus notas es: " + restante1/4);
                        }
                    }else{
                        System.out.println("El promedio de notas que llevas hasta el momento es: " + suma2/8 );
                        int restante2 = 608 - suma2;
                        System.out.println("La calificacion promedio que debes sacar en el resto de tus notas es: " + restante2/5);
                    }
                }
            }
        }


        scanner.close();
    }
}