package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    // Construtor para inicializar o tabuleiro
    public Board(int rows, int columns) {
        if (rows <1 || columns < 1){
            throw new BoardException("Error creating board: there must to be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns]; // Inicializa a matriz de peças
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Piece piece(int row, int column) {
        if (!positionExistis(row, column)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if (!positionExistis(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void PlacePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("There is already a piece in this position");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;

    }

    private boolean positionExistis(int row, int column){
       return row>=0 && row < rows && column >= 0 && column <= columns;

    }

    public boolean positionExistis(Position position){
        return positionExistis(position.getRow(), position.getColumn());

    }

    public boolean thereIsAPiece(Position position){
        if (!positionExistis(position)){
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }
}
