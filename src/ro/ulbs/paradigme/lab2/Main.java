package ro.ulbs.paradigme.lab2;

public class Main
{
    public static void main(String[] args)
    {
    Square square=new Square(5,"red");
    Triangle triangle=new Triangle(5,10,"blue");
    Triangle triangle1=new Triangle(5,10,"red");
    Triangle triangle2=new Triangle(5,10,"red");
    Triangle triangle3=new Triangle(6,12,"blue");
    Circle circle=new Circle(7,"green");
        System.out.println(square);
        System.out.println("Area of square: "+square.getArea());
        System.out.println(triangle);
        System.out.println("Area of triangle: "+triangle.getArea());
        System.out.println("triangle1 equals triangle2: "+triangle1.equals(triangle2));
        System.out.println("triangle1 equals triangle3: "+triangle1.equals(triangle3));
        System.out.println(circle);
        System.out.println("Area of circle: "+circle.getArea());
    }
}