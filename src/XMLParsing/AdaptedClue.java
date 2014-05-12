package XMLParsing;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import display_components.Piece;

@XmlRootElement(name = "Levels")
public class AdaptedClue {
	
	private List<List<Piece>> clue = new ArrayList<List<Piece>>();
	private int id;
	
	@XmlJavaTypeAdapter(PieceAdapter.class)
	public List<List<Piece>> getClue() {
		return clue;
	}

	public void setClue(List<Piece> clueInput) {
		for(Piece p: clueInput){
			clue.get(p.getRow()).add(p);
		}
	}

	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}

	public void setId(String idInput) {
		this.id = Integer.parseInt(idInput);
	}

	public void setClueInput(List<List<Piece>> clue2) {
		this.clue = clue2;
	}
	
	
}
