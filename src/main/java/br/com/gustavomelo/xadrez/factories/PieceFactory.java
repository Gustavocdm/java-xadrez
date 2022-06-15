package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.models.Piece;
import br.com.gustavomelo.xadrez.utils.Position;

public abstract class PieceFactory {
	public abstract Piece createWhitePieceInPosition(Position position);
	public abstract Piece createBlackPieceInPosition(Position position);
}
