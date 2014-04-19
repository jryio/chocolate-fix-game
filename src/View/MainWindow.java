package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JPanel {

	static final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	static final Color TILE_COLOR = Color.white;
	static final Color SELECTED_COLOR = Color.decode("0x80E680");

	static JFrame frame = new JFrame("Chocolate Fix Game");
	static ClueBar clueBar = new ClueBar();
	static MainWindow canvas = new MainWindow();

	public static void createFrame() {
		frame.setSize(900, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		canvas.setSize(600, 620);
		clueBar.setSize(300, 600);

		frame.add(canvas);
		frame.add(clueBar);
		frame.setLayout(new BorderLayout());
		clueBar.setLocation(600, 0);

		frame.setVisible(true);
	}

	public static void renderGraphics() {
		canvas.paint(canvas.getGraphics());
		clueBar.paint(clueBar.getGraphics());
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

	}

}
