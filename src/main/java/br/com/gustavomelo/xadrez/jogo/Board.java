package br.com.gustavomelo.xadrez.jogo;

import java.util.ArrayList;
import java.util.List;

import br.com.gustavomelo.xadrez.exceptions.SquareHoldsAPieceException;
import br.com.gustavomelo.xadrez.models.Piece;

public class Board {
	private Piece[][] board = new Piece[8][8];
	private List<Piece> capturedPieces= new ArrayList<Piece>();

	public void addPieceToBoard(Piece piece) {
		int linePiece = piece.linePosition();
		int columnPiece = piece.columnPosition();
		if (isThereAPieceInPosition(linePiece, columnPiece)) {
			throw new SquareHoldsAPieceException();
		}
		board[linePiece-1][columnPiece-1] = piece;
	}
	
	private boolean isThereAPieceInPosition(int line, int column) {
		return board[line-1][column-1] != null;
	}
	
	public Piece[][] getBoard() {
		return board;
	}

	public List<Piece> getCapturedPieces() {
		return capturedPieces;
	}
}
