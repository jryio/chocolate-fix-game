package display_components;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Levels")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clue", propOrder = {"Piece"})
public class Clue {

	private ArrayList<Piece> Piece = new ArrayList<Piece>();
	private ArrayList<ArrayList<Piece>> Clue2D = new ArrayList<ArrayList<Piece>>();
	private int id;


	public ArrayList<Piece> getPiece() {
		return Piece ;
	}

	public void setPiece(ArrayList<Piece> Pieces) {
		this.Piece = Pieces;
	}
	
	public ArrayList<ArrayList<Piece>> getClue(){
		for(Piece p : Piece){
			if (p.getRow() == 0) {
				Clue2D.get(0).add(p);
			}
			else if(p.getRow() == 1){
				Clue2D.get(1).add(p);
			}
			else if(p.getRow() == 2){
				Clue2D.get(2).add(p);
			}
		}
		return Clue2D;
	}

	public int getId() {
		return id;
	}

	public void setId(String idInput) {
		this.id = Integer.parseInt(idInput);
	}
}
