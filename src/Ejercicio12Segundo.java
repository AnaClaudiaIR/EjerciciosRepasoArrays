import java.util.Scanner;

public class Ejercicio12Segundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dimensión 1: ");
        int dimension1 = sc.nextInt();

        System.out.println("Dimensión 2: ");
        int dimension2 = sc.nextInt();

        int[][]matriz = new int[dimension1][dimension2];

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
        int[] sumaFilas = new int[dimension1];

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            sumaFilas[i] = sumaFila;
        }
        //SUMA COLUMNAS
        int[] sumaColumnas = new int[dimension2];

        for (int i = 0; i < dimension2; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < dimension1; j++) {
                sumaColumna += matriz[j][i];
            }
            sumaColumnas[i] = sumaColumna;
        }

        if (dimension1 == dimension2) {
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
        System.out.println("\nSuma de filas:");
        for (int j = 0; j < sumaFilas.length; j++) {
            System.out.print(sumaFilas[j] + " ");
        }
        System.out.println("\nSuma de columnas:");
        for (int j = 0; j < sumaColumnas.length; j++) {
            System.out.print(sumaColumnas[j] + " ");
        }
    }
}
