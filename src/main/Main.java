package main;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(10, 10);
        board.add(1, 2);
        board.add(4, 2);
        board.add(5, 2);
        board.add(2, 2);
        board.add(1, 3);
        board.display();
        while(true) {
            try {
                System.out.println();
                Thread.sleep(1000);
                board.run();
                board.display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}