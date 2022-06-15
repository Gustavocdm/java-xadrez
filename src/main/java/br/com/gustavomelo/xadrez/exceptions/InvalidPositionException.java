package br.com.gustavomelo.xadrez.exceptions;

public class InvalidPositionException extends RuntimeException {
	private final static String ERROR_MESSAGE = "That's not a valid position!";

	public InvalidPositionException() {
		super(ERROR_MESSAGE);
	}	
}
