package game;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import display_components.Clue;
import display_components.Piece;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Level", propOrder = { "Solution", "Clues", "id" })
public class Level {

	@XmlElementWrapper(name = "Solution")
	@XmlElement(name = "Piece")
	private ArrayList<Piece> Solution = new ArrayList<Piece>();
	
	private ArrayList<ArrayList<Piece>> Solution2D = new ArrayList<ArrayList<Piece>>();
	private ArrayList<Clue> Clues = new ArrayList<Clue>();
	private int id;

	// public Level(List<List<Piece>> solution, ArrayList<Clue> clues) {
	// this.Solution = solution;
	// this.Clues = clues;
	// }

	public ArrayList<Piece> getSolution() {
		return Solution;
	}

	public void setSolution(ArrayList<Piece> solution) {
		this.Solution = solution;
	}

	public ArrayList<Clue> getClues() {
		return Clues;
	}

	public void setClues(ArrayList<Clue> clues) {
		this.Clues = clues;
	}

	public int getId() {
		return id;
	}

	public void setId(String idString) {
		this.id = Integer.parseInt(idString);
	}

	public String toString() {
		return "Level id: " + id + "Level Solution" + Solution.toString();
	}
}
