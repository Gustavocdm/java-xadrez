package br.com.gustavomelo.xadrez.models;

import br.com.gustavomelo.xadrez.enums.Cor;
import br.com.gustavomelo.xadrez.utils.Posicao;

public class Cavalo extends Peca {

	public Cavalo(Cor cor, Posicao posicao) {
		super(cor, posicao);
	}

	@Override
	public void listarMovimentosPossiveis() {

	}

}
