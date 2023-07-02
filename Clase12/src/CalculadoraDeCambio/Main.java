package CalculadoraDeCambio;

import java.util.Scanner;

/*Crear un programa que funcione como una calculadora de cambio: Este programa debe recibir como entrada una
    cantidad de dinero y el costo de un producto. Utilizando la resta, el programa debe calcular el cambio que se
    debe entregar al cliente y mostrar la cantidad de billetes y monedas necesarios para el cambio.*/
public class Main {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("Calculadora de Cambio");
        System.out.println("********************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor del producto");
        double valorProducto = scanner.nextDouble();
        System.out.println("Por favor ingrese con cuánto pagará el producto");
        double pago = scanner.nextDouble();
        double cambio= pago-valorProducto;
        int valorEnteroCambio = (int)cambio;
        double CambioEnMonedas= cambio-valorEnteroCambio;

        System.out.println("Su cambio es: "+cambio+"\n"+"La cantidad de billetes es: "+valorEnteroCambio+"\n"+"La cantidad de monedas es: "+CambioEnMonedas);
        /*Tomo la parte entera y se la resto a la parte double y luego la guardo en una variable y le pongo los céntimos*/


    }
}
