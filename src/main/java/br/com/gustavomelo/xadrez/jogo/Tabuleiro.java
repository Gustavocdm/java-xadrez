package br.com.gustavomelo.xadrez.jogo;

import java.util.ArrayList;
import java.util.List;

import br.com.gustavomelo.xadrez.exceptions.CasaPossuiPecaException;
import br.com.gustavomelo.xadrez.models.Peca;

public class Tabuleiro {
	private Peca[][] tabuleiro = new Peca[8][8];
	private List<Peca> pecasCapturadas = new ArrayList<Peca>();

	public void adicionarPecaAoTabuleiro(Peca peca) {
		int linhaPeca = peca.posicaoLinha();
		int colunaPeca = peca.posicaoColuna();
		if (existePecaNoTabuleiroNaPosicao(linhaPeca, colunaPeca)) {
			throw new CasaPossuiPecaException();
		}
		tabuleiro[linhaPeca-1][colunaPeca-1] = peca;
	}
	
	private boolean existePecaNoTabuleiroNaPosicao(int linha, int coluna) {
		return tabuleiro[linha-1][coluna-1] != null;
	}
	
	public Peca[][] getTabuleiro() {
		return tabuleiro;
	}

	public List<Peca> getPecasCapturadas() {
		return pecasCapturadas;
	}
}
