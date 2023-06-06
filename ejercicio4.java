package Clase5;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
         /* 4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).*/
        System.out.println("Calculadora de propinas");
        System.out.println("*************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta");
        double cuenta = scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        double propina = scanner.nextDouble();
        double valorPropina = cuenta * (propina / 100);

        System.out.println("La propina que debe dejar es: $" + valorPropina);
    }
}
