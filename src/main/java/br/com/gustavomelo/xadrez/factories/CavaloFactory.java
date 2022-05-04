package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.enums.Cor;
import br.com.gustavomelo.xadrez.models.Cavalo;
import br.com.gustavomelo.xadrez.models.Peca;
import br.com.gustavomelo.xadrez.utils.Posicao;

public class CavaloFactory extends PecaFactory {

	@Override
	public Peca criarPecaBrancaNaPosicao(Posicao posicao) {
		return new Cavalo(Cor.BRANCA, posicao);
	}

	@Override
	public Peca criarPecaPretaNaPosicao(Posicao posicao) {
		return new Cavalo(Cor.PRETA, posicao);
	}
}
