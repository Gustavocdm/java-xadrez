package br.com.gustavomelo.xadrez.factories;

import br.com.gustavomelo.xadrez.enums.Cor;
import br.com.gustavomelo.xadrez.models.Bispo;
import br.com.gustavomelo.xadrez.models.Peca;
import br.com.gustavomelo.xadrez.utils.Posicao;

public class BispoFactory extends PecaFactory {

	@Override
	public Peca criarPecaBrancaNaPosicao(Posicao posicao) {
		return new Bispo(Cor.BRANCA, posicao);
	}

	@Override
	public Peca criarPecaPretaNaPosicao(Posicao posicao) {
		return new Bispo(Cor.PRETA, posicao);
	}
}
