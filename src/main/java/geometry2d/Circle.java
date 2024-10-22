package geometry2d;

import java.util.logging.*;
import exceptions.InvalidRadiusException;

public class Circle implements Figure
{
    private static final Logger logger = Logger.getLogger(Circle.class.getName());

    private double radius;

    static
    {
        try
        {
            FileHandler filehandler = new FileHandler("figures.log", true);
            filehandler.setFormatter(new XMLFormatter());
            logger.addHandler(filehandler);
            logger.setLevel(Level.SEVERE);
        }
        catch (Exception er)
        {
            logger.log(Level.SEVERE, "ERROR",er);
        }
    }

    public Circle(double radius) throws InvalidRadiusException
    {
        if (radius < 0)
        {
            throw new InvalidRadiusException("Radius < 0");
        }
        this.radius = radius;
        logger.severe("Circle create");
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
