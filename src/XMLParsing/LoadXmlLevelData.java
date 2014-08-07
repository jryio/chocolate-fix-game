package XMLParsing;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class LoadXmlLevelData {

	private static Levels levels;

	public static void load() {
		try {

			File file = new File("res/Levels.xml");

			JAXBContext jaxbContext = JAXBContext.newInstance(Levels.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			levels = (Levels) jaxbUnmarshaller.unmarshal(file);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Levels getLevels() {
		return levels;
	}

}
