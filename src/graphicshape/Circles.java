package graphicshape;

/**
 * Created by v.pekarsky on 26.03.15.
 */
public class Circles {

    void getArea() {
        Circle circle = new Circle();
        circle.area(); //public
        circle.fillColor();//method with default access

        Circle c1 = new Circle(10, 10, 10);
        c1.fillColor(0, 255, 255);

        Circle c2 = new Circle(50, 100, 5);
        c2.fillColor(0.5f, 0.5f, 0.5f);
    }
}
