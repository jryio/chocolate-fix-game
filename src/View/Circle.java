package View;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class Circle {

	private int xCoordinate;
	private int yCoordinate;
	private Point center;

	public Circle(int x, int y, Point o) {
		xCoordinate = x;
		yCoordinate = y;
		center = o;
	}

	public boolean contains(Point p) {

		if ((Math.pow((p.x - center.x), 2) + Math.pow((p.y - center.y), 2)) < (Math
				.pow(75, 2))) {
			return true;
		} else {
			return false;
		}
	}

	public void paint(Graphics g) {
		g.fillOval(xCoordinate, yCoordinate, 150, 150);
	}

	public String toString() {
		return xCoordinate + " " + yCoordinate + " " + center;
	}

}
