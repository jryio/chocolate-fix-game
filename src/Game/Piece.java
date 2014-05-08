package Game;

import java.awt.Color;

public class Piece {

	// Pink - #FF99FF
	// Brown - #CC9900
	// Tan - #FFFFB8
	// Grey - #B8B8B8
	static Color color;
	static String shape;

	public Piece(int c, int s) {
		switch (c) {
		case 0: // Sets color to Grey (used to display unknown color areas in
			// clues)
			color = Color.decode("#B8B8B8");
			break;
		case 1: // Sets color to Pink
			color = Color.decode("#FFFFB8");
			break;
		case 2: // Sets color to Brown
			color = Color.decode("#CC9900");
			break;
		case 3:
			color = Color.decode("#FFFFB8");
		default: // Sets color to Black in case of errors
			color = Color.BLACK;
			break;

		}
		switch (s) {
		case 0:
			shape = "circle";
			break;
		case 1:
			shape = "square";
			break;
		case 2:
			shape = "triangle";
		}
	}

	public Color getColor() {
		return color;
	}
	
	public void setColor(Color c){
		color = c;
	}
	
	public String getShape(){
		return shape;
	}

}
