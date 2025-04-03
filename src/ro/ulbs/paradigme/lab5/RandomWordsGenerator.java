package ro.ulbs.paradigme.lab5;

import java.io.*;
import java.util.*;

public class RandomWordsGenerator
{
    public static void main(String[] args)
    {
        int wordsPerLine = 10;
        int numberOfLines = 5;
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("outrand.txt")))
        {

            for (int i = 0; i < numberOfLines; i++)
            {
                List<String> words = new ArrayList<>();
                for (int j = 0; j < wordsPerLine; j++)
                {
                    String word = generateRandomWord(random);
                    words.add(word);
                }
                Collections.sort(words);
                for (int j = 0; j < words.size(); j++)
                {
                    writer.write(words.get(j));
                    if (j < words.size() - 1)
                    {
                        writer.write(" ");
                    }
                }
                writer.newLine();
            }

            System.out.println("Fișierul 'outrand.txt' a fost generat cu succes!");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    private static String generateRandomWord(Random random)
    {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < 4; i++)
        {
            char letter = (char) ('a' + random.nextInt(26));
            word.append(letter);
        }
        return word.toString();
    }
}

