package game;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import XMLParsing.Clue;
import XMLParsing.Piece;

@XmlRootElement(name = "Level")
@XmlAccessorType(XmlAccessType.FIELD)
public class Level {

	@XmlElement(name = "Solution")
	private Solution Solution;

	private ArrayList<ArrayList<Piece>> Solution2D = new ArrayList<ArrayList<Piece>>();
	
	@XmlElement(name = "Clue")
	private ArrayList<Clue> Clues = new ArrayList<Clue>();
	
	@XmlAttribute(name = "id")
	private int id;

	//	public Level(List<List<Piece>> solution, ArrayList<Clue> clues) {
	//		this.Solution = solution;
	//		this.Clues = clues;
	//	}

	public Solution getSolution() {
		return this.Solution;
	}

	public void setSolution(Solution solution) {
		this.Solution = solution;
	}

	public ArrayList<Clue> getClues() {
		return this.Clues;
	}

	public void setClues(ArrayList<Clue> clues) {
		this.Clues = clues;
	}

	public int getId() {
		return this.id;
	}

	public void setId(String idString) {
		this.id = Integer.parseInt(idString);
	}

	public String toString() {
		return "Level id: " + id + "Level Solution" + Solution.toString();
	}
}
