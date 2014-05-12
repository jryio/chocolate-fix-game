package display_components;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import display.MenuBar;

public class MenuButton extends JPanel {

	private String buttonText = "";
	private int xPos, yPos, rectWidth, rectHeight, textWidth, textHeight;

	private MenuBar font = new MenuBar();

	public MenuButton(String t, int posX, int posY, int width, int height) {
		buttonText = t;
		xPos = posX;
		yPos = posY;
		rectWidth = width;
		rectHeight = height;
	}

	public void paint(Graphics2D g) {

		g.setFont(font.getFont());
		g.setFont(font.getFont().deriveFont(32F));
		FontMetrics fm = getFontMetrics(g.getFont());

		Rectangle2D buttonTextBounds = fm.getStringBounds(buttonText, g);

		g.fillRect(xPos, yPos, rectWidth, rectHeight);

		g.setColor(Color.BLACK);

		g.drawString(buttonText,
				xPos + (rectWidth - (int) buttonTextBounds.getWidth()) / 2,
				(yPos + rectHeight) - rectHeight/ 5);
	}

	public boolean contains(Point p) {

		return ((p.getX() > xPos) && (p.getX() < (xPos + rectWidth)))
				&& ((p.getY() > yPos) && (p.getY() < (yPos + rectHeight)));
	}
}
