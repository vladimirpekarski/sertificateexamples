package collections.hashcode;

public class Circle {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        if (obj instanceof Circle) {
            Circle that = (Circle) obj;
            if ((this.xPos == that.xPos) && (this.yPos == that.yPos)
                    && (this.radius == that.radius)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (7 * xPos) ^ (11 * yPos) ^ (53 * yPos);
    }
}
