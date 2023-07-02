package juegoPreguntasYRespuestas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("Bienvenidos al Juego de Preguntas y Respuestas");
        System.out.println("********************************************");
//        System.out.println("¿Desea jugar?");
        boolean value= false;
        do {
            System.out.println("¿Desea jugar?");
        String juega = scanner.nextLine();
        if (juega.equalsIgnoreCase("si")) {
            generarPregunta();
        }else {
            System.out.println("Quizás la próxima, gracias!!");
            value= true;
        }

        System.out.println("¿Desea continuar?");
        String reJuega = scanner.nextLine();
        if (reJuega.equalsIgnoreCase("si")) {
            generarPregunta();
        }else {
            System.out.println("Gracias por participar, nos vemos pronto!!");
            value= true;
        }}while (value==true);
    }
    public static void generarPregunta() {
        List<PreguntasRespuestas> preguntas = new ArrayList<PreguntasRespuestas>();
        preguntas.add(new PreguntasRespuestas("¿Cuál es el animal que es dos veces animal?","gato","Le gusta cazar ratones","Tiene garras y dice miau"));
        preguntas.add(new PreguntasRespuestas("¿Cuál es la capital de Francia?", "París", "Es conocida como la Ciudad de la Luz.", "La Torre Eiffel es uno de sus principales símbolos."));
        preguntas.add(new PreguntasRespuestas("¿Quién escribió Romeo y Julieta?", "Shakespeare", "Es considerado uno de los más grandes dramaturgos de todos los tiempos.", "También escribió obras como Hamlet y Macbeth."));
        preguntas.add(new PreguntasRespuestas("Completa la frase: La .... No se crea ni se destruye", "Energía", "Tomamos desayuno para tener mucha: ...", "Cuando no enciende un foco es por falta de :...."));
        preguntas.add(new PreguntasRespuestas("¿Quién pintó La Noche Estrellada?", "Van Gogh", "Tenía un hermano llamado Teo", "Se cortó la oreja"));
        preguntas.add(new PreguntasRespuestas("¿Qué planeta es conocido como el planeta rojo?", "Marte", "Se encuentra en el Sistema Solar", "Está justo después de la tierra"));


        Scanner scanner = new Scanner(System.in);
        PreguntasRespuestas preguntaRandom = preguntas.get((int) Math.floor(Math.random() * preguntas.size()));

        System.out.println(preguntaRandom.getPregunta());
        String answer1 = scanner.nextLine();
        if (preguntaRandom.getRespuesta().equalsIgnoreCase(answer1)) {
            System.out.println("Excelente, es correcto!!");
        }else {
            System.out.println("Incorrecto!"+ preguntaRandom.getPista1());
            String answer2= scanner.nextLine();
            if (preguntaRandom.getRespuesta().equalsIgnoreCase(answer2)) {
                System.out.println("Excelente, es correcto!!");
            }else {
                System.out.println("Incorrecto!"+ preguntaRandom.getPista2());
                String answer3= scanner.nextLine();
                if (preguntaRandom.getRespuesta().equalsIgnoreCase(answer3)) {
                    System.out.println("Finalmente lo has logrado!!");
                }else {
                    System.out.println("Lo siento, has fallado");
                }
            }
        }


    }

}


