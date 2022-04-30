package br.com.gustavomelo.xadrez.models;

import br.com.gustavomelo.xadrez.enums.Cor;
import br.com.gustavomelo.xadrez.utils.Posicao;

public abstract class Peca {
	private Cor cor;
	private int numeroDeJogadas = 0;
	private Posicao posicao;
		
	public Peca(Cor cor, Posicao posicao) {
		this.cor = cor;
		this.posicao = posicao;
	}
	
	public abstract void mover();
	
	public Cor getCor() {
		return cor;
	}

	public int getNumeroDeJogadas() {
		return numeroDeJogadas;
	}

	public void adicionarNumeroDeJogada() {
		numeroDeJogadas++;
	}

	public Posicao getPosicao() {
		return posicao;
	}
}


