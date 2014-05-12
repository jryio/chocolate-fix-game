package XMLParsing;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import display_components.Clue;

public class ClueAdapter extends XmlAdapter<AdaptedClue, Clue> {

	@Override
	public Clue unmarshal(AdaptedClue v) throws Exception {
		return new Clue(v.getClue(), "" + v.getId());
	}

	@Override
	public AdaptedClue marshal(Clue v) throws Exception {
		AdaptedClue adaptedClue = new AdaptedClue();
		adaptedClue.setClueInput(v.getClue());
		adaptedClue.setId("" + v.getId());
		return adaptedClue;
		
	}

}
