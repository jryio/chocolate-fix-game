package game;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Levels", propOrder = "Level")
public class Levels {

	private static ArrayList<Level> Level = new ArrayList<Level>();


	public ArrayList<Level> getLevels() {
		return Level;
	}

	public void setLevels(ArrayList<Level> levels) {
		this.Level = levels;
	}

}
