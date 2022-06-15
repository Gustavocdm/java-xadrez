package br.com.gustavomelo.xadrez.utils;

import static br.com.gustavomelo.xadrez.utils.Position.MAXIMUM_POSITION_ALLOWED;
import static br.com.gustavomelo.xadrez.utils.Position.MINIMUM_POSITION_ALLOWED;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.gustavomelo.xadrez.exceptions.InvalidPositionException;
import br.com.gustavomelo.xadrez.exceptions.InvalidPositionException;

public class PositionTest {
	private static final int POSITION_BELOW_MINIMUM = MINIMUM_POSITION_ALLOWED - 1;
	private static final int POSITION_ABOVE_MAXIMUM = MAXIMUM_POSITION_ALLOWED + 1;
	private static final int VALID_POSITION = 1;
	
	@Test
	public void constructor_shouldThrowInvalidPositionException_ifLinePassedIsBelowMinimumAllowed() {
		assertThrows(InvalidPositionException.class, () -> {
			new Position(POSITION_BELOW_MINIMUM, VALID_POSITION);
		});
	}
	
	@Test
	public void constructor_shouldThrowInvalidPositionException_ifLinePassedIsAboveMaximumAllowed() {
		assertThrows(InvalidPositionException.class, () -> {
			new Position(VALID_POSITION, POSITION_ABOVE_MAXIMUM);
		});
	}
	
	@Test
	public void constructor_shouldThrowInvalidPositionException_ifColumnPassedIsBelowMinimumAllowed() {
		assertThrows(InvalidPositionException.class, () -> {
			new Position(POSITION_BELOW_MINIMUM, VALID_POSITION);
		});
	}
	
	@Test
	public void constructor_shouldThrowInvalidPositionException_ifColumnPassedIsAboveMaximumAllowed() {
		assertThrows(InvalidPositionException.class, () -> {
			new Position(VALID_POSITION, POSITION_ABOVE_MAXIMUM);
		});
	}
	
	@Test
	public void constructor_shouldBeInstatiate_ifLineAndColumnAreValid() {
		assertDoesNotThrow(() -> {
			new Position(VALID_POSITION, VALID_POSITION);
		});
	}
}
