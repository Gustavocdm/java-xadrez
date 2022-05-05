package br.com.gustavomelo.xadrez.exceptions;

public class CasaPossuiPecaException extends RuntimeException {
	private static final String MENSAGEM_ERRO = "Esta casa já possui uma peça!";
	
	public CasaPossuiPecaException() {
		super(MENSAGEM_ERRO);
	}
}
