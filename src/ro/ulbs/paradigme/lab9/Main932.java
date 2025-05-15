package ro.ulbs.paradigme.lab9;

import java.util.*;

public class Main932
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        Set<Integer> distinctNumbers = new HashSet<>(numbers);
        List<Integer> squaredNumbers = new ArrayList<>();
        for (int num : distinctNumbers)
        {
            squaredNumbers.add(num * num);
        }
        System.out.println("Patratele numerelor distincte: " + squaredNumbers);
    }
}

