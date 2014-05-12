package game;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Levels")
@XmlAccessorType(XmlAccessType.FIELD)
public class Levels {

	private static ArrayList<Level> Level = new ArrayList<Level>();


	@XmlElement(name = "Level")
	public ArrayList<Level> getLevels() {
		return this.Level;
	}

	public void setLevels(ArrayList<Level> levels) {
		this.Level = levels;
	}

}
