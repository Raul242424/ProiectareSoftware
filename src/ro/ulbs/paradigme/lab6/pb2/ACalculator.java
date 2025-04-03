package ro.ulbs.paradigme.lab6.pb2;

public abstract class ACalculator
{
    protected Object state;
    public Object result()
    {
        return state;
    }
    public void clear()
    {
        state = null;
    }
    public abstract void init(Object value);
}
