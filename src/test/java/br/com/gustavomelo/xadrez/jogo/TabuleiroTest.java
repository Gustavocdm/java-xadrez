package br.com.gustavomelo.xadrez.jogo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.gustavomelo.xadrez.exceptions.CasaPossuiPecaException;
import br.com.gustavomelo.xadrez.factories.PeaoFactory;
import br.com.gustavomelo.xadrez.models.Peca;
import br.com.gustavomelo.xadrez.utils.Posicao;

public class TabuleiroTest {
	private Tabuleiro tabuleiro = new Tabuleiro();
	
	@Test
	public void adicionarPecaAoTabuleiro_deveLancarCasaPossuiPecaException_seJaExistiPecaNaCasa() {
		Peca peaoBranco = new PeaoFactory().criarPecaBrancaNaPosicao(new Posicao(1, 1));
		
		tabuleiro.adicionarPecaAoTabuleiro(peaoBranco);
		
		Peca peaoPreto = new PeaoFactory().criarPecaPretaNaPosicao(new Posicao(1, 1));
		
		assertThrows(CasaPossuiPecaException.class, () -> {
			tabuleiro.adicionarPecaAoTabuleiro(peaoPreto);
		});
	}
	
	@Test
	public void adicionarPecaAoTabuleiro_deveAdicionarPecaAoTabuleiro_sePosicaoValida() {
		Peca peaoBranco = new PeaoFactory().criarPecaBrancaNaPosicao(new Posicao(1, 1));
		
		tabuleiro.adicionarPecaAoTabuleiro(peaoBranco);
		Peca pecaDaPosicaoEspecificada = tabuleiro.getTabuleiro()[0][0];
				
		assertEquals(peaoBranco, pecaDaPosicaoEspecificada);
	}
}
