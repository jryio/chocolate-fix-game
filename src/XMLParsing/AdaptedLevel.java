package XMLParsing;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import display_components.Clue;
import display_components.Piece;

@XmlRootElement(name = "Levels")
public class AdaptedLevel {
	
	private int id;
	
	private List<List<Piece>> levelSolution = new ArrayList<List<Piece>>();
	private ArrayList<Clue> levelClues = new ArrayList<Clue>();
	
	@XmlJavaTypeAdapter(PieceAdapter.class)
	public List<List<Piece>> getSolution(){
		return levelSolution;
	}
	
	public void setSolution(List<List<Piece>> solution){
		this.levelSolution = solution;
	}
	
	@XmlJavaTypeAdapter(ClueAdapter.class)
	public ArrayList<Clue> getClues(){
		return levelClues;
	}
	
	public void setClues(ArrayList<Clue> clues){
		this.levelClues = clues;
	}
	
	@XmlAttribute(name = "id")
	public int getId(){
		return id;
	}
	
	public void setId(String idString){
		this.id = Integer.parseInt(idString);
	}

}
