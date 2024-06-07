package org.example.display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JPanel;
import org.example.main.Board;

/**
 * Contents portrayed on frame
 */
public class Panel extends JPanel {
    private Board board;
    private int rows;
    private int cols;

    public Panel(int rows, int cols, Board board) {
        this.rows = rows;
        this.cols = cols;
        this.board = board;
        GridLayout gridLayout = new GridLayout(rows, cols);
        setLayout(gridLayout);
        board.addRandomCells(rows * cols / 4);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
    }

    private void drawBoard(Graphics g) {
        int cellSize = 20;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board.get(i, j) == 1) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                g.setColor(Color.LIGHT_GRAY);
                g.drawRect(j * cellSize, i * cellSize, cellSize, cellSize);
            }
        }
    }
}
