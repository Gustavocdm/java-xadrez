package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.enums.Color;
import br.com.gustavomelo.xadrez.models.Piece;
import br.com.gustavomelo.xadrez.models.Hook;
import br.com.gustavomelo.xadrez.utils.Position;

public class HookFactory extends PieceFactory {

	@Override
	public Piece createWhitePieceInPosition(Position position) {
		return new Hook(Color.WHITE, position);
	}

	@Override
	public Piece createBlackPieceInPosition(Position position) {
		return new Hook(Color.BLACK, position);
	}
}
