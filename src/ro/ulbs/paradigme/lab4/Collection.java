package ro.ulbs.paradigme.lab4;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        // a)
        xPlusY.addAll(x);
        xPlusY.addAll(y);

        // b)
        zSet.addAll(x);
        zSet.retainAll(y);

        // c)
        xMinusY.addAll(x);
        xMinusY.removeAll(y);

        // d)
        xPlusYLimitedByP.addAll(x);
        xPlusYLimitedByP.addAll(y);
        xPlusYLimitedByP.removeIf(n -> n > p);

        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);
        System.out.println("Lista xPlusY: " + xPlusY);
        System.out.println("Setul zSet (elemente comune): " + zSet);
        System.out.println("Lista xMinusY (elemente din x care nu sunt în y): " + xMinusY);
        System.out.println("Lista xPlusYLimitedByP (elemente ≤ p): " + xPlusYLimitedByP);
    }
}

