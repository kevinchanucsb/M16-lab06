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
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	g2.setStroke(thick);	
	Stroke orig=g2.getStroke();

	Rocket r1 = new Rocket(100,250,50,75);
	g2.setColor(Color.GREEN); g2.draw(r1);
		
	
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,100,0);
	g2.setColor(Color.YELLOW); g2.draw(r2);

	Shape r3 = ShapeTransforms.scaledCopyOfLL(r2,0.5,0.5);
	r3 = ShapeTransforms.translatedCopyOf(r3,100,0);
	g2.setColor(Color.ORANGE); g2.draw(r3);
	
	Shape r4 = ShapeTransforms.scaledCopyOfLL(r3,4,4);
	r4 = ShapeTransforms.translatedCopyOf(r4,100,0);
	g2.setColor(Color.RED); g2.draw(r4);

	Shape r5 = ShapeTransforms.scaledCopyOfLL(r4,4,4);
	r5 = ShapeTransforms.translatedCopyOf(r5,100,0);
	g2.setColor(Color.BLUE); g2.draw(r5);

	//Signature
	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("-Rainbow Rockets at Bay- by Kevin Chan", 20,20);
    }
    

    public static void drawPicture2(Graphics2D g2) {
	
	//First regular rocketship
    Rocketship rs1 = new Rocketship(100,50,50,100);
	g2.setColor(Color.BLUE);
	Shape rs2 = ShapeTransforms.rotatedCopyOf(rs1, Math.PI/4.0);
	g2.draw(rs2);

	Shape rs3 = ShapeTransforms.translatedCopyOf(rs2,150,60);
	g2.setColor(Color.RED);
	g2.draw(rs3);

	Shape rs4 = ShapeTransforms.translatedCopyOf(rs3,150,80);
	g2.setColor(Color.ORANGE);
	g2.draw(rs4);

	//Signature
	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("-Rainbow Rocketships Away!- by Kevin Chan", 20,20);
	}
	
    
   	public static void drawPicture3(Graphics2D g2) {

	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	g2.setStroke(thick);

	Rocketship rs1 = new Rocketship(100,150,50,75);
	g2.setColor(Color.GREEN);
	Shape rs2 = ShapeTransforms.rotatedCopyOf(rs1, Math.PI/2.0);
	g2.draw(rs2);

	Rocketship rs3 = new Rocketship(300,300,50,75);
	g2.setColor(Color.BLUE);
	g2.draw(rs3);

	Rocketship rs4 = new Rocketship(500,150,50,75);
	g2.setColor(Color.RED);
	Shape rs5 = ShapeTransforms.rotatedCopyOf(rs4, Math.PI/(2.0*-1));
	g2.draw(rs5);

	Rocketship rs6 = new Rocketship(300,50,50,75);
	g2.setColor(Color.YELLOW);
	Shape rs7 = ShapeTransforms.rotatedCopyOf(rs6, Math.PI/(-1));
	g2.draw(rs7);

	Rocketship rs8 = new Rocketship(150,275,50,75);
	g2.setColor(Color.GRAY);
	Shape rs9 = ShapeTransforms.rotatedCopyOf(rs8, Math.PI/(4.0));
	g2.draw(rs9);

	Rocketship rs10 = new Rocketship(450,275,50,75);
	g2.setColor(Color.MAGENTA);
	Shape rs11 = ShapeTransforms.rotatedCopyOf(rs10, Math.PI/(-4.0));
	g2.draw(rs11);

	Rocketship rs12 = new Rocketship(450,275,50,75);
	g2.setColor(Color.GREEN);
	Shape rs13 = ShapeTransforms.rotatedCopyOf(rs12, Math.PI/(-4.0));
	g2.draw(rs13);
//
	Rocketship rs14 = new Rocketship(150,50,50,75);
	g2.setColor(Color.PINK);
	Shape rs15 = ShapeTransforms.rotatedCopyOf(rs14, Math.PI/(1.5));
	g2.draw(rs15);

	Rocketship rs16 = new Rocketship(450,50,50,75);
	g2.setColor(Color.BLACK);
	Shape rs17 = ShapeTransforms.rotatedCopyOf(rs16, Math.PI/(-1.5));
	g2.draw(rs17);

	//Signature
	Stroke orig=g2.getStroke();
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("-Rainbow Rocketships in Orbit!- by Kevin Chan", 20,20);
	
    }    

}
