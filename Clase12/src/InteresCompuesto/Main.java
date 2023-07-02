package InteresCompuesto;

import java.util.Scanner;

/*Crear un programa para calcular el interés compuesto: Este programa debe permitir al usuario ingresar
        el capital inicial, la tasa de interés y el tiempo en años. Utilizando la fórmula del interés compuesto,
        el programa debe calcular el monto total acumulado y mostrarlo al usuario.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("********************************************");
        System.out.println("Calculadora de Interés Compuesto");
        System.out.println("********************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese su capital inicial");
        double capitalInicial = scanner.nextDouble();
        System.out.println("Por favor ingrese la tasa de interés");
        double tasaInteres = scanner.nextDouble();
        System.out.println("Ahora ingrese el tiempo en años");
        double tiempo = scanner.nextDouble();

        calcularInteres(capitalInicial,tasaInteres,tiempo);

    }

    public static void calcularInteres(double capitalInicial, double tasaInteres ,double tiempo){

        double monto = capitalInicial * Math.pow(1 + tasaInteres,tiempo);
        System.out.println("El monto acumulado es: "+monto);
    }

}
