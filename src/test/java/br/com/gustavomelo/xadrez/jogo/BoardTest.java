package br.com.gustavomelo.xadrez.jogo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.gustavomelo.xadrez.exceptions.SquareHoldsAPieceException;
import br.com.gustavomelo.xadrez.factories.PawnFactory;
import br.com.gustavomelo.xadrez.models.Piece;
import br.com.gustavomelo.xadrez.utils.Position;

public class BoardTest {
	private Board board = new Board();
	
	@Test
	public void addPieceToBoard_shouldThrowSquareHoldsaPieceException_ifThereIsAPieceInSquare() {
		Piece whitePawn = new PawnFactory().createWhitePieceInPosition(new Position(1, 1));
		
		board.addPieceToBoard(whitePawn);
		
		Piece blackPawn = new PawnFactory().createBlackPieceInPosition(new Position(1, 1));
		
		assertThrows(SquareHoldsAPieceException.class, () -> {
			board.addPieceToBoard(blackPawn);
		});
	}
	
	@Test
	public void addPieceToBoard_shouldAddPieceToBoard_ifItsAValidPosition() {
		Piece whitePawn = new PawnFactory().createWhitePieceInPosition(new Position(1, 1));
		
		board.addPieceToBoard(whitePawn);
		Piece specificBoardPosition = board.getBoard()[0][0];
				
		assertEquals(whitePawn, specificBoardPosition);
	}
}
