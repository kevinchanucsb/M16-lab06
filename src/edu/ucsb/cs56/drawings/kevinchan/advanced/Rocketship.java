package edu.ucsb.cs56.drawings.kevinchan.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D; 

/**
   A Rocketship
      
   @author Kevin Chan 
   @version for CS56, M16, UCSB
   
*/
public class Rocketship extends Rocket implements Shape
{
    /**
     * Constructor for objects of class Rocketship
     */
    public Rocketship(double x, double y, double width, double height)
    {
	// construct the basic rocket shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// create 3 mini (windows) ellipses
	// Each window's height is 15% of the Rocket's height
	// Each window's width is 25% of the Rocket's width
	double windowHeight = .15* height * 1.5;
	double windowWidth = .25* width;
	double windowPlacement = height*.2; //helper for each y-coordinate

	Ellipse2D.Double window1 = new Ellipse2D.Double (x + 0.4 * width,y + windowPlacement,windowWidth,windowHeight);
	Ellipse2D.Double window2 = new Ellipse2D.Double (x + 0.4 * width,y + windowPlacement + height * .25,windowWidth,windowHeight);
	Ellipse2D.Double window3 = new Ellipse2D.Double (x + 0.4 * width,y + windowPlacement + height * .5,windowWidth,windowHeight);	

	// create 3 streams using lines
	double streamLength = 0.2* height;
	double baseHeight = height * 0.2;
	double rocketWidth = width;
    double rocketHeight = height * 1.5;


	Line2D.Double stream1 = new Line2D.Double(x,y + baseHeight + rocketHeight + 0.1*height,x-baseHeight, y + baseHeight + rocketHeight + 0.1*height+streamLength);
	Line2D.Double stream2 = new Line2D.Double(x + 0.5 * width, y + baseHeight + rocketHeight + 0.1*height, x + 0.5*width, y + baseHeight + rocketHeight + 0.1*height+streamLength );
	Line2D.Double stream3 = new Line2D.Double(x + width, y + baseHeight + rocketHeight + 0.1*height, x+width+baseHeight, y + baseHeight + rocketHeight + 0.1*height+streamLength );

	GeneralPath wholeRocket = this.get();
	wholeRocket.append(window1, false);
	wholeRocket.append(window2, false);
	wholeRocket.append(window3, false); 
	wholeRocket.append(stream1,false);
	wholeRocket.append(stream2,false);
	wholeRocket.append(stream3,false);
    }    
}
