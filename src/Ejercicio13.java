import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dimensión: ");
        int dimension = sc.nextInt();

        int[][] matriz = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random() * 9)+1);
            }
        }

        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (matriz[i][j] == matriz[j][i]) {
                    contador++;
                }
            }
            System.out.println();
        }
        if (contador == dimension*dimension) { //la condición de antes se cumple siempre si es simétrica
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz no es simétrica.");
        }
    }
}
