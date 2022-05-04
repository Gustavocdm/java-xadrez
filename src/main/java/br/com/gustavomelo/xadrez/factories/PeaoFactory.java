package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.enums.Cor;
import br.com.gustavomelo.xadrez.models.Peao;
import br.com.gustavomelo.xadrez.models.Peca;
import br.com.gustavomelo.xadrez.utils.Posicao;

public class PeaoFactory extends PecaFactory {

	@Override
	public Peca criarPecaBrancaNaPosicao(Posicao posicao) {
		return new Peao(Cor.BRANCA, posicao);
	}

	@Override
	public Peca criarPecaPretaNaPosicao(Posicao posicao) {
		return new Peao(Cor.PRETA, posicao);
	}
}
