package test;

import graphicshape.Shape;

public class TestColor {
    public static void main(String[] args) {
        Shape.Color white = new Shape.Color(255, 255, 255);
        System.out.println("White color has value:" + white);
    }
}
