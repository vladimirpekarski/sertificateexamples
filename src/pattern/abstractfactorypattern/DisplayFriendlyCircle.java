package pattern.abstractfactorypattern;

public class DisplayFriendlyCircle implements DisplayFriendlyShape {
    private int xPos;
    private int yPos;
    private int radius;

    public DisplayFriendlyCircle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;

        System.out.println("DisplayFriendlyCircle constructor");
    }

    @Override
    public void draw() {
        System.out.println("DisplayFriendlyCircle draw()");
    }
}
