package Clase5;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        /*   3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.*/

        System.out.println("Calculadora de descuento");
        System.out.println("*************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precioProducto = scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento del producto");
        double descuento = scanner.nextDouble();
        double precioFinal= precioProducto-(precioProducto*descuento/100);
        System.out.println("El precio final con descuento incluído es: " + precioFinal);
    }
}
