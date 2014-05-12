package game;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import XMLParsing.LevelAdapter;

@XmlRootElement(name = "Levels")
public class Levels {

	private static ArrayList<Level> LEVELS = new ArrayList<Level>();

	@XmlJavaTypeAdapter(LevelAdapter.class)
	public ArrayList<Level> getLevels() {
		return LEVELS;
	}
	
	public void setLevels(ArrayList<Level> levels){
		this.LEVELS = levels;
	}

}
