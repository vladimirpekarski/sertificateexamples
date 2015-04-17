package pattern.abstractfactorypattern;

public class DisplayFriendlyRectangle implements DisplayFriendlyShape {
    private int length;
    private int height;

    public DisplayFriendlyRectangle(int length, int height) {
        this.length = length;
        this.height = height;

        System.out.println("DisplayFriendlyRectangle constructor");
    }

    @Override
    public void draw() {
        System.out.println("DisplayFriendlyRectangle draw(");
    }
}
