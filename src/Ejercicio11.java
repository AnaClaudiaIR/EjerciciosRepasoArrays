import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimensión: ");
        int dimension = sc.nextInt();

        int[] A = new int[dimension];
        int[] B = new int[dimension];
        int[] C = new int[dimension];

        System.out.println("Array A: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingresa el valor: ");
            A[i] = sc.nextInt();
        }

        System.out.println("Array B: ");
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingresa el valor: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < dimension; i++) {
            if(A[i]>0&&B[i]>0){
                C[i]=A[i]+B[i];
            } else {
                C[i] = 0;
            }
        }
        System.out.println("\nArray A: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\nArray B: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("\nArray C: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
