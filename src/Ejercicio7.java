import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dimensión: ");
        int dimension = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[dimension];

        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)((Math.random()*100)+1);
        }

        System.out.println("La lista de números es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double media = (double) suma / numeros.length;
        System.out.println("\nLa media es: " + media);

        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                contador++;
            }
        }
        System.out.println("\nNúmeros mayores que la media: " + contador);
    }
}
