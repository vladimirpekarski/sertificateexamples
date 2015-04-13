package patterns.correctfirstexample;

import java.util.Observable;

public class Circle extends Observable {
    private Point center;
    private int radius;

    public Circle(int x, int y, int radius) {
        center = new Point(x, y);
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
        setChanged();
        notifyObservers();
    }

    public void setRadius(int radius) {
        this.radius = radius;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Circle{center=" + center + ", radius=" + radius +'}';
    }
}
