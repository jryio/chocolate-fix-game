package View;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ClueBar extends JPanel {
	
	private static final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	
	public void paint(Graphics g){
		BufferedImage buffImage = new BufferedImage(300, 600, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D buffGraphics = buffImage.createGraphics();
		
		buffGraphics.setColor(Color.WHITE);
		buffGraphics.fillRect(0, 0, 300, 600);
		
		buffGraphics.setColor(Color.BLACK);
		FontMetrics fm = getFontMetrics(g.getFont());
		int width = fm.stringWidth("Hello");
		buffGraphics.drawString("Hello", (200-width), 40);

		
		g.drawImage(buffImage, 0, 0, null);
		
	}

}
