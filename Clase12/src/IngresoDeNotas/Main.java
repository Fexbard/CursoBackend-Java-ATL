package IngresoDeNotas;

import java.util.ArrayList;
import java.util.List;

/*Crear un programa para ingresar las notas de alumnos utilizando programación orientada a objetos:
        El programa debe permitir al usuario cargar las notas de varios alumnos. Cada alumno debe tener atributos
        como nombre, apellido y una lista de notas. */
public class Main {
    public static void main(String[] args) {
        List<Double>gradesAlumno1 = new ArrayList<>();
        gradesAlumno1.add(10.0);
        gradesAlumno1.add(6.8);
        gradesAlumno1.add(8.1);
        gradesAlumno1.add(7.0);

        Alumnos alumno1 = new Alumnos("Carlos","Raí",gradesAlumno1);
        System.out.println(alumno1);

    }

}
