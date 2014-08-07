package display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

import XMLParsing.Piece;
import display_components.BoardTile;

public class GameBoard extends JPanel {

	// CONFIGURATION CONSTANTS
	static final Color BACKGROUND_COLOR = Color.LIGHT_GRAY;
	static final Color BLUE_BACKGROUND_COLOR = Color.decode("#5d88a3");
	static final Color TILE_COLOR = Color.white;
	static final Color SELECTED_COLOR = Color.decode("0x80E680");

	// Array List of BoardTile Centers and Array List of BoardTile objects
	private static ArrayList<Point> BoardTileCenters = new ArrayList<Point>();
	private static ArrayList<BoardTile> BoardTiles = new ArrayList<BoardTile>();
	private static ArrayList<Piece> pieces = new ArrayList<Piece>();

	// PIECES CONSTANTS (9)
	Piece TanCircle = new Piece("T", "C", new Point(0, 50), 50);
	Piece TanSquare = new Piece("T", "S", new Point(60, 50), 50);
	Piece TanTriangle = new Piece("T", "T", new Point(120, 50), 50);
	Piece BrownCircle = new Piece("B", "C", new Point(180, 50), 50);
	Piece BrownSquare = new Piece("B", "S", new Point(240, 50), 50);
	Piece BrownTriangle = new Piece("B", "T", new Point(300, 50), 50);
	Piece PinkCircle = new Piece("P", "C", new Point(360, 50), 50);
	Piece PinkSquare = new Piece("P", "S", new Point(420, 50), 50);
	Piece PinkTriangle = new Piece("P", "T", new Point(480, 50), 50);

	// Counting BoardTile interations
	private static int BoardTileCount = -1;

	// Counting piece interations
	private static int piecesCount = 0;

	public void paint(Graphics g) {
		BufferedImage buffImage = new BufferedImage(900, 600,
				BufferedImage.TYPE_INT_RGB);

		Graphics2D buffGraphics = buffImage.createGraphics();

		// Piece Selector Black Background
		buffGraphics.setColor(Color.BLACK);
		buffGraphics.fillRect(0, 0, 900, 600);

		// Piece Selector Blue Fill
		buffGraphics.setColor(BLUE_BACKGROUND_COLOR);
		buffGraphics.fillRect(1, 0, 898, 599);

		// Black again for the board spaces
		buffGraphics.setColor(Color.BLACK);
		buffGraphics.fillRect(450, 150, 450, 450);

		// Adds Pieces to ArrayList
		pieces.add(TanCircle);
		pieces.add(TanSquare);
		pieces.add(TanTriangle);
		pieces.add(BrownCircle);
		pieces.add(BrownTriangle);
		pieces.add(BrownSquare);
		pieces.add(BrownTriangle);
		pieces.add(PinkCircle);
		pieces.add(PinkSquare);
		pieces.add(PinkTriangle);

		// Iterates through the pieces and paints them
		for (Piece p : pieces) {
			p.draw(buffGraphics);
		}

		// Iterate over the 9 board BoardTiles, create BoardTile objects, then
		// paint the objects
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				// Count the number of BoardTiles rendered and created
				BoardTileCount++;

				int xRect = (i * 150) + 450;
				int yRect = (j * 150) + 150;
				int xBoardTile = xRect + 25;
				int yBoardTile = yRect + 25;

				// Coordinates for center of each BoardTile
				BoardTileCenters
						.add(new Point(xBoardTile + 75, yBoardTile + 75));

				buffGraphics.setColor(Color.BLACK);
				buffGraphics.fillRect(xRect, yRect, 149, 149);

				buffGraphics.setColor(Color.DARK_GRAY);
				buffGraphics.fillRect(xRect, yRect, 148, 148);

				// Same object over and over for the addition of BoardTile
				// objects
				buffGraphics.setColor(Color.DARK_GRAY.darker());
				BoardTiles.add(BoardTileCount, new BoardTile(xBoardTile,
						yBoardTile, BoardTileCenters.get(BoardTileCount)));
				BoardTiles.get(BoardTileCount).draw(buffGraphics);
			}
		}

		for (BoardTile b : BoardTiles) {
			if (b.getHighlighted() == true) {
				b.draw(buffGraphics);
			}
		}

		// Draw image to graphics object
		g.drawImage(buffImage, 0, 0, 900, 600, null);
	}

	public static ArrayList<Point> getBoardTileCenters() {
		return BoardTileCenters;
	}

	public static ArrayList<BoardTile> getBoardTiles() {
		return BoardTiles;
	}

	public static ArrayList<Piece> getPieces() {
		return pieces;
	}

}
