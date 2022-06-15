package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.enums.Color;
import br.com.gustavomelo.xadrez.models.Knight;
import br.com.gustavomelo.xadrez.models.Piece;
import br.com.gustavomelo.xadrez.utils.Position;

public class KnightFactory extends PieceFactory {

	@Override
	public Piece createWhitePieceInPosition(Position position) {
		return new Knight(Color.WHITE, position);
	}

	@Override
	public Piece createBlackPieceInPosition(Position position) {
		return new Knight(Color.BLACK, position);
	}
}
