package ro.ulbs.paradigme.lab2;

public class Square extends Form
{
    private float side;
    public Square(float side, String color)
    {
        super(color);
        this.side=side;
    }
    public Square()
    {
        this.side=0;
    }
    public float getArea()
    {
        return side*side;
    }
    public String toString()
    {
        return super.toString() + " and is a square with side " + side;
    }
}
