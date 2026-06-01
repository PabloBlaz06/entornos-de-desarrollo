package ejerciciosRepaso.array;

import java.util.Arrays;

public class ArrayAleatorio {
    static void main(String[] args) {
         int[] numeros = new int[20];

         for (int i = 0; i < numeros.length; i++) {
             numeros[i] = (int) (Math.random() * 100) + 1;
         }
        // mOSTRA ELEMENTOS
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        // Máximo
        int maximo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        // Mínimo
        int minimo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        // Media
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double media = (double) suma / numeros.length;
        // Multiplos de 5
        // Máximo
        int contadorMultiplos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 5 == 0) {
                contadorMultiplos++;
            }
        }
        // Array de elementos únicos
        int[] numerosTemp = new int[20];
        int contador = 0;
        boolean repetido;
        for (int i = 0; i < numeros.length; i++) {
            repetido = false;
            for (int j = 0; j < contador; j++) {
                if (numeros[i] == numerosTemp[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numerosTemp[contador] = numeros[i];
                contador ++;
            }
        }
        numerosTemp = Arrays.copyOf(numerosTemp, contador);
        // Resultados
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + media);
        System.out.println("Multiplos de 5: " + contadorMultiplos);
        System.out.println("Elementos únicos: " + Arrays.toString(numerosTemp));





    }
}
