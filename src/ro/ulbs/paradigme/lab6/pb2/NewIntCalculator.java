package ro.ulbs.paradigme.lab6.pb2;

public class NewIntCalculator extends ACalculator
{

    @Override
    public void init(Object value)
    {
        if (value instanceof Integer)
        {
            this.state = value;
        }
        else
        {
            throw new IllegalArgumentException("Valoarea trebuie să fie de tip Integer.");
        }
    }
    public NewIntCalculator add(int value)
    {
        if (state instanceof Integer)
        {
            state = (Integer) state + value;
        }
        return this;
    }
    public NewIntCalculator subtract(int value)
    {
        if (state instanceof Integer) {
            state = (Integer) state - value;
        }
        return this;
    }
    public NewIntCalculator multiply(int value)
    {
        if (state instanceof Integer)
        {
            state = (Integer) state * value;
        }
        return this;
    }
}

