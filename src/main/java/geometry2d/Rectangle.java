package geometry2d;

import exceptions.InvalidDimensionsException;

public class Rectangle implements Figure
{
    private double width;
    private double height;

    public Rectangle(double width, double height) throws InvalidDimensionsException
    {
        if (width < 0 || height < 0)
        {
            throw new InvalidDimensionsException("Width or height < 0");
        }
        this.width = width;
        this.height = height;
    }

    public double area()
    {
        return width * height;
    }

    public double perimeter()
    {
        return 2 * (width + height);
    }

    public String toString()
    {
        return "Rectangle width " + width + " height " + height + " area " + area() + " perimeter " + perimeter();
    }
}
