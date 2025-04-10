package ro.ulbs.paradigme.lab6.pb2;

import org.junit.jupiter.api.*;

public class NewIntCalculatorTest
{
    private NewIntCalculator calculator;

    @BeforeEach
    public void setup()
    {
        calculator = new NewIntCalculator();
    }

    @Test
    public void testInitWithValidInteger()
    {
        int value = 20;
        calculator.init(value);
        Assertions.assertEquals(20, calculator.getState());
    }

    @Test
    public void testInitWithInvalidType()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.init(12.5);
        });
    }

    @Test
    public void testAdd()
    {
        calculator.init(10);
        calculator.add(5);
        Assertions.assertEquals(15, calculator.getState());
    }

    @Test
    public void testSubtract()
    {
        calculator.init(15);
        calculator.subtract(3);
        Assertions.assertEquals(12, calculator.getState());
    }

    @Test
    public void testMultiply()
    {
        calculator.init(6);
        calculator.multiply(4);
        Assertions.assertEquals(24, calculator.getState());
    }

    @AfterEach
    public void tearDown()
    {
        calculator = null;
    }
}
