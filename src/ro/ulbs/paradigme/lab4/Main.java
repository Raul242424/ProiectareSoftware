package ro.ulbs.paradigme.lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        List<Student> studenti = new ArrayList<>();

        studenti.add(new Student("Ion", "Popescu", "101", generateRandomGrades(rand)));
        studenti.add(new Student("Maria", "Ionescu", "102", generateRandomGrades(rand)));
        studenti.add(new Student("Andrei", "Vasilescu", "101", generateRandomGrades(rand)));
        studenti.add(new Student("Elena", "Georgescu", "103", generateRandomGrades(rand)));
        studenti.add(new Student("Bogdan", "Dumitru", "102", generateRandomGrades(rand)));

        System.out.println("Studenti initiali:");
        for (Student student : studenti) {
            System.out.println(student);
        }

        System.out.println("\nb1) Sortare alfabetică pe grupe:");
        studenti.stream()
                .sorted(Comparator.comparing(Student::getGrupa)
                        .thenComparing(Student::getNume)
                        .thenComparing(Student::getPrenume))
                .forEach(System.out::println);

        System.out.println("\nb2) Sortare descrescătoare a mediilor pentru integraliști:");
        studenti.stream()
                .filter(student -> student.getNumarRestante() == 0)
                .sorted(Comparator.comparingDouble(Student::getMedie).reversed())
                .forEach(System.out::println);

        System.out.println("\nb3) Sortare crescătoare a numărului de restanțe pentru restanțieri:");
        studenti.stream()
                .filter(student -> student.getNumarRestante() > 0)
                .sorted(Comparator.comparingInt(Student::getNumarRestante))
                .forEach(System.out::println);
    }

    private static List<Integer> generateRandomGrades(Random rand) {
        List<Integer> grades = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            grades.add(rand.nextInt(7) + 4);
        }
        return grades;
    }
}