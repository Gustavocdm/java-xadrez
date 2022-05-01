package br.com.gustavomelo.xadrez.exceptions;

public class PosicaoInvalidaException extends Exception {
	private final static String MENSAGEM_ERRO = "Essa não é uma posição válida!";

	public PosicaoInvalidaException() {
		super(MENSAGEM_ERRO);
	}	
}
