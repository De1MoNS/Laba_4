package geometry2d;

import exceptions.InvalidDimensionsException;

import java.util.logging.*;

public class Rectangle implements Figure
{
    private static final Logger logger = Logger.getLogger(Rectangle.class.getName());

    private double width;
    private double height;

    static
    {
        try
        {
            FileHandler filehandler = new FileHandler("figures.log", true);
            filehandler.setFormatter(new XMLFormatter());
            logger.addHandler(filehandler);
            logger.setLevel(Level.INFO);
        }
        catch (Exception er)
        {
            logger.log(Level.INFO, "ERROR", er);
        }
    }

    public Rectangle(double width, double height) throws InvalidDimensionsException
    {
        if (width < 0 || height < 0)
        {
            throw new InvalidDimensionsException("Width or height < 0");
        }
        this.width = width;
        this.height = height;
        logger.info("Rectangle create");
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
