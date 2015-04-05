package innerclasses.innerclasses;

public class Circle {
    class Point {
        private int xPos;
        private int yPos;

        public Point(int xPos, int yPos) {
            this.xPos = xPos;
            this.yPos = yPos;
        }

        @Override
        public String toString() {
            return "(" + xPos + "," + yPos + ")";
        }
    }

    private Point center;
    private int radius;
    public Circle(int x, int y, int radius) {
        center = this.new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "mid point = " + center + " and radius = " + radius;
    }

    public static void main(String[] args) {
        System.out.println(new Circle(10, 10, 20));
    }
}
