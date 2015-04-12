package graphicshape;

abstract public class Shape implements Rollable{
    private Shape parentShape;
    protected int color;

    public static class Color {
        int red;
        int green;
        int blue;

        public Color() {
            this(0, 0, 0);
        }

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        @Override
        public String toString() {
            return " red = " + red + "; green = " + green + "; blue = " + blue;
        }
    }

    public abstract double area();

    public Shape getParentShape() {
        return parentShape;
    }

    final public void setParentShape(Shape parentShape) {
        this.parentShape = parentShape;
    }
}
