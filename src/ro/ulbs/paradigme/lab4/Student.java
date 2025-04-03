package ro.ulbs.paradigme.lab4;

import java.util.*;

class Student {
    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;
    private int numarRestante;

    public Student(String nume, String prenume, String grupa, List<Integer> note) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = note;
        this.numarRestante = (int) note.stream().filter(n -> n < 5).count();
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public List<Integer> getNote() {
        return note;
    }

    public int getNumarRestante() {
        return numarRestante;
    }

    public double getMedie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " (" + grupa + ") - Note: " + note + " - Medie: " + getMedie() + " - Restante: " + numarRestante;
    }
}

