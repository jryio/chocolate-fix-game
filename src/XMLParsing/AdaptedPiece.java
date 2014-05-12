package XMLParsing;

import java.awt.Color;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Levels")
public class AdaptedPiece {
	
	private Color color;
	private String shape;
	private int row;
	private int column;

	@XmlElement(name = "Color")
	public Color getColor() {
		return color;
	}

	public void setColor(String c) {
		
		switch (c) {
		case "B": // Sets color to Pink
			this.color = Color.decode("#411711");
			break;
		case "T": // Sets color to Brown
			this.color = Color.decode("#cac596");
			break;
		case "P":
			this.color = Color.decode("#b42e66");
			break;
		default: // Sets color to transparent in case of null or "" value
			this.color = new Color(0, 0, 0, 0);
			break;
		}
	}

	@XmlElement(name = "Shape")
	public String getShape() {

		return shape;
	}

	public void setShape(String s) {
		switch (s) {
		case "S":
			this.shape = "Sqaure";
			break;
		case "C":
			this.shape = "Cirlce";
			break;
		case "T":
			this.shape = "Triangle";
			break;
		default: // Sets value to null
			this.shape = null;
			break;
		}
	}
	
	@XmlAttribute(name = "x")
	public int getRow(){
		return row;
	}
	
	public void setRow(String x){
		this.row = Integer.parseInt(x);
	}
	
	@XmlAttribute(name = "y")
	public int getColumn(){
		return column;
	}
	
	public void setColumn(String y){
		this.column = Integer.parseInt(y);
	}

}
