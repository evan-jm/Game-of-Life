package org.example.main;

import java.util.Random;

public class Board {
    private int[][] board;

    public Board(int rows, int cols) {
        board = new int[rows][cols];
    }

    public void display() {
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] == 1 ? "█ " : "  ");
            }
            System.out.println("|");
        }
    }

    public void add(int x, int y) {
        board[x][y] = 1;
    }

    public int get(int x, int y) {
        return board[x][y];
    }

    public void addRandomCells(int count) {
        int x;
        int y;
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            x = rand.nextInt(board.length);
            y = rand.nextInt(board[0].length);
            add(x, y);
        }
    }

    public void transition() {
        int[][] newBoard = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int neighbors = countNeighbors(i, j);

                if (board[i][j] == 1 && (neighbors < 2 || neighbors > 3)) {
                    newBoard[i][j] = 0; // Cell dies
                } else if (board[i][j] == 0 && neighbors == 3) {
                    newBoard[i][j] = 1; // Cell reproduces
                } else {
                    newBoard[i][j] = board[i][j]; // Cell remains the same
                }
            }
        }

        board = newBoard;
    }

    private int countNeighbors(int x, int y) {
        int count = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < board.length && j >= 0 && j < board[0].length && !(i == x && j == y)) {
                    count += board[i][j];
                }
            }
        }
        return count;
    }

    public void run(int generations) {
        for (int i = 0; i < generations; i++) {
            display();
            System.out.println("--------------------");
            transition();
        }
    }

    public void reset() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 0;
            }
        }
    }
}
