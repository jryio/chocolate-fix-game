package ChocolateGame;
import java.util.ArrayList;

public class Solver {

	public static boolean Solvable(ArrayList<Clue> a, String[][] colorAnswer,
			String[][] shapeAnswer) {
		String[][] colorSolution = new String[3][3];
		String[][] shapeSolution = new String[3][3];

		shapeSolution = ShapeSolve(a);
		colorSolution = ColorSolve(a);

		if (colorSolution == colorAnswer) {
			if (shapeSolution == shapeAnswer) {
				return true;
			}
		}
		return false;
	}

	public static String[][] ShapeSolve(ArrayList<Clue> a) {
		String[][] answer = new String[3][3];

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).clueShape.length == 3
					&& a.get(i).clueShape[0].length == 3) {
				for (int j = 0; j < a.get(i).clueShape.length; j++) {
					for (int k = 0; k < a.get(i).clueShape[j].length; k++) {
						if (!a.get(i).clueShape[j][k].equals("")) {
							answer[j][k] = a.get(i).clueShape[j][k];
							// if any clues are 3x3 it sets any spaces that are
							// shapes in the clue to the answer shape
						}
					}
				}
			}

		}

		return answer;
	}

	public static String[][] ColorSolve(ArrayList<Clue> a) {
		String[][] answer = new String[3][3];

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).clueColor.length == 3
					&& a.get(i).clueColor[0].length == 3) {
				for (int j = 0; j < a.get(i).clueColor.length; j++) {
					for (int k = 0; k < a.get(i).clueColor[j].length; k++) {
						if (!a.get(i).clueColor[j][k].equals("")) {
							answer[j][k] = a.get(i).clueColor[j][k];
							// if any clues are 3x3 it sets any spaces that are
							// colors in the clue to the answer color
						}
					}
				}
			}

		}

		return answer;
	}
}
