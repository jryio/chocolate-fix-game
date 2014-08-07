package display_components;

import java.awt.Point;
import java.awt.geom.Path2D;
import java.util.Arrays;

public class Triangle extends Path2D.Double {

	private double[] xCoordinates, yCoordinates, innerXCoordinates,
			innerYCoordinates;
	private Point location;
	private double height, circumcenterRadius, sideLength, innerCircumcenterRadius, innerHeight, innerSideLength, xOffset;

	public Triangle(Point p, double h) {

		//Checking for non-null and positive values.
		if (p != null && h > 0) {
			this.location = p;
			this.height = h;

			this.circumcenterRadius = (2.0 / 3.0) * (this.height);
			this.sideLength = (2 * this.height)/Math.sqrt(3.0);
		}

		// Set values for the x coordiantes using location and height
		this.xCoordinates = new double[] { p.x,
				p.x + sideLength/ 2,
				p.x + sideLength };

		// Set values for the x coordinates using location and height
		this.yCoordinates = new double[] { p.y + this.height, p.y,
				p.y + this.height };
	}

	public void constructPath() {
		// Sets the path to the first coordinates of the triangle (bottom left).
		this.moveTo(this.xCoordinates[0], this.yCoordinates[0]);

		// Iterates through the coordinates and adds them to the path
		for (int i = 1; i < this.xCoordinates.length; i++) {
			this.lineTo(this.xCoordinates[i], this.yCoordinates[i]);
		}

		// Closes the path and compeletes the Polygona
		this.closePath();
	}

	public Path2D constructInscribedTriangle(double radiusDifference) {

		// Calculate the new circumcenterRadius of the inscribed Triangle
		innerCircumcenterRadius = (this.circumcenterRadius - radiusDifference);
		innerHeight = (3.0 / 2.0) * innerCircumcenterRadius;
		innerSideLength = (2 * innerHeight)/Math.sqrt(3.0);
		
		xOffset = (radiusDifference/2) * (Math.sqrt(3.0)); 

		// Recalculate coordintes for inner Triangle
		this.innerXCoordinates = new double[] {
				(this.location.x + xOffset),
				(this.location.x + xOffset)
						+ innerSideLength/ 2,
				(this.location.x + xOffset)
						+ innerSideLength };

		this.innerYCoordinates = new double[] {
				(this.location.y + radiusDifference) + innerHeight,
				(this.location.y + radiusDifference),
				(this.location.y + radiusDifference) + innerHeight };

		Path2D.Double inscribedTriangle = new Path2D.Double();

		inscribedTriangle.moveTo(this.innerXCoordinates[0],
				this.innerYCoordinates[0]);
		for (int h = 1; h < this.innerXCoordinates.length; h++) {
			inscribedTriangle.lineTo(this.innerXCoordinates[h],
					this.innerYCoordinates[h]);
		}

		inscribedTriangle.closePath();

		return inscribedTriangle;
	}
	
	public Point getLocation(){
		return this.location;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public double getCircumcenterRadius(){
		return this.circumcenterRadius;
	}
	
	public double getSideLength(){
		return this.sideLength;
	}
	

	@Override
	public String toString() {
		return "Triangle [xCoordinates=" + Arrays.toString(xCoordinates)
				+ ", yCoordinates=" + Arrays.toString(yCoordinates)
				+ ", innerXCoordinates=" + Arrays.toString(innerXCoordinates)
				+ ", innerYCoordinates=" + Arrays.toString(innerYCoordinates)
				+ ", location=" + location + ", height=" + height
				+ ", circumcenterRadius=" + circumcenterRadius
				+ ", sideLength=" + sideLength + "]";
	}

}
