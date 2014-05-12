package XMLParsing;

import game.Level;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LevelAdapter extends XmlAdapter<AdaptedLevel, Level> {

	@Override
	public Level unmarshal(AdaptedLevel v) throws Exception {
		return new Level(v.getSolution(), v.getClues());
	}

	@Override
	public AdaptedLevel marshal(Level v) throws Exception {
		AdaptedLevel adaptedLevel = new AdaptedLevel();
		adaptedLevel.setSolution(v.getSolution());
		adaptedLevel.setClues(v.getClues());
		adaptedLevel.setId("" + v.getId());
		return adaptedLevel;
	}
}
