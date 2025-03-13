package ro.ulbs.paradigme.lab2;

public class Triangle extends Form
{
    private float base;
    private float height;
    public Triangle(float base, float height, String color)
    {
        super(color);
        this.base=base;
        this.height=height;
    }
    public Triangle()
    {
        this.base=0;
        this.height=0;
    }
    public float getArea()
    {
        return (base*height)/2;
    }
    public String toString()
    {
        return super.toString() + " and is a triangle with base " + base + " and height " + height;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangle other = (Triangle) obj;
        return this.base == other.base && this.height == other.height && this.getColor().equals(other.getColor());
    }
        public int hashCode() {
        int result = 17;
        result = 31 * result + Float.floatToIntBits(base);
        result = 31 * result + Float.floatToIntBits(height);
        result = 31 * result + getColor().hashCode();
        return result;

    }
}
