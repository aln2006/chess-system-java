package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "♜";
    }

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }
}
