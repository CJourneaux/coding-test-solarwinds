package com.solarwindsmsp.chess;

public class Pawn extends Piece {

    public Pawn(PieceColor pieceColor, int xCoordinate, int yCoordinate, ChessBoard chessboard) {
        super(pieceColor, xCoordinate, yCoordinate, chessboard);
        this.pieceType = PieceType.PAWN;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void move(MovementType movementType, int newX, int newY) {
        throw new UnsupportedOperationException("Need to implement Pawn.Move()") ;
    }

   
}
