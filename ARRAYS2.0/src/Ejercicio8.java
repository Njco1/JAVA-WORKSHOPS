import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Sr usuario, cuantas columnas desea ingresar: ");
        int Columnas = scanner.nextInt();
        System.out.println("Sr usuario, cuantas filas desea ingresar: ");
        int Filas = scanner.nextInt();


        int [][] matrizVacia = new int [Columnas][Filas];

        System.out.println("ingrese datos a la matriz: ");
        for (int i = 0; i < Columnas; i++) {
            for (int j = 0; j < Filas; j++) {
                matrizVacia[i][j]=scanner.nextInt();
            }
        }
    

        for (int i = 0; i < Columnas; i++) {
            for (int j = 0; j < Filas; j++) {
                System.out.print(matrizVacia[i][j]+" ");
            }
            System.out.println();
        }

        if (Columnas == Filas) {
            System.out.println("Es una matriz simetrica");
        }

        scanner.close();

    }
}
