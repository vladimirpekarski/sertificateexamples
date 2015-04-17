package pattern.factorydesignpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Canvas {
    private List<Shape> shapeList = new ArrayList<>();

    public void addNewShape(String shapeType) {
        Shape shape = ShapeFactory.getShape(shapeType);
        shapeList.add(shape);
    }

    public void redraw() {
        Iterator<Shape> iterator = shapeList.iterator();
        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            shape.draw();
        }
    }
}
