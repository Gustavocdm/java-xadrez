package br.com.gustavomelo.xadrez.utils;

import static br.com.gustavomelo.xadrez.utils.Posicao.POSICAO_MAXIMA_PERMITIDA;
import static br.com.gustavomelo.xadrez.utils.Posicao.POSICAO_MINIMA_PERMITIDA;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.gustavomelo.xadrez.exceptions.PosicaoInvalidaException;

public class PosicaoTest {
	private static final int POSICAO_ABAIXO_DO_MINIMO = POSICAO_MINIMA_PERMITIDA - 1;
	private static final int POSICAO_ACIMA_DO_MAXIMO = POSICAO_MAXIMA_PERMITIDA + 1;
	private static final int POSICAO_VALIDA = 1;
	
	@Test
	public void construtor_deveLancarPosicaoInvalidaException_seLinhaPassadaForMenorQueOPermitido() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_ABAIXO_DO_MINIMO, POSICAO_VALIDA);
		});
	}
	
	@Test
	public void construtor_deveLancarPosicaoInvalidaException_seLinhaPassadaForMaiorQueOPermitido() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_VALIDA, POSICAO_ACIMA_DO_MAXIMO);
		});
	}
	
	@Test
	public void construtor_deveLancarPosicaoInvalidaException_seColunaPassadaForMenorQueOPermitido() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_ABAIXO_DO_MINIMO, POSICAO_VALIDA);
		});
	}
	
	@Test
	public void construtor_deveLancarPosicaoInvalidaException_seColunaPassadaForMaiorQueOPermitido() throws PosicaoInvalidaException {
		assertThrows(PosicaoInvalidaException.class, () -> {
			new Posicao(POSICAO_VALIDA, POSICAO_ACIMA_DO_MAXIMO);
		});
	}
	
	@Test
	public void construtor_deveSerInstanciadoComSucesso_seLinhaEColunaPassadosForemValido() throws PosicaoInvalidaException {
		assertDoesNotThrow(() -> {
			new Posicao(POSICAO_VALIDA, POSICAO_VALIDA);
		});
	}
}
