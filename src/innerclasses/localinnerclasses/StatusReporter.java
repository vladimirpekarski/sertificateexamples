package innerclasses.localinnerclasses;

import graphicshape.Shape;

public class StatusReporter {
    static Shape.Color getDesciptiveColor(final Shape.Color color) {
        class DescriptiveColor extends Shape.Color {
            @Override
            public String toString() {
                return "You selected a color with RGB values" + color;
            }
        }

        return new DescriptiveColor();
    }

    public static void main(String[] args) {
        Shape.Color descriptiveColor = StatusReporter.getDesciptiveColor(
                new Shape.Color(0, 0, 0));

        System.out.println(descriptiveColor);
    }
}
