package geometry3d;

import exceptions.InvalidDimensionsException;
import geometry2d.Figure;
import geometry2d.Rectangle;

import java.util.logging.*;

public class Cylinder
{
    private static final Logger logger = Logger.getLogger(Cylinder.class.getName());

    private Figure base;
    private double height;

    static
    {
        try
        {
            FileHandler filehandler = new FileHandler("cylinder.log", true);
            filehandler.setFormatter(new SimpleFormatter());
            logger.addHandler(filehandler);
            logger.setLevel(Level.FINEST);
        }
        catch (Exception er)
        {
            logger.log(Level.FINEST, "ERROR", er);
        }
    }

    public Cylinder(Figure base, double height) throws InvalidDimensionsException
    {
        if (base == null || height < 0)
        {
            throw new InvalidDimensionsException("height < 0");
        }
        this.base = base;
        this.height = height;
        logger.finest("Cylinder create");
    }

    public double volume()
    {
        return base.area() * height;
    }

    public String toString()
    {
        return "Cylinder base " + base.area() + " height " + height + " volume " + volume();
    }
}
