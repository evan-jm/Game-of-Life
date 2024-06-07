package org.example;

import org.example.display.Frame;

public class Main {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;

        Frame frame = new Frame(rows, cols);
        frame.run();
    }
}
