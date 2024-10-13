package geometry3d;

import exceptions.InvalidDimensionsException;
import geometry2d.Figure;

public class Cylinder
{
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) throws InvalidDimensionsException
    {
        if (base == null || height < 0)
        {
            throw new InvalidDimensionsException("height < 0");
        }
        this.base = base;
        this.height = height;
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
