package ro.ulbs.paradigme.lab2;

public class Circle extends Form
{
    private float radius;
    public Circle(float radius, String color)
    {
        super(color);
        this.radius=radius;
    }
    public Circle()
    {
        this.radius=0;
    }
    public float getArea()
    {
        return (float) (Math.PI*radius *radius);
    }
    public String toString()
    {
        return super.toString() + " and is a circle with radius " + radius;
    }
}
