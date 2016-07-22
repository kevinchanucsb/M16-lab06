package edu.ucsb.cs56.drawings.kevinchan.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a rocket that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Kevin Chan
   @version for CS56, M16, UCSB
   
*/
public class Rocket extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of rocket
       @param y y coord of lower left corner of rocket
       @param width width of the rocket
       @param height of rocket
    */
    public Rocket(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        // 1.Make the rocket
        double rocketWidth = width;
        double rocketHeight = height * 1.5; //1.5 is to elongate the ellipse vertically


        Ellipse2D.Double rocketMain = new Ellipse2D.Double (x,y,rocketWidth,rocketHeight);


        // 2.Make base (triangle)
        double baseHeight = height * 0.2;

        Line2D.Double leftBase = 
            new Line2D.Double (x, y + baseHeight + rocketHeight,
                               x + rocketWidth/2.0, y + rocketHeight);

        Line2D.Double rightBase =
            new Line2D.Double (x + rocketWidth, y + baseHeight + rocketHeight, 
                              x + rocketWidth/2.0, y + rocketHeight);

        Line2D.Double bottomBase =
            new Line2D.Double (x,y + baseHeight + rocketHeight, x + rocketWidth, y + baseHeight + rocketHeight );
	
        // put the whole rocket together
        GeneralPath wholeRocket = this.get();
        wholeRocket.append(leftBase, false);
        wholeRocket.append(rightBase, false);
        wholeRocket.append(bottomBase, false);   
        wholeRocket.append(rocketMain,false); 
    }
}
