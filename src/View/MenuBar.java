package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JPanel;

public class MenuBar extends JPanel {

	private static final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	private static Font ostrichBlack = null;
	private static Font ostrichRounded = null;

	private static Rectangle button1;
	private static Rectangle button2;

	public static String buttonPressed = "";
	public static String buttonEntered = "";

	public void load() {

		try {
			ostrichBlack = Font.createFont(Font.TRUETYPE_FONT, new File(
					"res/ostrich-black.ttf"));
		} catch (Exception e) {
			System.out.println("Could not load font");
			e.printStackTrace();
		}
	}

	public void paint(Graphics g) {
		BufferedImage buffImage = new BufferedImage(300, 600,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D buffGraphics = buffImage.createGraphics();

		// Sharper text through anti-aliasing
		buffGraphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// Sets the font size to 32
		buffGraphics.setFont(ostrichBlack.deriveFont(32F));

		// Menu background - Black
		
		
		
		// Menu background - green
		buffGraphics.setColor(Color.decode("#4DB870"));
		buffGraphics.fillRect(0, 0, 300, 600);

		// FontMetrics - Width and Height of text
		FontMetrics fm = getFontMetrics(g.getFont());
		int widthHello = fm.stringWidth("Hello");
		int widthStart = fm.stringWidth("Start");

		// TODO - reposition text to be in the center of the MenuBar JPanel 
		// TODO - reposition the buttons around the text (+60 px on each side)
		
		// Button1
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		button1 = new Rectangle(30, 420, 240, 60);
		buffGraphics.fill(button1);
		// buffGraphics.fillRect(30, 420, 240, 60);

		// Text - Button1
		buffGraphics.setColor(Color.BLACK);
		buffGraphics.drawString("Start", 150 - widthStart, 465);

		// Button2
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		button2 = new Rectangle(30, 510, 240, 60);
		// buffGraphics.fillRect(30, 510, 240, 60);

		// Colors and draws the second String (centered to the button)
		buffGraphics.setColor(Color.BLACK);
		buffGraphics.drawString("Hello", 150 - widthStart, 555);

		/*
		 * Rendering based on mouse actions from MenuBarController.java
		 */
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		if (buttonPressed.equals("button1")) {
			buffGraphics.setColor(Color.decode("#4DB870").darker().darker());

		}
		buffGraphics.fill(button1);
		buffGraphics.setColor(Color.BLACK);
		buffGraphics.drawString("Start", 150 - widthStart, 465);

		buffGraphics.setColor(Color.decode("#4DB870").darker());
		if (buttonPressed.equals("button2")) {
			buffGraphics.setColor(Color.decode("#4DB870").darker().darker());
		}
		buffGraphics.fill(button2);
		buffGraphics.setColor(Color.BLACK);
		buffGraphics.drawString("Hello", 150 - widthStart, 555);

		// Draws the buffered image
		g.drawImage(buffImage, 0, 0, null);
		buttonPressed = "";
	}

}
