package br.com.gustavomelo.xadrez.models;

import br.com.gustavomelo.xadrez.enums.Cor;

public abstract class Peca {
	private Cor cor;
	private int numeroDeJogadas = 0;
		
	public Peca(Cor cor) {
		this.cor = cor;
	}
	
	public abstract void mover();
	
	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public int getNumeroDeJogadas() {
		return numeroDeJogadas;
	}

	public void adicionarNumeroDeJogada() {
		numeroDeJogadas++;
	}
}
