package display;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JPanel;

import display_components.MenuButton;

public class MenuBar extends JPanel {

	private static final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	private static Font ostrichBlack = null;
	
	private static ArrayList<MenuButton> buttons = new ArrayList<MenuButton>();

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

	public Font getFont() {
		return ostrichBlack;
	}

	public void paint(Graphics g) {
		BufferedImage buffImage = new BufferedImage(300, 200,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D buffGraphics = buffImage.createGraphics();

		// Sharper text through anti-aliasing
		buffGraphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		// Sets the font size to 32
		buffGraphics.setFont(ostrichBlack.deriveFont(32F));

		// Menu background - Black
		buffGraphics.setColor(Color.BLACK);
		buffGraphics.fillRect(0, 0, 300, 300);

		// Menu background - green
		buffGraphics.setColor(Color.decode("#4DB870"));
		buffGraphics.fillRect(0, 1, 299, 198);

		// Button 1
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		buttons.add(new MenuButton("Test 1", 50, 25, 200, 40));
		buttons.get(0).paint(buffGraphics);

		// Button 2
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		buttons.add(new MenuButton("Test 2", 50, 80, 200, 40));
		buttons.get(1).paint(buffGraphics);
		
		// Button 3
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		buttons.add(new MenuButton("Test 3", 50, 140, 200, 40));
		buttons.get(2).paint(buffGraphics);
		
		
		// MenuButton Conditionals
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		
		if(buttonPressed.equals("button1")){
			buffGraphics.setColor(Color.decode("#4DB870").darker().darker());
		}
		
		buttons.get(0).paint(buffGraphics);
		
		buffGraphics.setColor(Color.decode("#4DB870").darker());
		
		if(buttonPressed.equals("button2")){
			buffGraphics.setColor(Color.decode("#4DB870").darker().darker());
		}
		buttons.get(1).paint(buffGraphics);

		g.drawImage(buffImage, 0, 0, null);
		buttonPressed = ""; // Reset the buttonPressed identifier
	}
	
	public static ArrayList<MenuButton> getButtons(){
		return buttons;
	}
	

}
