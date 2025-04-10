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
        assertEquals(10.5, calc.getState());
    }

    @Test
    public void testInitWithInvalidType()
    {
        DoubleCalculator calc = new DoubleCalculator();
        assertThrows(IllegalArgumentException.class, () -> calc.init("not a double"));
    }

    @Test
    public void testAdd()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(5.0);
        calc.add(3.5);
        assertEquals(8.5, calc.getState());
    }

    @Test
    public void testSubtract()
    {
        // Arrange
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(7.0);
        calc.subtract(2.0);
        assertEquals(5.0, calc.getState());
    }

    @Test
    public void testMultiply()
    {
        DoubleCalculator calc = new DoubleCalculator();
        calc.init(4.0);
        calc.multiply(2.5);
        assertEquals(10.0, calc.getState());
    }
}
