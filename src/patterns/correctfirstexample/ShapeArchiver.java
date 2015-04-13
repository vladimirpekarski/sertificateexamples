package patterns.correctfirstexample;

import java.util.Observable;
import java.util.Observer;

public class ShapeArchiver implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ShapeArchiver::update");
    }
}
