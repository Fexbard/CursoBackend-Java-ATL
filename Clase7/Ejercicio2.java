package Clase7;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/*Mostrar el número mayor y el número menor del array creado.*/

public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    /* Creaión del Array*/

    int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++){
        System.out.println("Ingrese el valor: " + (i+1));
        numeros[i] = scanner.nextInt();
    }
        /* Obtención del Mayor y Menor valor*/

        int numMayor = numeros[0];
        int numMenor = numeros[0];
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]>numMayor){
                numMayor= numeros[i];
            } else if (numeros[i]<numMenor) {
                numMenor = numeros[i];
            }
        }
        /* Impresión de los valores*/

        System.out.println("Los valores ingresados son: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("El valor Mayor es: " + numMayor);
        System.out.println("El valor Menor es: " + numMenor);

    }
}
