package IngresoDeNotas;

import java.util.List;

public class Alumnos {
    String name;
    String lastName;
    List<Double> grades;

    public Alumnos() {
    }

    public Alumnos(String name, String lastName, List<Double> grades) {
        this.name = name;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                '}';
    }
}

