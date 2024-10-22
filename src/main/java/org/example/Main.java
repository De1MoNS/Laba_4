package org.example;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.*;
import exceptions.InvalidDimensionsException;
import exceptions.InvalidRadiusException;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main
{
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    static
    {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.FINE);
    }

    public static void main(String[] args)
    {
        logger.fine("Program started");
        try
        {
            Circle circle = new Circle(7.0);
            logger.fine(circle.toString());
            //Exception Circle circle = new Circle(-7.0);
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(2.0, 7.0);
            logger.fine(rectangle.toString());
            //Exception Rectangle rectangle = new Rectangle(-2.0, -7.0);
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(circle, 7.0);
            logger.fine(cylinder.toString());
            //Exception Cylinder cylinder = new Cylinder(circle, -7.0);
            System.out.println(cylinder);
        }
        catch (Exception er)
        {
            System.err.println("Error" + er.getMessage());
        }
    }
}




