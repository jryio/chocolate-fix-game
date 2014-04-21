package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.MainWindowController;
import Game.MenuBarController;

public class MainWindow extends JPanel {

	//CONFIGURATION CONSTANTS
	static final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	static final Color TILE_COLOR = Color.white;
	static final Color SELECTED_COLOR = Color.decode("0x80E680");

	static JFrame frame = new JFrame("Chocolate Fix Game");
	static MenuBar menuBar = new MenuBar();
	static MainWindow canvas = new MainWindow();

	public static void createFrame() {
		//sets up the base settings - size and exit on close
		frame.setSize(900, 600 + 22);
		frame.setLocation(225, 125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		MenuBarController mb = new MenuBarController();
		MainWindowController mw = new MainWindowController();
		menuBar.addMouseListener(mb);
		canvas.addMouseListener(mw);
		
		//Size settings for the MainWindow (canvas) and the menuBar
		canvas.setSize(600, 600);
		menuBar.setSize(300, 600);
	
		frame.add(canvas);
		frame.add(menuBar);
		frame.setLayout(new BorderLayout());
		canvas.setLocation(0, 0);
		menuBar.setLocation(600, 0);
		menuBar.load();
		
		frame.setVisible(true);
	}

	public static void renderGraphics() {
		canvas.paint(canvas.getGraphics());
	}
	
	public static void updateMenuBar(){
		menuBar.paint(menuBar.getGraphics());
	}

	public void paint(Graphics g) {
		BufferedImage buffImage = new BufferedImage(600, 600,
				BufferedImage.TYPE_INT_RGB);

		Graphics buffGraphics = buffImage.getGraphics();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				buffGraphics.setColor(Color.BLACK);
				buffGraphics.fillRect(i * 200, j * 200, 200, 200);
				
				buffGraphics.setColor(Color.DARK_GRAY);
				buffGraphics.fillRect((i * 200), (j * 200), 199, 199);
				
				buffGraphics.setColor(Color.DARK_GRAY.darker());
				buffGraphics.fillOval((i * 200) + 25, (j * 200) + 25, 150, 150);

			}
		}

		g.drawImage(buffImage, 0, 0, 600, 600, null);
	}

	public static void main(String args[]) {
		createFrame();
		renderGraphics();
		updateMenuBar();
	}

}
