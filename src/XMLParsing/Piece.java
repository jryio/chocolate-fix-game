package XMLParsing;

import java.awt.Color;
import java.awt.Graphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Piece {

	@XmlElement(name = "Color")
	private String colorString;

	@XmlElement(name = "Shape")
	private String Shape;

	@XmlAttribute(name = "x")
	private int row;

	@XmlAttribute(name = "y")
	private int column;

	private Color color = new Color(0, 0, 0, 0);

	private double scaleRatio = 1;

	private int x = 0, y = 0, width = 0, height = 0;

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

	public String getColor() {
		return this.colorString;
	}

	public void setColor(String c) {

		this.colorString = c;
		
		if (c.equals("B")) {
			this.color = Color.decode("#411711");

		} else if (c.equals("T")) {

			this.color = Color.decode("#cac596");

		} else if (c.equals("P")) {

			this.color = color.decode("#b42e66");
		} else {
			this.color = new Color(0, 0, 0, 0);
		}

	}

	public Color getJavaColor() {

		return color;
	}

	public String getShape() {
		return this.Shape;
	}

	public void setShape(String s) {
		this.Shape = s;
	}

	public void paint(Graphics g) {
		// TODO create a Polygon object for Triangles
		// TODO reuse code from Cirlce.java to paint the circle
		// TODO implement switch statement for the Shape and color types
		// also
		// TODO Determine where polygon is centered and find center of the
		// triangle if needed

		switch (Shape) {
		case "Square":
			// Create a paint method that writes a square piece
			break;
		}
	}

	@Override
	public String toString() {
		return "Piece [color=" + color + ", Shape=" + Shape + ", row="
				+ row + ", column=" + column;
	}

}
