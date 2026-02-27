import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension = 3;

        int[][]matriz = new int[dimension][dimension];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //SUMA FILAS
        int sumaFila1 = 0;
        int sumaFila2 = 0;
        int sumaFila3 = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            sumaFila1 += matriz[0][i];
        }
        System.out.println("\nSuma de fila 1: " + sumaFila1);

        for (int i = 0; i < matriz[1].length; i++) {
            sumaFila2 += matriz[1][i];
        }
        System.out.println("Suma de fila 2: " + sumaFila2);

        for (int i = 0; i < matriz[2].length; i++) {
            sumaFila3 += matriz[2][i];
        }
        System.out.println("Suma de fila 3: " + sumaFila3);

        //SUMA COLUMNAS
        int sumaColumna1 = 0;
        int sumaColumna2 = 0;
        int sumaColumna3 = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumaColumna1 += matriz[i][0];
        }
        System.out.println("\nSuma de columna 1: " + sumaColumna1);

        for (int i = 0; i < matriz.length; i++) {
            sumaColumna2 += matriz[i][1];
        }
        System.out.println("Suma de columna 2: " + sumaColumna2);

        for (int i = 0; i < matriz.length; i++) {
            sumaColumna3 += matriz[i][2];
        }
        System.out.println("Suma de columna 3: " + sumaColumna3);

        //SUMA DIAGONAL
        int sumaDiagonal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==j){
                    sumaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.println("\nSuma diagonal: " + sumaDiagonal);
    }
}
