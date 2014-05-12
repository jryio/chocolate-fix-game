package game;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import display_components.Clue;
import display_components.Piece;

public class Level {

	private List<List<Piece>> levelSolution = new ArrayList<List<Piece>>();
	private ArrayList<Clue> levelClues = new ArrayList<Clue>();
	private int id;
	
	public Level(List<List<Piece>> solution, ArrayList<Clue> clues) {
		this.levelSolution = solution;
		this.levelClues = clues;
	}

	public List<List<Piece>> getSolution() {
		return levelSolution;
	}

	public void setSolution(List<List<Piece>> solution) {
		this.levelSolution = solution;
	}


	public ArrayList<Clue> getClues() {
		return levelClues;
	}

	public void setClues(ArrayList<Clue> clues) {
		this.levelClues = clues;
	}

	public int getId() {
		return id;
	}

	public void setId(String idString) {
		this.id = Integer.parseInt(idString);
	}
	
	public String toString(){
		return "Level id: " + id + "Level Solution" + levelSolution.toString();
	}
}
