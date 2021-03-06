package point;

/**
 * Created by asus on 29.03.15.
 */
public class Point {
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }


    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (other instanceof Point) {
            Point anotherPoint = (Point) other;
            return ((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos));
        }

        return false;
    }

    public static void main(String[] args) {
        Object point1 = new Point(10, 20);
        Object point2 = new Point(50, 100);
        Object point3 = new Point(10, 20);

        System.out.println("point1 equals point2 is " + point1.equals(point2));
        System.out.println("point1 equals point3 is " + point1.equals(point3));
    }
}
