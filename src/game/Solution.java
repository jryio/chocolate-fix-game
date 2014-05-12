package game;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import display_components.Piece;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Solution", propOrder = { "Piece" })
public class Solution {

	private ArrayList<Piece> Piece = new ArrayList<Piece>();
	private ArrayList<ArrayList<Piece>> Solution2D = new ArrayList<ArrayList<Piece>>();

	public ArrayList<Piece> getPiece() {
		return Piece;
	}

	public void setPiece(ArrayList<Piece> sol) {
		this.Piece = sol;
	}

	public ArrayList<ArrayList<Piece>> getSolution() {
		for (Piece p : Piece) {
			if (p.getRow() == 0) {
				Solution2D.get(0).add(p);
			}
			else if(p.getRow() == 1){
				Solution2D.get(1).add(p);
			}
			else if(p.getRow() == 2){
				Solution2D.get(2).add(p);
			}
		}
		return Solution2D;
	}

}
