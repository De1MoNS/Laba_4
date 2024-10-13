package geometry2d;

import exceptions.InvalidRadiusException;

public class Circle implements Figure
{

    private double radius;

    public Circle(double radius) throws InvalidRadiusException
    {
        if (radius < 0)
        {
            throw new InvalidRadiusException("Radius < 0");
        }
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    public String toString()
    {
        return "Circle radius " + radius + " area " + area() + " perimeter " + perimeter();
    }
}
