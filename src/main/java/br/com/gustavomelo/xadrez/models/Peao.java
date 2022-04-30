package br.com.gustavomelo.xadrez.models;

import br.com.gustavomelo.xadrez.enums.Cor;
import br.com.gustavomelo.xadrez.utils.Posicao;

public class Peao extends Peca {
	
	public Peao(Cor cor, Posicao posicao) {
		super(cor, posicao);
	}

	@Override
	public void listarMovimentosPossiveis() {
		
	}

}
