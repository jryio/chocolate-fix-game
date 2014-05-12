package display_components;

import java.awt.Color;
import java.awt.Graphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Piece", propOrder = {""})
public class Piece {


	private Color color;
	private String colorString;
	private String shape;
	private int row, column;
	private double scaleRatio = 1;
	private int x = 0, y = 0, width = 0, height = 0;

	public Piece(Color c, String s) {
		this.color = c;
		this.shape = s;
	}


	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void scale(double scale) {
		scaleRatio = scale;
	}
	
	@XmlAttribute(name = "x")
	public int getRow(){
		return row;
	}
	
	public void setRow(String r){
		this.row = Integer.parseInt(r);
	}
	
	@XmlAttribute(name = "y")
	public int getColumn(){
		return this.column;
	}
	
	public void setColumn(String c){
		this.column = Integer.parseInt(c);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color c) {
		color = c;
	}


	public String getShape() {
		return shape;
	}

	public void setShape(String s) {
		this.shape = s;
	}
	
	public String getColorString() {
		if (color.equals(Color.decode("#411711"))) {
			this.colorString = "B";
		} else if (color.equals(Color.decode("#cac596"))) {
			this.colorString = "T";
		} else if (color.equals(Color.decode("#b42e66"))) {
			this.colorString = "P";
		} else {
			this.colorString = null;
		}
		return this.colorString;
	}
	
	public void paint(Graphics g) {
		// TODO create a Polygon object for Triangles
		// TODO reuse code from Cirlce.java to paint the circle
		// TODO implement switch statement for the shape and color types
		// also
		// TODO Determine where polygon is centered and find center of the
		// triangle if needed

		switch (shape) {
		case "Square":
			// Create a paint method that writes a square piece
			break;
		}
	}

}
