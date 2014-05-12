package display_components;

import java.util.ArrayList;
import java.util.List;

public class Clue {

	private List<List<Piece>> clue = new ArrayList<List<Piece>>();
	private int id;

	public Clue(List<List<Piece>> pieces, String id) {
		this.clue = pieces;
		this.id = Integer.parseInt(id);

	}

	public List<List<Piece>> getClue() {
		return clue;
	}

	public void setClue(List<List<Piece>> clueInput) {
		this.clue = clueInput;
	}

	public int getId() {
		return id;
	}

	public void setId(String idInput) {
		this.id = Integer.parseInt(idInput);
	}
}
