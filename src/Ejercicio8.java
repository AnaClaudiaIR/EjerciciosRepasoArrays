import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dimensión: ");
        int dimension = sc.nextInt();
        double[] notas = new double[dimension];

        for(int i = 0; i < dimension; i++){
            System.out.println("Introduce la nota: ");
            notas[i] = sc.nextDouble();
        }
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double media = suma / notas.length;
        System.out.println("\nLa media es: " + media);

        double maximo = notas[0];
        for(int i = 0; i < notas.length; i++) {
            if (notas[i] > maximo){
                maximo = notas[i];
            };
        }
        double minimo = notas[0];
        for(int i = 0; i < notas.length; i++) {
            if (notas[i] < minimo){
                minimo = notas[i];
            }
        }
        System.out.println("\nEl máximo es: " + maximo);
        System.out.println("El mínimmo es: " + minimo);

        int contador = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 5){
                contador++;
            }
        }
        double porcentaje = Math.round((double) (contador*100)/notas.length);
        System.out.println("\nEl porcentaje de aprobados es: " + porcentaje + "%");
    }
}
