package display_components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class BoardTile {

	private int xCoordinate;
	private int yCoordinate;
	private Point center;
	private boolean isHighlighted = false;

	public BoardTile(int x, int y, Point o) {
		this.xCoordinate = x;
		this.yCoordinate = y;
		this.center = o;
	}

	public boolean contains(Point p) {

		if ((Math.pow((p.x - center.x), 2) + Math.pow((p.y - center.y), 2)) < (Math
				.pow(75, 2))) {
			return true;
		} else {
			return false;
		}
	}

	public void setHighlighted(boolean h) {
		this.isHighlighted = h;
	}

	public boolean getHighlighted() {
		return this.isHighlighted;
	}

	public void draw(Graphics g) {
		
		if (this.isHighlighted == true) {
			g.setColor(Color.decode("#282828"));
		}
		g.fillOval(xCoordinate, yCoordinate, 100, 100);
		this.isHighlighted = false;
	}

	public String toString() {
		return xCoordinate + " " + yCoordinate + " " + center;
	}

}
