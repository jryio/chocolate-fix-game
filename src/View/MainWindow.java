package View;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import Game.GameBoardController;
import Game.MenuBarController;

public class MainWindow extends JFrame {


	static MainWindow frame = new MainWindow("Chocolate Fix Game");
	static MenuBar menuBar = new MenuBar();
	static GameBoard board = new GameBoard();

	public MainWindow(String string) {
		
		super(string);
	}

	public static void createWindow() {
		// sets up the base settings - size and exit on close
		frame.setSize(900, 600 + 22);
		frame.setLocation(225, 125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		MenuBarController mb = new MenuBarController();
		GameBoardController mw = new GameBoardController();
		menuBar.addMouseListener(mb);
		board.addMouseMotionListener(mw);

		// Size settings for the MainWindow (board) and the menuBar
		board.setSize(600, 600);
		menuBar.setSize(300, 300);

		frame.add(board);
		frame.add(menuBar);
		frame.setLayout(new BorderLayout());
		board.setLocation(0, 0);
		menuBar.setLocation(600, 300);
		menuBar.load();

		frame.setVisible(true);
	}

	public static void updateGameBoard() {
		board.paint(board.getGraphics());
	}

	public static void updateMenuBar() {
		menuBar.paint(menuBar.getGraphics());
	}

	/*
	 * Used for Testing
	 */
	public static void main(String args[]) {

		createWindow();
		updateGameBoard();
		updateMenuBar();
		// System.out.println(GameBoard.getCircles().toString());

	}

}
