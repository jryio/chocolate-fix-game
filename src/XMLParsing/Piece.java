package XMLParsing;

import java.awt.Color;
import java.awt.Graphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Levels")
@XmlAccessorType(XmlAccessType.FIELD)
public class Piece {

	@XmlElement(name = "Color")
	private Color Color;
	
	private String ColorString;
	
	@XmlElement(name = "Shape")
	private String Shape;
	
	@XmlAttribute(name = "x")
	private int row;
	
	@XmlAttribute(name = "y")
	private int column;
	
	private double scaleRatio = 1;
	private int x = 0, y = 0, width = 0, height = 0;

	// public Piece(Color c, String s) {
	// this.Color = c;
	// this.Shape = s;
	// }

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void scale(double scale) {
		scaleRatio = scale;
	}

	public int getRow() {
		return this.row;
	}

	public void setRow(String r) {
		this.row = Integer.parseInt(r);
	}

	public int getColumn() {
		return this.column;
	}

	public void setColumn(String c) {
		this.column = Integer.parseInt(c);
	}

	public Color getColor() {
		return this.Color;
	}

	public void setColor(Color c) {
		this.Color = c;
	}

	public String getShape() {
		return this.Shape;
	}

	public void setShape(String s) {
		this.Shape = s;
	}

	public String getColorString() {
		if (Color.equals(Color.decode("#411711"))) {
			this.ColorString = "B";
		} else if (Color.equals(Color.decode("#cac596"))) {
			this.ColorString = "T";
		} else if (Color.equals(Color.decode("#b42e66"))) {
			this.ColorString = "P";
		} else {
			this.ColorString = null;
		}
		return this.ColorString;
	}

	public void paint(Graphics g) {
		// TODO create a Polygon object for Triangles
		// TODO reuse code from Cirlce.java to paint the circle
		// TODO implement switch statement for the Shape and Color types
		// also
		// TODO Determine where polygon is centered and find center of the
		// triangle if needed

		switch (Shape) {
		case "Square":
			// Create a paint method that writes a square piece
			break;
		}
	}

}
