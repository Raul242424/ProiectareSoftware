package ro.ulbs.paradigme.lab9;

import java.util.*;
import java.util.stream.Collectors;

public class Main933
{
    public static void main(String[] args)
    {
        List<String> cuvinte = Arrays.asList(
                "Acesta", "este", "un", "program", "scris", "cu", "java", "8", "si", "expresii", "lambda"
        );
        List<String> cuvinteLungi = cuvinte.stream()
                .filter(cuv -> cuv.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvinte cu lungimea >= 5: " + cuvinteLungi);
        System.out.println("Numar de cuvinte lungi: " + cuvinteLungi.size());
        List<String> cuvinteLungiSortate = cuvinteLungi.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Lista sortata: " + cuvinteLungiSortate);
        Optional<String> cuvantCuP = cuvinte.stream()
                .filter(cuv -> cuv.startsWith("p"))
                .findFirst();

        cuvantCuP.ifPresent(cuv -> System.out.println("Cuvant care incepe cu 'p': " + cuv));
    }
}
