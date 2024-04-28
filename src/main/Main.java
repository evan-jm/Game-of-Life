package main;

public class Main {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        Board board = new Board(rows, cols);
        board.addRandomCells(50);
        while(true) {
            try {
                board.display();
                Thread.sleep(1000);
                board.run();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}