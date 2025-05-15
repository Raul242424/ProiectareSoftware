package ro.ulbs.paradigme.lab9;

import java.util.*;

import java.util.Arrays;
import java.util.List;

import java.util.*;
import java.util.stream.Collectors;

public class Main931 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lista = random.ints(10, 5, 26) // 26 este exclusiv, deci [5, 25]
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista generata: " + lista);
        int suma = lista.stream().mapToInt(Integer::intValue).sum();
        System.out.println("a) Suma elementelor: " + suma);

        int maxim = lista.stream().mapToInt(Integer::intValue).max().orElseThrow();
        int minim = lista.stream().mapToInt(Integer::intValue).min().orElseThrow();
        System.out.println("b) Maxim: " + maxim + ", Minim: " + minim);
        List<Integer> filtrata = lista.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());

        System.out.println("c) Lista filtrata [10..20]: " + filtrata);
        List<Double> listaDouble = lista.stream()
                .map(Integer::doubleValue)
                .collect(Collectors.toList());

        System.out.println("d) Lista ca Double: " + listaDouble);
        boolean contine12 = lista.contains(12);
        System.out.println("e) Lista contine valoarea 12? " + contine12);
    }
}


