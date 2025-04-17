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
        System.out.println("testInitWithValidInteger -> State: " + calculator.getState());
        Assertions.assertEquals(20, calculator.getState());
    }

    @Test
    public void testInitWithInvalidType()
    {
        System.out.println("testInitWithInvalidType -> Astept IllegalArgumentException");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.init(12.5);
        });
    }

    @Test
    public void testAdd()
    {
        calculator.init(10);
        calculator.add(5);
        System.out.println("testAdd -> State after add: " + calculator.getState());
        Assertions.assertEquals(15, calculator.getState());
    }

    @Test
    public void testSubtract()
    {
        calculator.init(15);
        calculator.subtract(3);
        System.out.println("testSubtract -> State after subtract: " + calculator.getState());
        Assertions.assertEquals(12, calculator.getState());
    }

    @Test
    public void testMultiply()
    {
        calculator.init(6);
        calculator.multiply(4);
        System.out.println("testMultiply -> State after multiply: " + calculator.getState());
        Assertions.assertEquals(24, calculator.getState());
    }

    @Test
    public void testMultiplyWithZero()
    {
        calculator.init(25);
        calculator.multiply(0);
        System.out.println("testMultiplyWithZero -> State after multiply with 0: " + calculator.getState());
        Assertions.assertEquals(0, calculator.getState());
    }

    @Test
    public void testDivideByZero()
    {
        calculator.init(100);
        System.out.println("testDivideByZero -> Astept ArithmeticException");
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0);
        });
    }

    @Test
    public void testDivideNormally()
    {
        calculator.init(100);
        calculator.divide(4);
        System.out.println("testDivideNormally -> State after divide: " + calculator.getState());
        Assertions.assertEquals(25, calculator.getState());
    }

    @AfterEach
    public void tearDown()
    {
        calculator = null;
    }
}
