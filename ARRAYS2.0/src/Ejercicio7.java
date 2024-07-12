import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int [][] matrix = new int[2][3];

                matrix[0][0] = 3;
                matrix[0][1] = 3;
                matrix[0][2] = 3; 
                
                matrix[1][0] = 1; 
                matrix[1][1] = 1;
                matrix[1][2] = 1; 
        
                for(int fila = 0; fila < 2; fila++){
                    System.out.println("Fila "+ fila);
                    for(int col = 0; col < 3; col++){
                        System.out.println("Columna "+ col);
                    }
                }

        scanner.close();

    }
}
