package Clase5;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
/*1) Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).*/

        System.out.println("Ingrese la edad de u perro");
        System.out.println("*************");
        Scanner scanner = new Scanner(System.in);
        int edadPerro = scanner.nextInt();
        int EdadPerroHumano = edadPerro*7;
        System.out.println("La edad de su bicho es "+EdadPerroHumano);
    }
}
