package com.solarwindsmsp.chess;

public abstract class Piece {
	
	protected PieceColor pieceColor;
	protected int xCoordinate;
    protected int yCoordinate;
    protected ChessBoard chessBoard;
	
	public abstract void move(MovementType movementType, int newX, int newY);
	
	public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }
	
    public Piece(PieceColor pieceColor, int xCoordinate, int yCoordinate, ChessBoard chessboard) {
        this.pieceColor = pieceColor;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.chessBoard = chessboard;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }
	
	@Override
    public String toString() {
        return getCurrentPositionAsString();
    }

    protected String getCurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, this.xCoordinate, this.yCoordinate, this.pieceColor);
    }

}
