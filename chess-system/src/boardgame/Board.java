package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    // Construtor para inicializar o tabuleiro
    public Board(int rows, int columns) {
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
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}
