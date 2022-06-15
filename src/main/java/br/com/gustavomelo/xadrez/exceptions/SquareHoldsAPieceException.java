package br.com.gustavomelo.xadrez.exceptions;

public class SquareHoldsAPieceException extends RuntimeException {
	private static final String ERROR_MESSAGE = "This square has a piece!";
	
	public SquareHoldsAPieceException() {
		super(ERROR_MESSAGE);
	}
}
