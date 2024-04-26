public class Board {
    /**
     * Global matrix for storing board contents
     */
    private int[][] board;

    /**
     * Constructs Board based on input number of rows and columns
     * @param rows Number of rows in Board
     * @param cols Number of columns in Board
     */
    public Board(int rows, int cols) {
        board = new int[rows][cols];
    }

    /**
     * Displays current board in terminal
     */
    public void display() {
        for(int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for(int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    /**
     * Adds a cell to the board at the coordinates of the cell
     * @param x Cell's X coordinate
     * @param y Cell's Y coordinate
     */
    public void add(int x, int y) {
        board[x][y] = 1;
    }
}