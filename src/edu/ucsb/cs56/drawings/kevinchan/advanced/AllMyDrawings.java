package edu.ucsb.cs56.drawings.kevinchan.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Kevin Chan
 * @version for UCSB CS56, M16 
 */

public class AllMyDrawings{
    /** Draw a picture with a few rockets
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Rocket r1 = new Rocket(100,250,50,75);
	g2.setColor(Color.GREEN); g2.draw(r1);
		
	
	// Make a green rocket that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.YELLOW); g2.draw(r2);

	
	
	// Here's a rocket that's 5x as big
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,5,5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(r2); 

	//Signature
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("-Rockets at Bay- by Kevin Chan", 20,20);
    }
    

    public static void drawPicture2(Graphics2D g2) {
	
	//First regular rocketship
    Rocketship rs1 = new Rocketship(100,250,50,75);
	g2.setColor(Color.BLUE); g2.draw(rs1);

	//Signature
	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("-To the Moon!- by Kevin Chan", 20,20);
	}
	/*
	
	// Draw two houses with Windows
	
	HouseWithWindows hw1 = new HouseWithWindows(50,350,40,75);
	HouseWithWindows hw2 = new HouseWithWindows(200,350,200,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second house 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Coffee Cups and a few houses by Phill Conrad", 20,20);
    }
    */
    // Draw a different picture with a few houses and coffee cups
     
    
    
   	public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Coffee Cups by Phill Conrad", 20,20);
	
	
	// Draw some coffee cups.
	
	CoffeeCup large = new CoffeeCup(100,50,225,150);
	CoffeeCup smallCC = new CoffeeCup(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }    

}
