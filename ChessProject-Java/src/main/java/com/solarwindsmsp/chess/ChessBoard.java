package com.solarwindsmsp.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Piece[][] pieces;

    public ChessBoard() {
        pieces = new Piece[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(PieceType pieceType, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
    	
//    	if (!isEmptyPosition(xCoordinate, yCoordinate)) {
//    		throw new UnsupportedOperationException("The position is already filled.");
//    	}
    	
    	switch (pieceType) {
	    	case PAWN:
	    		this.pieces[xCoordinate][yCoordinate] = new Pawn(pieceColor, xCoordinate, yCoordinate, this);
	    		break;
			default:
				throw new UnsupportedOperationException("Need to implement ChessBoard.addPiece() for the type " + pieceType);
    	}
    }
    
    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
    
    public boolean isEmptyPosition(int xCoordinate, int yCoordinate) {
    	Piece currentPosition = this.pieces[xCoordinate][yCoordinate];
    	return currentPosition == null;
    }
}
