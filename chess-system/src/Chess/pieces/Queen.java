package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "♛";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        p.setValues(position.getRow()-1, position.getColumn());

        //above
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()-1);
        }
        if (getBoard().positionExistis(p)&& isThereOpponentPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;

        }

        //left

        p.setValues(position.getColumn()-1, position.getRow());
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;
            p.setValues(position.getRow(), position.getColumn() - 1);
        }
        if (getBoard().positionExistis(p)&& isThereOpponentPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;

        }

        //right

        p.setValues(position.getColumn()+1, position.getRow());
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;
            p.setValues(position.getRow(), position.getColumn() + 1);
        }
        if (getBoard().positionExistis(p)&& isThereOpponentPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;

        }

        //Down

        p.setValues(position.getColumn()+1, position.getRow());
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()+1);
        }
        if (getBoard().positionExistis(p)&& isThereOpponentPiece(p)){
            mat [p.getRow()][p.getColumn()] = true;

        }

        //nw
        p.setValues(position.getRow() - 1, position.getColumn() - 1);
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(position.getRow() - 1, position.getColumn() - 1);
        }
        if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        //ne
        p.setValues(position.getRow() - 1, position.getColumn() + 1);
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }
        if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        //se

        p.setValues(position.getRow() + 1, position.getColumn() + 1);
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(position.getRow() + 1, position.getColumn() + 1);
        }
        if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        //sw

        p.setValues(position.getRow() + 1, position.getColumn() - 1);
        while (getBoard().positionExistis(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(position.getRow() + 1, position.getColumn() - 1);

        }
        if (getBoard().positionExistis(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;

        }

        return mat;
    }
}
