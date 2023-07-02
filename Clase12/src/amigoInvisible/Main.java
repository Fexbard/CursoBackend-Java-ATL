package amigoInvisible;
/*Armar un programa que organice un amigo invisible Este programa debe permitir a los participantes ingresar sus nombres.
* Luego cada participante debe sentarse frente a la computadora, escribir su nombre y recibir una indicación sobre a quién
* debe darle el regalo. El programa también debe limpiar la consola después de que cada participante haya visto su indicación*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("Bienvenidos al Juego del Amigo Invisible");
        System.out.println("********************************************");
        Scanner scanner = new Scanner(System.in);
        List<String> participantes = new ArrayList<String>();
        System.out.println("¿Cuántos participantes habrá?");
        int numParticipantes = scanner.nextInt();

        armarListaDeAmigos(participantes, numParticipantes);

        System.out.println("Excelente, ya tenemos a todos los participantes");
        System.out.println("Es hora de saber quién será tu amigo invisible");
//        System.out.println(participantes.size());
        List<String> elegidos = new ArrayList<String>();
        for (int i = 0; i < participantes.size(); i++) {
            System.out.println("Dime tu nombre por favor para elegir a tu amigo invisible ");
            String name = scanner.next();
            elegirAmigos(participantes, elegidos, name);
        }
    }
    public static void armarListaDeAmigos(List<String> participantes, int numParticipantes) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numParticipantes; i++) {
            System.out.println("Ingrese su nombre por favor");
            String participante = scanner.next();
            System.out.println("Muchas gracias " + participante);
            participantes.add(participante);
        }
        System.out.println("");
        System.out.println("Los participantes son:\n" + participantes);
    }

    public static void elegirAmigos(List<String> participantes, List<String> elegidos, String name) {
    boolean valor = false;
        do {
            int numberRandom = (int) Math.floor(Math.random() * participantes.size());
            String participante = participantes.get(numberRandom);

            if (participante.equalsIgnoreCase(name) || elegidos.contains(participante)) {
                //           int SecondNumberRandom = (int)Math.floor(Math.random() *participantes.size());
                continue;
//            participantes.get(SecondNumberRandom);
//            System.out.println("Su amigo invisible es: "+participantes.get(SecondNumberRandom));
//            elegidos.add(participantes.get(SecondNumberRandom));
            } else {
                System.out.println("Tu amigo invisible es: " + participante);
                elegidos.add(participante);
                valor = true;
            }

        } while (!valor);

    }
}