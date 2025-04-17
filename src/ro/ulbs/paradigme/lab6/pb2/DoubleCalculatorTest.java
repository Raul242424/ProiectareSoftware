package ro.ulbs.paradigme.lab6.pb2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleCalculatorTest
{
    @Test
    public void testInitWithValidDouble()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(10.5);
        System.out.println("testInitWithValidDouble -> State: " + calc.getState());
        assertEquals(10.5, calc.getState());
    }

    @Test
    public void testInitWithInvalidType()
    {
        DoubleCalculator calc = new DoubleCalculator();
        System.out.println("testInitWithInvalidType -> Astept IllegalArgumentException");
        assertThrows(IllegalArgumentException.class, () -> calc.init("not a double"));
    }

    @Test
    public void testAdd()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(5.0);
        calc.add(3.5);
        System.out.println("testAdd -> State after add: " + calc.getState());
        assertEquals(8.5, calc.getState());
    }

    @Test
    public void testSubtract()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(7.0);
        calc.subtract(2.0);
        System.out.println("testSubtract -> State after subtract: " + calc.getState());
        assertEquals(5.0, calc.getState());
    }

    @Test
    public void testMultiply()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(4.0);
        calc.multiply(2.5);
        System.out.println("testMultiply -> State after multiply: " + calc.getState());
        assertEquals(10.0, calc.getState());
    }

    @Test
    public void testMultiplyWithZero()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(12.3);
        calc.multiply(0.0);
        System.out.println("testMultiplyWithZero -> State after multiply with 0: " + calc.getState());
        assertEquals(0.0, (Double) calc.getState(), 0.0001);
    }

    @Test
    public void testDivideNormally()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(9.0);
        calc.divide(3.0);
        System.out.println("testDivideNormally -> State after divide: " + calc.getState());
        assertEquals(3.0, (Double) calc.getState(), 0.0001);
    }

    @Test
    public void testDivideByZero()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(5.5);
        System.out.println("testDivideByZero -> Astept ArithmeticException");
        assertThrows(ArithmeticException.class, () -> calc.divide(0.0));
    }
}
