import java.util.Random;

/*
Crea un programa java que trabaje con un array de 10 posiciones
* en el que cada elemento será un número entero comprendido entre
* 0 y 9 (ambos incluidos).
* Crea un array de frecuencias donde cada posición i indica
* cuántas veces aparece el número i en el array original
*/
public class EjercicioExtra {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int i;
        int contador = 0;
        int[] frecuencias = new int[10];

        for (i = 0; i < numeros.length; i++) {
            numeros[i] = new Random().nextInt(10);
        }

        for (i = 0; i < frecuencias.length; i++) {
            contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == i){
                    contador++;
                }
            }
            frecuencias[i] = contador;
        }

        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        for (i = 0; i < frecuencias.length; i++) {
            System.out.print(frecuencias[i] + " ");
        }
        System.out.println();
        int max = 0;
        int k;
        int posicion = 0;
        for (k = 0; k < numeros.length; k++) {
            if (frecuencias[k] > max) {
                max = frecuencias[k];
                posicion = k;
            }
        }
        System.out.println("Maximo: " + max + " - Posición: " + posicion);
    }
}
