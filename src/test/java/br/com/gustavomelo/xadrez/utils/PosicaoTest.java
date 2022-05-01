package br.com.gustavomelo.xadrez.utils;

import static br.com.gustavomelo.xadrez.utils.Posicao.POSICAO_MAXIMA_PERMITIDA;
import static br.com.gustavomelo.xadrez.utils.Posicao.POSICAO_MINIMA_PERMITIDA;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.gustavomelo.xadrez.exceptions.PosicaoInvalidaException;

public class PosicaoTest {
	private static final int POSICAO_ABAIXO_DO_MINIMO = POSICAO_MINIMA_PERMITIDA - 1;
	private static final int POSICAO_ACIMA_DO_MAXIMO = POSICAO_MAXIMA_PERMITIDA + 1;
	private static final int POSICAO_VALIDA = 1;
	
	@Test
	@DisplayName("Deve lançar exceção se linha passada no construtor for menor que o mínimo permitido")
	public void linhaMenorInvalidaExceptionTest() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_ABAIXO_DO_MINIMO, POSICAO_VALIDA);
		});
	}
	
	@Test
	@DisplayName("Deve lançar exceção se linha passada no construtor for maior que o máximo permitido")
	public void linhaMaiorInvalidaExceptionTest() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_VALIDA, POSICAO_ACIMA_DO_MAXIMO);
		});
	}
	
	@Test
	@DisplayName("Deve lançar exceção se coluna passada no construtor for menor que o mínimo permitido")
	public void colunaMenorInvalidaExceptionTest() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_ABAIXO_DO_MINIMO, POSICAO_VALIDA);
		});
	}
	
	@Test
	@DisplayName("Deve lançar exceção se coluna passada no construtor for maior que o máximo permitido")
	public void colunaMaiorInvalidaExceptionTest() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_VALIDA, POSICAO_ACIMA_DO_MAXIMO);
		});
	}
	
	@Test
	@DisplayName("Deve construir Posicao com sucesso se linha e coluna forem corretos")
	public void construirComSucesso() throws PosicaoInvalidaException {
		assertDoesNotThrow(() -> {
			new Posicao(POSICAO_VALIDA, POSICAO_VALIDA);
		});
	}
}
