package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.enums.Color;
import br.com.gustavomelo.xadrez.models.Pawn;
import br.com.gustavomelo.xadrez.models.Piece;
import br.com.gustavomelo.xadrez.utils.Position;

public class PawnFactory extends PieceFactory {

	@Override
	public Piece createWhitePieceInPosition(Position position) {
		return new Pawn(Color.WHITE, position);
	}

	@Override
	public Piece createBlackPieceInPosition(Position position) {
		return new Pawn(Color.BLACK, position);
	}
}
