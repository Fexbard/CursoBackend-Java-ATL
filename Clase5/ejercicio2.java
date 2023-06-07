package Clase5;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
/* 2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.*/

        System.out.println("Ingrese la distancia en millas que desea convertir");
        System.out.println("*************");
        Scanner scanner = new Scanner(System.in);
        double distanciaMillas = scanner.nextDouble();
        double distanciaKm = distanciaMillas*1.60934;
        System.out.println("La distancia es "+distanciaKm+" kilómetros");
    }
}
