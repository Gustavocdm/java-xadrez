package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.enums.Color;
import br.com.gustavomelo.xadrez.models.Piece;
import br.com.gustavomelo.xadrez.models.Queen;
import br.com.gustavomelo.xadrez.utils.Position;

public class QueenFactory extends PieceFactory {

	@Override
	public Piece createWhitePieceInPosition(Position position) {
		return new Queen(Color.WHITE, position);
	}

	@Override
	public Piece createBlackPieceInPosition(Position position) {
		return new Queen(Color.BLACK, position);
	}
}
