package ro.ulbs.paradigme.lab2;

public class Form
{
    private String color;
    private static int counter=0;
    public Form()
    {
        this.color="white";
        counter++;
    }
    public Form(String color)
    {
        this.color=color;
        counter++;
    }
    public static int getCounter()
    {
        return counter;
    }
    public String getColor()
    {
        return color;
    }
    public float getArea()
    {
        return 0;
    }
    public String toString()
    {
        return "This form has the color " + color;
    }
}
