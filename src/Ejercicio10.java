import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int[]copiaNumeros = new int[10];
        int indice = 0;
        boolean duplicado;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            duplicado = false;
            for (int j = 0; j < indice; j++) {
                if (numeros[i] == copiaNumeros[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                copiaNumeros[indice] = numeros[i];
                indice++;
            }
        }
        System.out.println("Lista sin duplicados");
        for (int copiaNumero : copiaNumeros) {
            System.out.print(copiaNumero + " ");
        }
        System.out.println("\nLista con duplicados");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
