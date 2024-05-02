package org.example;
import static org.junit.Assert.assertEquals;
import org.example.main.Board;
import org.junit.Test;
import org.junit.Before;

public class BoardTest {
    Board board;

    @Before
    public void setup() {
        board = new Board(10, 10);
    }

    @Test
    public void testAdd() {
        int x = 0;
        int y = 1;
        board.add(x, y);
        assertEquals(1, board.get(x, y));
    }
}