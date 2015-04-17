package pattern.abstractfactorypattern;

public class Test {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addNewShape("Circle", "DisplayFriendly");
        canvas.addNewShape("Circle", "DisplayFriendly");
        canvas.addNewShape("Rectangle", "PrinterFriendly");
        canvas.addNewShape("Rectangle", "PrinterFriendly");
        canvas.redraw();
    }
}
