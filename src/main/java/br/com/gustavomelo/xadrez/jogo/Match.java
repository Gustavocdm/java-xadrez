package br.com.gustavomelo.xadrez.jogo;

import static br.com.gustavomelo.xadrez.enums.Color.WHITE;
import static br.com.gustavomelo.xadrez.enums.Color.BLACK;

import br.com.gustavomelo.xadrez.enums.Color;

public class Match {
	private Color turn = WHITE;
	
	private void changeTurn() {
		if (turn == WHITE) {
			turn = BLACK;
		}
		else {
			turn = WHITE;
		}
	}
	
	public Color getTurn() {
		return turn;
	}
}
