package View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameBoard extends JPanel{
	
	// CONFIGURATION CONSTANTS
	static final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	static final Color TILE_COLOR = Color.white;
	static final Color SELECTED_COLOR = Color.decode("0x80E680");
	
	private static ArrayList<Point> circleCenters = new ArrayList<Point>();
	private static ArrayList<Circle> circles = new ArrayList<Circle>();

	private static int circleCount = -1;

	public static String tileEntered = "";
	public static String tileClicked = "";
	
	public void paint(Graphics g) {
		BufferedImage buffImage = new BufferedImage(600, 600,
				BufferedImage.TYPE_INT_RGB);

		Graphics2D buffGraphics = buffImage.createGraphics();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// Count the number of circles rendered and created
				circleCount++;

				int xRect = i * 200;
				int yRect = j * 200;
				int xCircle = xRect + 25;
				int yCircle = yRect + 25;

				// Coordinates for center of each circle
				circleCenters.add(new Point(xCircle + 75, yCircle + 75));

				buffGraphics.setColor(Color.BLACK);
				buffGraphics.fillRect(xRect, yRect, 200, 200);

				buffGraphics.setColor(Color.DARK_GRAY);
				buffGraphics.fillRect(xRect, yRect, 199, 199);

				// same object over and over for the addition of circle objects
				buffGraphics.setColor(Color.DARK_GRAY.darker());
				circles.add(circleCount,new Circle(xCircle, yCircle, circleCenters
						.get(circleCount)));
				circles.get(circleCount).paint(buffGraphics);
			}
		}

		//TODO Try making tileEntered conditionals with switch statement
		 buffGraphics.setColor(Color.decode("#282828"));
		 if(tileEntered.equals("1,1")){
			 
			 circles.get(0).paint(buffGraphics);
		 }
		 else if(tileEntered.equals("1,2")){
			 
			 circles.get(1).paint(buffGraphics);
		 }
		 else if(tileEntered.equals("1,3")){
			 
			 circles.get(2).paint(buffGraphics);
		 }
		 else if(tileEntered.equals("2,1")){
			 
			 circles.get(3).paint(buffGraphics);
		 }
		 else if(tileEntered.equals("2,2")){
			 
			 circles.get(4).paint(buffGraphics);
		 }
		 else if(tileEntered.equals("2,3")){
		
			 circles.get(5).paint(buffGraphics);
		 }
		 else if(tileEntered.equals("3,1")){
		
			 circles.get(6).paint(buffGraphics); 
		 }
		 else if(tileEntered.equals("3,2")){
		
			 circles.get(7).paint(buffGraphics);
		 }
		 else if(tileEntered.equals("3,3")){
		
			 circles.get(8).paint(buffGraphics);
		 }
		 else{
			 buffGraphics.setColor(Color.DARK_GRAY.darker());
		 }
		 
		 

		// Draw image to graphics object
		g.drawImage(buffImage, 0, 0, 600, 600, null);
		tileEntered = ""; // Reset tile identifier
	}
	
	public static ArrayList<Point> getCircleCenters() {
		return circleCenters;
	}

	public static ArrayList<Circle> getCircles() {
		return circles;
	}

}
