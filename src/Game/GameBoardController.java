package game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import display.GameBoard;
import display.MainWindow;

public class GameBoardController implements MouseMotionListener, MouseListener {
	private MouseListener mouse;


	public void mouseMoved(MouseEvent e) {

		// Column 1
		if (GameBoard.getCircles().get(0).contains(e.getPoint())) {
			GameBoard.tileEntered = "1,1";
			MainWindow.updateGameBoard();
		} else if (GameBoard.getCircles().get(1).contains(e.getPoint())) {
			GameBoard.tileEntered = "1,2";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(2).contains(e.getPoint())) {
			GameBoard.tileEntered = "1,3";
			MainWindow.updateGameBoard();

		}

		// Column 2
		else if (GameBoard.getCircles().get(3).contains(e.getPoint())) {
			GameBoard.tileEntered = "2,1";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(4).contains(e.getPoint())) {
			GameBoard.tileEntered = "2,2";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(5).contains(e.getPoint())) {
			GameBoard.tileEntered = "2,3";
			MainWindow.updateGameBoard();

		}

		// Column 3
		else if (GameBoard.getCircles().get(6).contains(e.getPoint())) {
			GameBoard.tileEntered = "3,1";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(7).contains(e.getPoint())) {
			GameBoard.tileEntered = "3,2";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(8).contains(e.getPoint())) {
			GameBoard.tileEntered = "3,3";
			MainWindow.updateGameBoard();

		} else {
			GameBoard.tileEntered = "";
			MainWindow.updateGameBoard();
		}

	}

	public void mouseClicked(MouseEvent e) {
		
		// Column 1
		if (GameBoard.getCircles().get(0).contains(e.getPoint())) {
			GameBoard.tileClicked = "1,1";
			MainWindow.updateGameBoard();
		} else if (GameBoard.getCircles().get(1).contains(e.getPoint())) {
			GameBoard.tileClicked = "1,2";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(2).contains(e.getPoint())) {
			GameBoard.tileClicked = "1,3";
			MainWindow.updateGameBoard();

		}

		// Column 2
		else if (GameBoard.getCircles().get(3).contains(e.getPoint())) {
			GameBoard.tileClicked = "2,1";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(4).contains(e.getPoint())) {
			GameBoard.tileClicked = "2,2";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(5).contains(e.getPoint())) {
			GameBoard.tileClicked = "2,3";
			MainWindow.updateGameBoard();

		}

		// Column 3
		else if (GameBoard.getCircles().get(6).contains(e.getPoint())) {
			GameBoard.tileClicked = "3,1";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(7).contains(e.getPoint())) {
			GameBoard.tileClicked = "3,2";
			MainWindow.updateGameBoard();

		} else if (GameBoard.getCircles().get(8).contains(e.getPoint())) {
			GameBoard.tileClicked = "3,3";
			MainWindow.updateGameBoard();

		} else {
			GameBoard.tileClicked = "";
			MainWindow.updateGameBoard();
		}

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}
	public void mousePressed(MouseEvent e) {

	}
	
	public void mouseDragged(MouseEvent e) {

	}

}
