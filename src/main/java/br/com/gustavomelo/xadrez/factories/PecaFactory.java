package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.models.Peca;
import br.com.gustavomelo.xadrez.utils.Posicao;

public abstract class PecaFactory {
	public abstract Peca criarPecaBrancaNaPosicao(Posicao posicao);
	public abstract Peca criarPecaPretaNaPosicao(Posicao posicao);
}
