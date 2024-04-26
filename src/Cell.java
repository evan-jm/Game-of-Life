public class Cell {
    private int x;
    private int y;

    /**
     * @param x Cell's X coordinate
     * @param y Cell's Y coordinate
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return Cell's X coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * @return Cell's Y coordinate
     */
    public int getY() {
        return y;
    }
}
