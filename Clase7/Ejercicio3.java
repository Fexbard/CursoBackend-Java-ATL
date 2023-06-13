package Clase7;

import java.util.Arrays;
import java.util.Scanner;

    /*Mostrar el promedio. */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Creaión del Array*/

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor: " + (i + 1));
            numeros[i] = scanner.nextInt();
        }
        /* Obtención del Mayor y Menor valor*/

        int numMayor = numeros[0];
        int numMenor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
            } else if (numeros[i] < numMenor) {
                numMenor = numeros[i];
            }
        }
        /* Impresión de los valores*/

        System.out.println("Los valores ingresados son: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("El valor Mayor es: " + numMayor);
        System.out.println("El valor Menor es: " + numMenor);

        /* Obtención del promedio*/
        int sumaTotal=0;

        for (int i = 0; i < numeros.length; i++) {
            sumaTotal += numeros[i];
        }
        double promedioArray = (double) sumaTotal/5;
        System.out.println("El promedio es: "+promedioArray);
    }
}