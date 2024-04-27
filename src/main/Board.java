package main;

/**
 * Class for maintaining board state and updating spaces
 */
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

    /**
     * Calculate each cells neighbor count and determine if it lives or dies
     * @param x Cell's X coordinate
     * @param y Cell's Y coordinate
     */
    public void transition(int x, int y) {
        int neighbors = 0;
        if(x >= 1 && x <= board.length - 1 && y >= 1 && y <= board[0].length - 1) {
            for(int i = x - 1; i < x + 1; i++) {
                for(int j = y - 1; j < y + 1; j++) {
                    if(board[i][j] == 1) neighbors++;
                }
            }
        }
        if(neighbors < 2 || neighbors > 3) board[x][y] = 2;
        if(board[x][y] == 2 && neighbors == 3) board[x][y] = 1;
    }

    /**
     * Run controller for continually transitioning cell status repeatedly
     */
    public void run() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != 0) transition(i, j);
            }
        }
    }

    /**
     * Resets board state to all 0's
     */
    public void reset() {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                board[i][j] = 0;
            }
        }
    }
}