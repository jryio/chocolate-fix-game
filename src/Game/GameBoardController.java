package game;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import display.GameBoard;
import display.MainWindow;

public class GameBoardController implements MouseMotionListener, MouseListener {

	public void mouseMoved(MouseEvent e) {

		/*
		 * Conditionals for changing the colors of tiles as the mouse enters
		 */

		// Column 1
		if (GameBoard.getBoardTiles().get(0).contains(e.getPoint())) {

			// Tile Entered 1,1
			GameBoard.getBoardTiles().get(0).setHighlighted(true);
			MainWindow.updateGameBoard();

		} else if (GameBoard.getBoardTiles().get(1).contains(e.getPoint())) {

			// Tile Entered 1,2
			GameBoard.getBoardTiles().get(1).setHighlighted(true);
			MainWindow.updateGameBoard();

		} else if (GameBoard.getBoardTiles().get(2).contains(e.getPoint())) {

			// Tile Entered 1,3
			GameBoard.getBoardTiles().get(2).setHighlighted(true);
			MainWindow.updateGameBoard();

		}

		// Column 2
		else if (GameBoard.getBoardTiles().get(3).contains(e.getPoint())) {

			// Tile Entered 2,1
			GameBoard.getBoardTiles().get(3).setHighlighted(true);
			MainWindow.updateGameBoard();

		} else if (GameBoard.getBoardTiles().get(4).contains(e.getPoint())) {

			// Tile Entered 2,2
			GameBoard.getBoardTiles().get(4).setHighlighted(true);
			MainWindow.updateGameBoard();

		} else if (GameBoard.getBoardTiles().get(5).contains(e.getPoint())) {

			// Tile Entered 2,3
			GameBoard.getBoardTiles().get(5).setHighlighted(true);
			MainWindow.updateGameBoard();

		}

		// Column 3
		else if (GameBoard.getBoardTiles().get(6).contains(e.getPoint())) {

			// Tile Entered 3,1
			GameBoard.getBoardTiles().get(6).setHighlighted(true);
			MainWindow.updateGameBoard();

		} else if (GameBoard.getBoardTiles().get(7).contains(e.getPoint())) {

			// Tile Entered 3,2
			GameBoard.getBoardTiles().get(7).setHighlighted(true);
			MainWindow.updateGameBoard();

		} else if (GameBoard.getBoardTiles().get(8).contains(e.getPoint())) {

			// Tile Entered 3,3
			GameBoard.getBoardTiles().get(8).setHighlighted(true);
			MainWindow.updateGameBoard();
		} else {
			MainWindow.updateGameBoard();
		}

	}

	public void mouseClicked(MouseEvent e) {

		/*
		 * Conditionals for registering if the mouse is clicked and contained
		 * within the tile
		 */

		// Column 1
		// if (GameBoard.getBoardTiles().get(0).contains(e.getPoint())) {
		// GameBoard.tileClicked = "1,1";
		// MainWindow.updateGameBoard();
		// } else if (GameBoard.getBoardTiles().get(1).contains(e.getPoint())) {
		// GameBoard.tileClicked = "1,2";
		// MainWindow.updateGameBoard();
		//
		// } else if (GameBoard.getBoardTiles().get(2).contains(e.getPoint())) {
		// GameBoard.tileClicked = "1,3";
		// MainWindow.updateGameBoard();
		//
		// }
		//
		// // Column 2
		// else if (GameBoard.getBoardTiles().get(3).contains(e.getPoint())) {
		// GameBoard.tileClicked = "2,1";
		// MainWindow.updateGameBoard();
		//
		// } else if (GameBoard.getBoardTiles().get(4).contains(e.getPoint())) {
		// GameBoard.tileClicked = "2,2";
		// MainWindow.updateGameBoard();
		//
		// } else if (GameBoard.getBoardTiles().get(5).contains(e.getPoint())) {
		// GameBoard.tileClicked = "2,3";
		// MainWindow.updateGameBoard();
		//
		// }
		//
		// // Column 3
		// else if (GameBoard.getBoardTiles().get(6).contains(e.getPoint())) {
		// GameBoard.tileClicked = "3,1";
		// MainWindow.updateGameBoard();
		//
		// } else if (GameBoard.getBoardTiles().get(7).contains(e.getPoint())) {
		// GameBoard.tileClicked = "3,2";
		// MainWindow.updateGameBoard();
		//
		// } else if (GameBoard.getBoardTiles().get(8).contains(e.getPoint())) {
		// GameBoard.tileClicked = "3,3";
		// MainWindow.updateGameBoard();
		//
		// } else {
		// GameBoard.tileClicked = "";
		// MainWindow.updateGameBoard();
		// }

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	// Will be used for drag and drop functionality
	public void mouseDragged(MouseEvent e) {

		// Tan Circle
		if (GameBoard.getPieces().get(0).contains(e.getPoint())) {
			GameBoard
					.getPieces()
					.get(0)
					.setLocation(
							new Point(
									Math.abs(e.getPoint().x
											- (GameBoard.getPieces().get(0)
													.getLocation().x - e
													.getPoint().x)), Math.abs(e
											.getPoint().y
											- (GameBoard.getPieces().get(0)
													.getLocation().y - e
													.getPoint().y))));
			MainWindow.updateGameBoard();
		}

		// Tan Square
		else if (GameBoard.getPieces().get(1).contains(e.getPoint())) {

		}

		// Tan Triangle
		else if (GameBoard.getPieces().get(2).contains(e.getPoint())) {

		}

		// Brown Circle
		else if (GameBoard.getPieces().get(3).contains(e.getPoint())) {

		}

		// Brown Square
		else if (GameBoard.getPieces().get(4).contains(e.getPoint())) {

		}

		// Brown Triangle
		else if (GameBoard.getPieces().get(5).contains(e.getPoint())) {

		}

		// Pink Circle
		else if (GameBoard.getPieces().get(6).contains(e.getPoint())) {

		}

		// Pink Square
		else if (GameBoard.getPieces().get(7).contains(e.getPoint())) {

		}

		// Pink Triangle
		else if (GameBoard.getPieces().get(8).contains(e.getPoint())) {

		} else {
			MainWindow.updateGameBoard();
		}
	}
}
