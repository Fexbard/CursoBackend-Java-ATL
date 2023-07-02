package ListaReproduccionSpotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Armar un programa que funcione como una lista de reproducción de Spotify simple: El programa debe permitir
    al usuario agregar canciones a una lista de reproducción. Cada canción debe tener atributos como título,
    artista y duración. El programa debe permitir reproducir las canciones en orden y mostrar la información de la
    canción que se está reproduciendo en ese momento*/
public class Main {
    public static void main(String[] args) {
        // Duration duration = new Duration();
        System.out.println("********************************************");
        System.out.println("Reproductor de Música Spotify");
        System.out.println("********************************************");
        Scanner scanner = new Scanner(System.in);
        List<ReproductorDeCanciones> songList = new ArrayList<>();
        do {
            System.out.println("Hola, deseas agregar canciones (add) o reproducir canciones(play)?");
            String action = scanner.nextLine();
            if (action.equals("add")) {
                //Aquí podría llamar a un método que agregue canciones, así el código queda más limpio
                addSong(songList);
            } else {
//        String[] partes = preDuration.split(":");
//        int horas = Integer.parseInt(partes[0]);
//        int minutos = Integer.parseInt(partes[1]);
//        int segundos = Integer.parseInt(partes[2]);
//       Duration duration = Duration.ofHours(horas).plusMinutes(minutos).plusSeconds(segundos);

                reproducir(songList);
                break;
            }
        } while (true);
    }
    public static void reproducir(List<ReproductorDeCanciones> songList) {
        for (ReproductorDeCanciones song: songList){
            System.out.println(song);
        }

    }
    public static void addSong(List<ReproductorDeCanciones> songList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título de la canción");
        String title = scanner.nextLine();
        System.out.println("Ingrese el artista");
        String artist = scanner.nextLine();
        System.out.println("Ingrese la duración hr:min:sec/0:02:20");
        String duration = scanner.nextLine();
        ReproductorDeCanciones song1 = new ReproductorDeCanciones(title, artist, duration);
        songList.add(song1);
        System.out.println("¿Desea seguir agregando canciones? si/no");
        String continua= scanner.nextLine();
        if (continua.equals("no")) {
            System.out.println("Hasta Pronto");

        }
    }
}























































































