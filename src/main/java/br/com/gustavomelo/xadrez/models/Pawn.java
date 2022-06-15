package br.com.gustavomelo.xadrez.models;

import br.com.gustavomelo.xadrez.enums.Color;
import br.com.gustavomelo.xadrez.utils.Position;

public class Pawn extends Piece {
	
	public Pawn(Color color, Position position) {
		super(color, position);
	}

	@Override
	public void listPossibleMoviments() {
		
	}

}
