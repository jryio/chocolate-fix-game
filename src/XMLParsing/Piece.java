package XMLParsing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;

import javax.swing.JComponent;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import display_components.Triangle;

@XmlType(factoryMethod = "newInstance")
public class Piece {

	private String colorString;

	@XmlElement(name = "Shape")
	private String Shape;

	@XmlAttribute(name = "x")
	private int row;

	@XmlAttribute(name = "y")
	private int column;

	// Draw Point of the enclosing rectangle for Graphics2D objects
	private Point location;
	private final Point INITIALPOINT;

	// Sets the size of the shape
	private Integer size;

	// Center of the shape
	private Point2D.Double center;

	// Triangle Object
	Triangle tri;

	private Color color = new Color(0, 0, 0, 0);
	private Color pink = Color.decode("#B42E66");
	private Color brown = Color.decode("#411711");
	private Color tan = Color.decode("#d9ca7d");
	private Color backgroundPiece = Color.LIGHT_GRAY;

	private boolean isContained = false;

	public Piece(String c, String s, Point loc, int size) {

		// Set Values for Color
		this.colorString = c;

		if (this.colorString.equalsIgnoreCase("B")) {

			this.color = brown;

		} else if (this.colorString.equalsIgnoreCase("T")) {

			this.color = tan;

		} else if (this.colorString.equalsIgnoreCase("P")) {

			this.color = pink;
		}

		// Set Values for Shape
		this.Shape = s;

		// Set Location
		this.location = loc;
		this.INITIALPOINT = loc;

		// Set Size
		this.size = size;
	}

	// Private instance for JAXB
	private Piece() {
		this.colorString = null;
		this.color = null;
		this.Shape = null;
		this.size = null;
		this.location = null;
		this.INITIALPOINT = null;
	}

	/* Creates a new instance of Piece which should only be used by JAXB */
	public static Piece newInstance() {
		return new Piece();
	}

	public void setLocation(Point p) {
		this.location = p;
	}

	public Point getLocation() {
		return this.location;
	}
	
	public void resetLocation(){
		this.location = this.INITIALPOINT;
	}
	
	

	public void setSize(int s) {
		this.size = s;
	}

	public int getSizePiece() {
		return this.size;
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

	@XmlElement(name = "Color")
	public void setColor(String c) {

		this.colorString = c;

		if (this.colorString.equalsIgnoreCase("B")) {
			this.color = brown;

		} else if (this.colorString.equalsIgnoreCase("T")) {

			this.color = tan;

		} else if (this.colorString.equalsIgnoreCase("P")) {

			this.color = pink;
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

	public void draw(Graphics g) {

		// Create Graphics2D object for use with Path2D.Double in Triangle.java
		Graphics2D graphics = (Graphics2D) g.create();

		// If the Piece is a Circle
		if (this.Shape.equals("C")) {

			// Encapsulating Cirlce
			graphics.setColor(backgroundPiece);
			graphics.fillOval(this.location.x, this.location.y, size, size);

			// Inner Circle Piece
			graphics.setColor(this.color);
			graphics.fillOval((this.location.x + 3), (this.location.y + 3),
					(size - 6), (size - 6));

			// Calculate the center of the Circle
			this.center = new Point2D.Double(this.location.x
					+ (this.size / 2.0), this.location.y + (this.size / 2.0));

			// If the Piece is a Square
		} else if (this.Shape.equals("S")) {

			// Encapsulating Square
			graphics.setColor(backgroundPiece);
			graphics.fillRect(this.location.x, this.location.y, size, size);

			// Inner Sqaure Piece
			graphics.setColor(this.color);
			graphics.fillRect(this.location.x + 3, this.location.y + 3,
					size - 6, size - 6);

			// Calculate the center of the Circle
			this.center = new Point2D.Double(this.location.x
					+ (this.size / 2.0), this.location.y + (this.size / 2.0));

		} else if (this.Shape.equals("T")) {
			// Set the Color to the background color
			graphics.setColor(backgroundPiece);

			// Create Triangle and draw
			tri = new Triangle(this.location, this.size);
			tri.constructPath();
			graphics.fill(tri);

			// Set color to piece color
			graphics.setColor(this.color);

			// Create inscribed Triangle
			graphics.fill(tri.constructInscribedTriangle(6));

			this.center = new Point2D.Double(this.location.x
					+ tri.getSideLength() / 2.0, this.location.y
					+ tri.getCircumcenterRadius());
		}
	}

	//Depending on the shape type, returns if the point in contained within the shape.
	public boolean contains(Point p) {

		if (this.Shape.equalsIgnoreCase("C")) {

			if ((Math.pow((this.location.x - this.center.x), 2) + Math.pow(
					(this.location.y - this.center.y), 2)) < (Math.pow(
					this.size, 2))) {
				isContained = true;
			}

		} else if (this.Shape.equalsIgnoreCase("S")) {
			
			if (((p.x >= this.location.x) && (p.x <= (this.location.x + this.size)))
					&& ((p.y >= this.location.y) && (p.y <= this.location.y
							+ this.size))) {
				isContained = true;
			}

		} else if (this.Shape.equalsIgnoreCase("T")) {
			if (tri.contains(p)) {
				isContained = true;
			}

		}
		return isContained;
	}

	@Override
	public String toString() {
		return "Piece [colorString=" + colorString + ", Shape=" + Shape
				+ ", row=" + row + ", column=" + column + ", location="
				+ location + ", size=" + size + ", color=" + color + ", pink="
				+ pink + ", brown=" + brown + ", tan=" + tan
				+ ", backgroundPiece=" + backgroundPiece + "]";
	}
}
