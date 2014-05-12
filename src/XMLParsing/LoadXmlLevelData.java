package XMLParsing;

import game.Level;
import game.Levels;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class LoadXmlLevelData {

	public static void load() {
		try{
			
			File file = new File("res/Levels.xml");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Levels.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			
			Levels levels = (Levels) jaxbUnmarshaller.unmarshal(new File("res/Levels.xml"));
			
			System.out.println(levels.getLevels().get(0).toString());
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]){
		load();
	}
	
	
}
