package graphicshape;

/**
 * Created by v.pekarsky on 26.03.15.
 */
abstract public class Shape {
    private Shape parentShape;
    protected int color;

    public abstract double area();

    public Shape getParentShape() {
        return parentShape;
    }

    public void setParentShape(Shape parentShape) {
        this.parentShape = parentShape;
    }
}
