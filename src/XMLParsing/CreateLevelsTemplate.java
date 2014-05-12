package XMLParsing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateLevelsTemplate {

	public static void init() throws ParserConfigurationException,
			TransformerException, FileNotFoundException {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// ROOT ELEMENT - Levels
		Document doc = docBuilder.newDocument();

		Element rootElement = doc.createElement("Levels");
		doc.appendChild(rootElement);

		for (int a = 0; a < 20; a++) {

			// Level element
			Element Level = doc.createElement("Level");

			// Level Difficulty
			Attr levelDifficulty = doc.createAttribute("Difficulty");
			levelDifficulty.setValue("Beginner");
			Level.setAttributeNode(levelDifficulty);

			// Level index
			Attr levelIndex = doc.createAttribute("id");
			levelIndex.setValue("" + a);
			Level.setAttributeNode(levelIndex);

			// Add Solution
			Element Solution = doc.createElement("Solution");
			Level.appendChild(Solution);

			// Add Rows and Columns
			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {

					Element Piece = doc.createElement("Piece");

					Attr row = doc.createAttribute("x");
					row.setValue("" + j);
					Piece.setAttributeNode(row);

					Attr column = doc.createAttribute("y");
					column.setValue("" + k);
					Piece.setAttributeNode(column);

					Element Color = doc.createElement("Color");
					Piece.appendChild(Color);

					Element Shape = doc.createElement("Shape");
					Piece.appendChild(Shape);

					Solution.appendChild(Piece);
				}

			}

			// Add Clues
			Element Clues = doc.createElement("Clues");
			Level.appendChild(Clues);
			for (int l = 0; l < 4; l++) {
				// Create Clue
				Element Clue = doc.createElement("Clue");

				Attr clueIndex = doc.createAttribute("id");
				clueIndex.setValue("" + l);
				Clue.setAttributeNode(clueIndex);

				// Add Rows
				for (int m = 0; m < 3; m++) {

					// Add Columns
					for (int n = 0; n < 3; n++) {
						Element Piece = doc.createElement("Piece");

						Attr row = doc.createAttribute("r");
						row.setValue("" + m);
						Piece.setAttributeNode(row);

						Attr column = doc.createAttribute("c");
						column.setValue("" + n);
						Piece.setAttributeNode(column);

						Element Color = doc.createElement("Color");

						Element Shape = doc.createElement("Shape");

						Piece.appendChild(Color);
						Piece.appendChild(Shape);

						Clue.appendChild(Piece);
					}
				}
				Clues.appendChild(Clue);
			}
			rootElement.appendChild(Level);
			/*
			 * } else if (a >= 20 && a < 39) { // Level element Element Level =
			 * doc.createElement("Level"); rootElement.appendChild(Level);
			 * 
			 * // Level Difficulty Attr levelDifficulty =
			 * doc.createAttribute("Difficulty");
			 * levelDifficulty.setValue("Intermediate");
			 * Level.setAttributeNode(levelDifficulty);
			 * 
			 * // Level index Attr levelIndex = doc.createAttribute("id");
			 * levelIndex.setValue("" + a); Level.setAttributeNode(levelIndex);
			 * 
			 * // Add Solution Element Solution = doc.createElement("Solution");
			 * Level.appendChild(Solution);
			 * 
			 * // Add Rows and Columns for (int j = 0; j < 3; j++) {
			 * 
			 * Element Row = doc.createElement("Row");
			 * 
			 * Attr rowIndex = doc.createAttribute("id"); rowIndex.setValue("" +
			 * j); Row.setAttributeNode(rowIndex);
			 * 
			 * for (int k = 0; k < 3; k++) {
			 * 
			 * Element Column = doc.createElement("Column");
			 * 
			 * Attr columnIndex = doc.createAttribute("id");
			 * columnIndex.setValue("" + k);
			 * Column.setAttributeNode(columnIndex);
			 * 
			 * Element Piece = doc.createElement("Piece");
			 * 
			 * Element Color = doc.createElement("Color");
			 * Piece.appendChild(Color);
			 * 
			 * Element Shape = doc.createElement("Shape");
			 * Piece.appendChild(Shape);
			 * 
			 * Column.appendChild(Piece); Row.appendChild(Column); }
			 * Solution.appendChild(Row); }
			 * 
			 * // Add Clues Element Clues = doc.createElement("Clues");
			 * Level.appendChild(Clues); for (int l = 0; l < 4; l++) { // Create
			 * Clue Element Clue = doc.createElement("Clue");
			 * 
			 * Attr clueIndex = doc.createAttribute("id"); clueIndex.setValue(""
			 * + l); Clue.setAttributeNode(clueIndex);
			 * 
			 * // Add Rows for (int m = 0; m < 3; m++) {
			 * 
			 * Element Row = doc.createElement("Row"); Attr rowIndex =
			 * doc.createAttribute("id"); rowIndex.setValue("" + m);
			 * Row.setAttributeNode(rowIndex);
			 * 
			 * // Add Columns for (int n = 0; n < 3; n++) { Element Column =
			 * doc.createElement("Column"); Attr columnIndex =
			 * doc.createAttribute("id"); Column.setAttributeNode(columnIndex);
			 * 
			 * Element Piece = doc.createElement("Piece"); Element Color =
			 * doc.createElement("Color"); Element Shape =
			 * doc.createElement("Shape");
			 * 
			 * Piece.appendChild(Color); Piece.appendChild(Shape);
			 * 
			 * Column.appendChild(Piece); Row.appendChild(Column);
			 * Clue.appendChild(Row); }
			 * 
			 * } Clues.appendChild(Clue); } rootElement.appendChild(Level); }
			 * else if (a >= 39 && a < 59) {
			 * 
			 * // Level element Element Level = doc.createElement("Level");
			 * rootElement.appendChild(Level);
			 * 
			 * // Level Difficulty Attr levelDifficulty =
			 * doc.createAttribute("Difficulty");
			 * levelDifficulty.setValue("Intermediate");
			 * Level.setAttributeNode(levelDifficulty);
			 * 
			 * // Level index Attr levelIndex = doc.createAttribute("id");
			 * levelIndex.setValue("" + a); Level.setAttributeNode(levelIndex);
			 * 
			 * // Add Solution Element Solution = doc.createElement("Solution");
			 * Level.appendChild(Solution);
			 * 
			 * // Add Rows and Columns for (int j = 0; j < 3; j++) {
			 * 
			 * Element Row = doc.createElement("Row");
			 * 
			 * Attr rowIndex = doc.createAttribute("id"); rowIndex.setValue("" +
			 * j); Row.setAttributeNode(rowIndex);
			 * 
			 * for (int k = 0; k < 3; k++) {
			 * 
			 * Element Column = doc.createElement("Column");
			 * 
			 * Attr columnIndex = doc.createAttribute("id");
			 * columnIndex.setValue("" + k);
			 * Column.setAttributeNode(columnIndex);
			 * 
			 * Element Piece = doc.createElement("Piece");
			 * 
			 * Element Color = doc.createElement("Color");
			 * Piece.appendChild(Color);
			 * 
			 * Element Shape = doc.createElement("Shape");
			 * Piece.appendChild(Shape);
			 * 
			 * Column.appendChild(Piece); Row.appendChild(Column); }
			 * Solution.appendChild(Row); }
			 * 
			 * // Add Clues Element Clues = doc.createElement("Clues");
			 * Level.appendChild(Clues); for (int l = 0; l < 4; l++) { // Create
			 * Clue Element Clue = doc.createElement("Clue");
			 * 
			 * Attr clueIndex = doc.createAttribute("id"); clueIndex.setValue(""
			 * + l); Clue.setAttributeNode(clueIndex);
			 * 
			 * // Add Rows for (int m = 0; m < 3; m++) {
			 * 
			 * Element Row = doc.createElement("Row"); Attr rowIndex =
			 * doc.createAttribute("id"); rowIndex.setValue("" + m);
			 * Row.setAttributeNode(rowIndex);
			 * 
			 * // Add Columns for (int n = 0; n < 3; n++) { Element Column =
			 * doc.createElement("Column"); Attr columnIndex =
			 * doc.createAttribute("id"); Column.setAttributeNode(columnIndex);
			 * 
			 * Element Piece = doc.createElement("Piece"); Element Color =
			 * doc.createElement("Color"); Element Shape =
			 * doc.createElement("Shape");
			 * 
			 * Piece.appendChild(Color); Piece.appendChild(Shape);
			 * 
			 * Column.appendChild(Piece); Row.appendChild(Column);
			 * Clue.appendChild(Row); }
			 * 
			 * } Clues.appendChild(Clue); } rootElement.appendChild(Level); }
			 * else if (a >= 59 && a < 79) { // Level element Element Level =
			 * doc.createElement("Level"); rootElement.appendChild(Level);
			 * 
			 * // Level Difficulty Attr levelDifficulty =
			 * doc.createAttribute("Difficulty");
			 * levelDifficulty.setValue("Intermediate");
			 * Level.setAttributeNode(levelDifficulty);
			 * 
			 * // Level index Attr levelIndex = doc.createAttribute("id");
			 * levelIndex.setValue("" + a); Level.setAttributeNode(levelIndex);
			 * 
			 * // Add Solution Element Solution = doc.createElement("Solution");
			 * Level.appendChild(Solution);
			 * 
			 * // Add Rows and Columns for (int j = 0; j < 3; j++) {
			 * 
			 * Element Row = doc.createElement("Row");
			 * 
			 * Attr rowIndex = doc.createAttribute("id"); rowIndex.setValue("" +
			 * j); Row.setAttributeNode(rowIndex);
			 * 
			 * for (int k = 0; k < 3; k++) {
			 * 
			 * Element Column = doc.createElement("Column");
			 * 
			 * Attr columnIndex = doc.createAttribute("id");
			 * columnIndex.setValue("" + k);
			 * Column.setAttributeNode(columnIndex);
			 * 
			 * Element Piece = doc.createElement("Piece");
			 * 
			 * Element Color = doc.createElement("Color");
			 * Piece.appendChild(Color);
			 * 
			 * Element Shape = doc.createElement("Shape");
			 * Piece.appendChild(Shape);
			 * 
			 * Column.appendChild(Piece); Row.appendChild(Column); }
			 * Solution.appendChild(Row); }
			 * 
			 * // Add Clues Element Clues = doc.createElement("Clues");
			 * Level.appendChild(Clues); for (int l = 0; l < 4; l++) { // Create
			 * Clue Element Clue = doc.createElement("Clue");
			 * 
			 * Attr clueIndex = doc.createAttribute("id"); clueIndex.setValue(""
			 * + l); Clue.setAttributeNode(clueIndex);
			 * 
			 * // Add Rows for (int m = 0; m < 3; m++) {
			 * 
			 * Element Row = doc.createElement("Row"); Attr rowIndex =
			 * doc.createAttribute("id"); rowIndex.setValue("" + m);
			 * Row.setAttributeNode(rowIndex);
			 * 
			 * // Add Columns for (int n = 0; n < 3; n++) { Element Column =
			 * doc.createElement("Column"); Attr columnIndex =
			 * doc.createAttribute("id"); Column.setAttributeNode(columnIndex);
			 * 
			 * Element Piece = doc.createElement("Piece"); Element Color =
			 * doc.createElement("Color"); Element Shape =
			 * doc.createElement("Shape");
			 * 
			 * Piece.appendChild(Color); Piece.appendChild(Shape);
			 * 
			 * Column.appendChild(Piece); Row.appendChild(Column);
			 * Clue.appendChild(Row); }
			 * 
			 * } Clues.appendChild(Clue); } }
			 */
		}
		// write the content into xml file
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);

		// new File("res/Levels.xml")
		StreamResult result = new StreamResult(new PrintWriter(
				new FileOutputStream(new File("res/Levels.xml"), false)));
		transformer.transform(source, result);

	}

	public static void main(String args[]) throws TransformerException,
			FileNotFoundException {
		try {
			init();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
