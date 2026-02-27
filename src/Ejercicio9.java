import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimensión: ");
        int dimension = sc.nextInt();

        int[] numeros = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el valor: ");
            numeros[i] = sc.nextInt();
        }

        int[] reversos = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            reversos[i] = numeros[dimension-i-1];
        }

        System.out.println("Invertido");
        for (int i = 0; i < dimension; i++) {
            System.out.print(reversos[i] + " ");
        }
        System.out.println("\nOriginal");
        for (int i = 0; i < dimension; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
