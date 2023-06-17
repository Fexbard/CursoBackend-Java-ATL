package Clase8.src;

import java.util.Scanner;

/*Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos y bucles.*/
public class piedraPapelTijera {
    public static void main(String[] args) {

        String resultado =jugar();
    }

    public static String jugar(){
        Scanner scanner= new Scanner(System.in);
        String[] movimientoMaquina = {"piedra","papel","tijera"};
        System.out.println("Juego de Piedra Papel o Tijera");
        boolean ganador=false;

        while (ganador == false){
            System.out.println("Ingrese su elección");
            String jugador1=scanner.next();
            String jugador2 = movimientoMaquina[(int)Math.floor(Math.random()*movimientoMaquina.length)];

        if (jugador1.equalsIgnoreCase("Piedra")&&jugador2.equalsIgnoreCase("Piedra")
                ||jugador1.equalsIgnoreCase("Papel")&&jugador2.equalsIgnoreCase("Papel")
                || jugador1.equalsIgnoreCase("tijera")&&jugador2.equalsIgnoreCase("tijera")){
            System.out.println(jugador1+ " VS "+ jugador2 );
            System.out.println("Usted ha empatado");
            System.out.println("¿Desea continuar? si/no");
            String continua = scanner.next();
            if (continua.equalsIgnoreCase("no")){
                ganador = true;
            }
//            return "Usted ha empatado con la máquina";
        } else if (jugador1.equalsIgnoreCase("Piedra")&&jugador2.equalsIgnoreCase("Tijera")
                ||jugador1.equalsIgnoreCase("Papel")&&jugador2.equalsIgnoreCase("Piedra")
                ||jugador1.equalsIgnoreCase("Tijera")&&jugador2.equalsIgnoreCase("Papel")){
            System.out.println(jugador1+" VS "+ jugador2 );
            System.out.println("Usted ha ganado, felicitaciones");
            ganador = true;
            break;
        }else
            System.out.println(jugador1+" VS "+ jugador2 );
            System.out.println("Usted ha perdido");
            System.out.println("¿Desea continuar? si/no");
            String continua = scanner.next();
            if (continua.equalsIgnoreCase("no")){
                ganador = true;
            }
    }   return "";

    }

}