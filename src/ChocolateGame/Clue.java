package ChocolateGame;
import java.util.ArrayList;

public class Clue {

	public String[][] clueColor;
	public String[][] clueShape;

	public Clue(int x, int y, ArrayList<String[]> b, ArrayList<String[]> c) {
		// pass a size for the clue, the colors in each space(list b) and the
		// shape in each space(list c)
		clueColor = new String[x][y];
		clueShape = new String[x][y];

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				clueColor[i][j] = b.get(i)[j];
				// puts all the color clues into an array
			}
		}

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				clueShape[i][j] = c.get(i)[j];
				// puts all the shape clues into an array
			}
		}
	}

	public String getColor(int x, int y) {
		return clueColor[x][y];
	}

	public String getShape(int x, int y) {
		return clueShape[x][y];
	}
}
