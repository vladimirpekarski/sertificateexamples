package patterns.wrongfirstexample;

public class Point {
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public String toString() {
        return "(" + xPos + ", " + yPos + ")";
    }
}
