package org.example;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.*;
import exceptions.InvalidDimensionsException;
import exceptions.InvalidRadiusException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Circle circle = new Circle(7.0);
            //Exception Circle circle = new Circle(-7.0);
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(2.0, 7.0);
            //Exception Rectangle rectangle = new Rectangle(-2.0, -7.0);
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(circle, 7.0);
            //Exception Cylinder cylinder = new Cylinder(circle, -7.0);
            System.out.println(cylinder);
        }
        catch (Exception er)
        {
            System.err.println("Error" + er.getMessage());
        }
    }
}




