package ro.ulbs.paradigme.lab6;

public class IntCalculator
{
    private int state;
    public IntCalculator(int initialState)
    {
        this.state = initialState;
    }
    public IntCalculator add(int value)
    {
        state += value;
        return this;
    }
    public IntCalculator subtract(int value)
    {
        state -= value;
        return this;
    }
    public IntCalculator multiply(int value)
    {
        state *= value;
        return this;
    }
    public int result()
    {
        return state;
    }
    public IntCalculator clear()
    {
        state = 0;
        return this;
    }

    public static void main(String[] args)
    {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);
        int resetResult = calculator.clear().add(10).subtract(4).multiply(3).result();
        System.out.println("b) " + resetResult);
    }
}

