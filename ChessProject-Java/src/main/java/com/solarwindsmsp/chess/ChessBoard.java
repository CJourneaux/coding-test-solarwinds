package com.solarwindsmsp.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    
    public static int MAX_NB_PAWNS = 8;

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
    	return xCoordinate > 0 && xCoordinate < MAX_BOARD_WIDTH && yCoordinate > 0 && yCoordinate < MAX_BOARD_HEIGHT;
    }
    
    public boolean isEmptyPosition(int xCoordinate, int yCoordinate) {
    	Piece currentPosition = this.pieces[xCoordinate][yCoordinate];
    	return currentPosition == null;
    }
    
    public int getNumberOfPieces (PieceType pieceType, PieceColor pieceColor) {
    	int total = 0;
    	for (int i = 0; i < MAX_BOARD_WIDTH; i++) {
    		for (int j = 0; j < MAX_BOARD_HEIGHT; j++) {
    			Piece piece = this.pieces[i][j];
    			if (piece.getPieceType() == pieceType && piece.getPieceColor() == pieceColor) {
    				total++;
    			}
    		}
    	}
    	return total;
    }
}
