package ro.ulbs.paradigme.lab5;

import java.io.*;
import java.util.*;

public class TextProcessor
{
    public static void main(String[] args)
    {
        String text = "Lorem ipsum dolor sit amet, vim ne eripuit vulputate. Vide tantas dicunt ne ius, mel pertinacia intellegebat\n" +
                "ei. Sea vidisse aperiam et, eu altera audiam percipitur vis, decore verterem ea nec. Veri quando ad est. Ex\n" +
                "quidam blandit nec, eos et percipit indoctum.\n" +
                "Summo putant consetetur cu vel. Id eum adipisci philosophia, eos commodo principes an. Duis eripuit\n" +
                "laoreet qui ne, pri maiorum detracto definitiones et. Sea quis laudem dolorem eu.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("in.txt")))
        {
            writer.write(text);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("in.txt")))
        {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null)
            {
                lines.add(line + "\n");
            }
            List<String> modifiedLines = new ArrayList<>();
            for (String l : lines)
            {
                StringBuilder modifiedLine = new StringBuilder();
                for (char c : l.toCharArray())
                {
                    modifiedLine.append(c);
                    if (c == '.') {
                        modifiedLine.append("\n");
                    }
                }
                modifiedLines.add(modifiedLine.toString());
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt")))
            {
                for (String modifiedLine : modifiedLines)
                {
                    writer.write(modifiedLine);
                }
            }
            System.out.println("Text cu newline la sfârșitul fiecărei linii (punctul a):");
            for (String l : lines)
            {
                System.out.print(l);
            }

            System.out.println("\nText cu newline după fiecare punct (punctul b):");
            for (String l : modifiedLines)
            {
                System.out.print(l);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}