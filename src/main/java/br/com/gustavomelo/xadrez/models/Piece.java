package br.com.gustavomelo.xadrez.models;

import br.com.gustavomelo.xadrez.enums.Color;
import br.com.gustavomelo.xadrez.utils.Position;

public abstract class Piece {
	private Color color;
	private int numberOfMoves = 0;
	private Position position;
		
	public Piece(Color color, Position position) {
		this.color = color;
		this.position = position;
	}
	
	public abstract void listPossibleMoviments();
	
	public Color getColor() {
		return color;
	}

	public int getNumberOfMoves() {
		return numberOfMoves;
	}

	public void addNumberOfMoves() {
		numberOfMoves++;
	}

	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public int linePosition() {
		return position.getLine();
	}
	
	public int columnPosition() {
		return position.getColumn();
	}
}


