package br.com.gustavomelo.xadrez.utils;

import br.com.gustavomelo.xadrez.exceptions.InvalidPositionException;

public class Position {
	protected final static int MINIMUM_POSITION_ALLOWED = 1;
	protected final static int MAXIMUM_POSITION_ALLOWED = 8;
	
	private int line;
	private int column;
	
	public Position(int line, int column) {
		setLine(line);
		setColumn(column);
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		if (positionInvalida(line)) {
			throw new InvalidPositionException();
		}
		this.line = line;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		if (positionInvalida(column)) {
			throw new InvalidPositionException();
		}
		this.column = column;
	}
	
	private boolean positionInvalida(int position) {
		return position < MINIMUM_POSITION_ALLOWED || position > MAXIMUM_POSITION_ALLOWED;
	}
}
