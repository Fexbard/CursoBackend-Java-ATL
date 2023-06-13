package Clase7;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;

/*Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.*/

public class Ejercicio1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
        System.out.println("Por favor ingrese el valor: " + (i+1));
        numeros[i] = scanner.nextInt();
    }
        System.out.println("Los valores ingresados son: ");
        System.out.println(Arrays.toString(numeros));

    }
}
