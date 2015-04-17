package pattern.abstractfactorypattern;

public class PrinterFriendlyRectangle implements PrinterFriendlyShape {
    private int lenght;
    private int height;

    public PrinterFriendlyRectangle(int lenght, int height) {
        this.lenght = lenght;
        this.height = height;

        System.out.println("PrinterFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("PrinterFriendlyRectangle draw()");
    }
}
