package ro.ulbs.paradigme.lab2.application;

import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;

public class Application
{
    public static void main(String[] args)
    {
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++)
        {
            simpleList.addValue(i);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);

        System.out.println("Lista simplu înlănțuită după ștergere:");
        simpleList.listNodes();
        System.out.println("Suma nodurilor: " + simpleList.calculateSum());
        System.out.println("Este ordonată crescător: " + simpleList.isOrdered());

        DoubleChainedList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++)
        {
            doubleList.addValue(i);
        }

        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);

        System.out.println("\nLista dublu înlănțuită după ștergere:");
        doubleList.listNodes();
        System.out.println("Suma nodurilor: " + doubleList.calculateSum());
        System.out.println("Este ordonată crescător: " + doubleList.isOrdered());
    }
}

