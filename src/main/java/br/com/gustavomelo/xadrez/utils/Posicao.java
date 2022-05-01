package br.com.gustavomelo.xadrez.utils;

import br.com.gustavomelo.xadrez.exceptions.PosicaoInvalidaException;

public class Posicao {
	protected final static int POSICAO_MINIMA_PERMITIDA = 1;
	protected final static int POSICAO_MAXIMA_PERMITIDA = 8;
	
	private int linha;
	private int coluna;
	
	public Posicao(int linha, int coluna) throws PosicaoInvalidaException {
		setLinha(linha);
		setColuna(coluna);
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) throws PosicaoInvalidaException {
		if (posicaoInvalida(linha)) {
			throw new PosicaoInvalidaException();
		}
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) throws PosicaoInvalidaException {
		if (posicaoInvalida(coluna)) {
			throw new PosicaoInvalidaException();
		}
		this.coluna = coluna;
	}
	
	private boolean posicaoInvalida(int posicao) {
		return posicao < POSICAO_MINIMA_PERMITIDA || posicao > POSICAO_MAXIMA_PERMITIDA;
	}
}
