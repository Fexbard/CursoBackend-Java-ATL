package Clase5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
/*5) Juego de adivinar el número:
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/
        System.out.println("Juego de adivinar el número");
        System.out.println("*************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué número cree que saldrá?");
        double numeroElegido = scanner.nextDouble();
        double number= Math.floor(Math.random()*100 +1);
        if (numeroElegido == number){
            System.out.println("Felicitaciones, has adivinado!!");
        }else{
            System.out.println("Mala suerte,el número fue "+ number+ " sigue intentando");
    }
}}
