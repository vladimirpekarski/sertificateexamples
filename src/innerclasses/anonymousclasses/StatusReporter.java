package innerclasses.anonymousclasses;

import graphicshape.Shape;

public class StatusReporter {
    static Shape.Color getDesciptiveColor(final Shape.Color color) {
        return new Shape.Color() {
            @Override
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        };
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = StatusReporter.getDesciptiveColor(
                new Shape.Color(80, 80, 80));

        System.out.println(descriptiveColor);
    }
}
