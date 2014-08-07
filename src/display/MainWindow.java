 package display;

import game.GameBoardController;
import game.MenuBarController;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import XMLParsing.LoadXmlLevelData;

public class MainWindow extends JFrame {

	static MainWindow frame = new MainWindow("Chocolate Fix Game");
	static MenuBar menuBar = new MenuBar();
	static GameBoard board = new GameBoard();

	static ClueBar clueBar = new ClueBar();

	public MainWindow(String string) {

		super(string);
	}

	public static void createWindow() {
		// sets up the base settings - size and exit on close
		frame.setSize(1200, 600 + 22);
		frame.setLocation(225, 125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		

		MenuBarController mb = new MenuBarController();
		GameBoardController mw = new GameBoardController();
		menuBar.addMouseListener(mb);
		board.addMouseMotionListener(mw);
		//pieceBoard.addMouseMotionListener(pbc);
		//frame.addMouseMotionListener(pbc);
		
		// Size settings for the MainWindow (board) and the menuBar
		board.setSize(900, 600);
		menuBar.setSize(300, 200);
		
		frame.add(board);
		frame.add(menuBar);
		frame.setLayout(new BorderLayout());
		board.setLocation(0, 0);
		menuBar.setLocation(900, 400);
		menuBar.load();

		frame.setVisible(true);
	}

	public static void updateGameBoard() {
		board.repaint();
	}

	public static void updateMenuBar() {
		menuBar.repaint();
	}
	
	/*
	 * Used for Testing
	 */
	public static void main(String args[]) {

		// Creates the frame and adds the component panels to them
		createWindow();

		// Calls the game board paint() method to paint onto its component
		updateGameBoard();

		// Calls the menu bar paint() method to paint onto its components
		updateMenuBar();

		// Instantiates the JAXB XML Parser to unmarshall the Levels.xml file
		// into an object heirarchy
		LoadXmlLevelData.load();
	}

}
