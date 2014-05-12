package XMLParsing;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import display_components.Piece;

public class PieceAdapter extends XmlAdapter<AdaptedPiece, Piece> {

	@Override
	public Piece unmarshal(AdaptedPiece v) throws Exception {
		return new Piece(v.getColor(), v.getShape());
	}

	@Override
	public AdaptedPiece marshal(Piece v) throws Exception {
		AdaptedPiece adaptedPiece = new AdaptedPiece();
		adaptedPiece.setColor(v.getColorString());
		adaptedPiece.setShape(v.getShape());
		adaptedPiece.setRow("" + v.getRow());
		adaptedPiece.setColumn("" + v.getColumn());
		return adaptedPiece;
		
	}

}
