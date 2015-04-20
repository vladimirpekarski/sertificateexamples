package collections.hashcode;

import java.util.HashSet;
import java.util.Set;

public class TestCircle {
    public static void main(String[] args) {
        Set<Circle> circleSet = new HashSet<>();
        circleSet.add(new Circle(10, 20, 5));
        System.out.println(circleSet.contains(new Circle(10, 20, 5)));
        System.out.println(new Circle(10, 20, 5).hashCode());
        System.out.println(new Circle(10, 20, 5).hashCode());
    }
}
