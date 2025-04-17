package ro.ulbs.paradigme.lab6.pb2;

public class DoubleCalculator extends ACalculator
{
    @Override
    public void init(Object value)
    {
        if (value instanceof Double)
        {
            this.state = value;
        }
        else
        {
            throw new IllegalArgumentException("Valoarea trebuie să fie de tip Double.");
        }
    }

    public DoubleCalculator add(double value)
    {
        if (state instanceof Double)
        {
            state = (Double) state + value;
        }
        return this;
    }

    public DoubleCalculator subtract(double value)
    {
        if (state instanceof Double)
        {
            state = (Double) state - value;
        }
        return this;
    }

    public DoubleCalculator multiply(double value)
    {
        if (state instanceof Double)
        {
            state = (Double) state * value;
        }
        return this;
    }

    public DoubleCalculator divide(double value)
    {
        if (value == 0.0)
        {
            throw new ArithmeticException("Imparrirea la zero nu este permisa.");
        }
        if (state instanceof Double)
        {
            state = (Double) state / value;
        }
        return this;
    }
}
