package org.example.display;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.example.main.Board;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Generates frame and contents for GUI
 */
public class Frame extends JFrame {
    private Board board;

    public Frame(int rows, int cols) {
        board = new Board(rows, cols);
        setLayout(new BorderLayout());
        this.setTitle("Game of Life");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize((cols * 50), rows * 50);
        Panel panel = new Panel(rows, cols, board);
        this.add(panel);
        JButton nextGenButton = new JButton("Next Generation");
        nextGenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board.transition();
                panel.repaint();
            }
        });
        add(nextGenButton, BorderLayout.SOUTH);
    }

    public void run() {
        this.setVisible(true);
    }
}