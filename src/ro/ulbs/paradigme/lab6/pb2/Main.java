package ro.ulbs.paradigme.lab6.pb2;

public class Main
{
    public static void main(String[] args)
    {
        NewIntCalculator intCalculator = new NewIntCalculator();
        intCalculator.init(10);
        int resultInt = (int) intCalculator.add(5).subtract(3).multiply(2).result();
        System.out.println("Rezultatul pentru NewIntCalculator: " + resultInt);
        DoubleCalculator doubleCalculator = new DoubleCalculator();
        doubleCalculator.init(10.0);
        double resultDouble = (double) doubleCalculator.add(5).subtract(3.3).multiply(2.2).result();
        System.out.println("Rezultatul pentru DoubleCalculator: " + resultDouble);
    }
}

